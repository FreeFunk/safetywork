package com.edgedo.config;

import com.edgedo.common.base.Constant;
import com.edgedo.common.base.annotation.Pass;
import com.edgedo.common.util.ObjectUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

@Component
public class MyCommandLineRunner implements CommandLineRunner {


	@Value("${controller.scanPackage}")
	private String scanPackage;

	private String[] jwtUnFilterUrls = {"/admin/sysUser/login"};

	@Override
	public void run(String... args) throws Exception {
		doScanner(scanPackage);
		Set<String> urlAndMethodSet  =new HashSet<>();
		for (String aClassName: Constant.METHOD_URL_SET) {
			Class<?> clazz = Class.forName(aClassName);
			String baseUrl = "";
			String[] classUrl ={};
			if(!ObjectUtil.isEmpty(clazz.getAnnotation(RequestMapping.class))){
				classUrl=clazz.getAnnotation(RequestMapping.class).value();
			}
			Method[] methods = clazz.getMethods();
			for (Method method:methods) {
				if(method.isAnnotationPresent(Pass.class)){
					String [] methodUrl = null;
					StringBuilder sb  =new StringBuilder();
					if(!ObjectUtil.isEmpty(method.getAnnotation(PostMapping.class))){
						methodUrl=method.getAnnotation(PostMapping.class).value();
						if(ObjectUtil.isEmpty(methodUrl)){
							methodUrl=method.getAnnotation(PostMapping.class).path();
						}
						baseUrl=getRequestUrl(classUrl, methodUrl, sb,"POST");
					}else if(!ObjectUtil.isEmpty(method.getAnnotation(GetMapping.class))){
						methodUrl=method.getAnnotation(GetMapping.class).value();
						if(ObjectUtil.isEmpty(methodUrl)){
							methodUrl=method.getAnnotation(GetMapping.class).path();
						}
						baseUrl=getRequestUrl(classUrl, methodUrl, sb,"GET");
					}else if(!ObjectUtil.isEmpty(method.getAnnotation(DeleteMapping.class))){
						methodUrl=method.getAnnotation(DeleteMapping.class).value();
						if(ObjectUtil.isEmpty(methodUrl)){
							methodUrl=method.getAnnotation(DeleteMapping.class).path();
						}
						baseUrl=getRequestUrl(classUrl, methodUrl, sb,"DELETE");
					}else if(!ObjectUtil.isEmpty(method.getAnnotation(PutMapping.class))){
						methodUrl=method.getAnnotation(PutMapping.class).value();
						if(ObjectUtil.isEmpty(methodUrl)){
							methodUrl=method.getAnnotation(PutMapping.class).path();
						}
						baseUrl=getRequestUrl(classUrl, methodUrl, sb,"PUT");
					}else {
						methodUrl=method.getAnnotation(RequestMapping.class).value();
						baseUrl=getRequestUrl(classUrl, methodUrl, sb,RequestMapping.class.getSimpleName());
					}
					if(!ObjectUtil.isEmpty(baseUrl)){
						urlAndMethodSet.add(baseUrl);
					}
				}
			}
		}
		Constant.METHOD_URL_SET=urlAndMethodSet;
		for(String url : jwtUnFilterUrls ){
			Constant.METHOD_URL_SET.add(url+":--:RequestMapping");
		}

	}

	private String  getRequestUrl(String[] classUrl, String[] methodUrl, StringBuilder sb,String requestName) {
//		sb.append("/api/v1");
		if(!ObjectUtil.isEmpty(classUrl)){
            for (String url:classUrl) {
                sb.append(url+"/");
            }
        }
		for (String url:methodUrl) {
            sb.append(url);
        }
        if(sb.toString().endsWith("/")){
			sb.deleteCharAt(sb.length()-1);
		}
		return sb.toString().replaceAll("/+", "/")+":--:"+requestName;
	}

	private void doScanner(String packageName) {
		//????????????.?????????/
		URL url  =this.getClass().getClassLoader().getResource(packageName.replaceAll("\\.", "/"));
		// ??????????????????
		if(StringUtils.countMatches(url.getFile(), ".jar")>0){
			boolean recursive=true;
			JarFile jar;
			// ??????jar
			try {
				jar = ((JarURLConnection) url.openConnection())
						.getJarFile();
				// ??????jar??? ?????????????????????
				Enumeration<JarEntry> entries = jar.entries();
				while (entries.hasMoreElements()) {
					// ??????jar?????????????????? ??????????????? ?????????jar????????????????????? ???META-INF?????????
					JarEntry entry = entries.nextElement();
					String name = entry.getName();
					// ????????????/?????????
					if (name.charAt(0) == '/') {
						// ????????????????????????
						name = name.substring(1);
					}
					// ??????????????????????????????????????????
					if (name.startsWith(packageName.replaceAll("\\.","/"))) {
						int idx = name.lastIndexOf('/');
						// ?????????"/"?????? ????????????
						if (idx != -1) {
							// ???????????? ???"/"?????????"."
							packageName = name.substring(0, idx)
									.replace('/', '.');
						}
						// ???????????????????????? ??????????????????
						if ((idx != -1) || recursive) {
							// ???????????????.class?????? ??????????????????
							if (name.endsWith(".class")
									&& !entry.isDirectory()) {
								// ???????????????".class" ?????????????????????
								String className = name.substring(
										packageName.length() + 1, name
												.length() - 6);
								try {
									// ?????????classes
									Constant.METHOD_URL_SET.add(Class
											.forName(packageName + '.'
													+ className).getName());
								} catch (ClassNotFoundException e) {
									e.printStackTrace();
								}
							}
						}
					}
				}
				return;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		File dir = new File(url.getFile());
		for (File file : dir.listFiles()) {
			if(file.isDirectory()){
				//???????????????
				doScanner(packageName+"."+file.getName());
			}else{
				String className =packageName +"." +file.getName().replace(".class", "");
				Constant.METHOD_URL_SET.add(className);
			}
		}
	}

}

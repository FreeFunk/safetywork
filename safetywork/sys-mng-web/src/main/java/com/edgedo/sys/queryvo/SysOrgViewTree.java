package com.edgedo.sys.queryvo;



import java.util.ArrayList;
import java.util.List;

public class SysOrgViewTree extends SysOrgView{


	private String title;

	private String checkArr;

	private boolean last;

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle() {
		this.title = this.getOrgName();
	}

	public void setTitle1(String title) {
		this.title = title;
	}

	public String getCheckArr() {
		return checkArr;
	}

	public void setCheckArr(String checkArr) {
		this.checkArr = checkArr;
	}

	private List<SysOrgViewTree> children = new ArrayList<SysOrgViewTree>();

	public List<SysOrgViewTree> getChildren() {
		return children;
	}

	public void setChildren(List<SysOrgViewTree> children) {
		this.children = children;
	}

}

package com.edgedo.sys.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

@TableName("bigdata_beidou_comp")
public class BigdataBeidouComp implements Serializable{
	
		
	/**
	 * 属性描述:主键
	 */
	@TableField(value="ID",exist=true)
	java.lang.String id;
	
	/**
	 * 属性描述:运营商名
	 */
	@TableField(value="COMP_NAME",exist=true)
	java.lang.String compName;
	
	/**
	 * 属性描述:创建时间
	 */
	@TableField(value="CREATE_TIME",exist=true)
	java.util.Date createTime;
	
	/**
	 * 属性描述:签名key
	 */
	@TableField(value="SING_KEY",exist=true)
	java.lang.String singKey;
	
	/**
	 * 属性描述:ip白名单
	 */
	@TableField(value="IP_ADDRESS",exist=true)
	java.lang.String ipAddress;
	
	/**
	 * 属性描述:状态0启用,1停用
	 */
	@TableField(value="COMP_STATE",exist=true)
	java.lang.String compState;
	
	/**
	 * 属性描述:ip809Address
	 */
	@TableField(value="IP_809_ADDRESS",exist=true)
	java.lang.String ip809Address;
	
	/**
	 * 属性描述:上次联通时间
	 */
	@TableField(value="LAST_UP_TIME",exist=true)
	java.util.Date lastUpTime;
	
	/**
	 * 属性描述:平台标识(主动安全，)
	 */
	@TableField(value="COMP_FLAG",exist=true)
	java.lang.String compFlag;
	
	/**
	 * 属性描述:运营商车辆类型
	 */
	@TableField(value="COMP_CAR_TYPE",exist=true)
	java.lang.String compCarType;
	
	/**
	 * 属性描述:liveIp
	 */
	@TableField(value="LIVE_IP",exist=true)
	java.lang.String liveIp;
	
	/**
	 * 属性描述:livePort
	 */
	@TableField(value="LIVE_PORT",exist=true)
	java.lang.Integer livePort;
	
	/**
	 * 属性描述:liveType
	 */
	@TableField(value="LIVE_TYPE",exist=true)
	java.lang.String liveType;
	
	
	
	
	
	
	public java.lang.String getId(){
		return this.id;
	}
	
	public void setId(java.lang.String id){
		this.id=id;
	}
	
	
	public java.lang.String getCompName(){
		return this.compName;
	}
	
	public void setCompName(java.lang.String compName){
		this.compName=compName;
	}
	
	
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime=createTime;
	}
	
	
	public java.lang.String getSingKey(){
		return this.singKey;
	}
	
	public void setSingKey(java.lang.String singKey){
		this.singKey=singKey;
	}
	
	
	public java.lang.String getIpAddress(){
		return this.ipAddress;
	}
	
	public void setIpAddress(java.lang.String ipAddress){
		this.ipAddress=ipAddress;
	}
	
	
	public java.lang.String getCompState(){
		return this.compState;
	}
	
	public void setCompState(java.lang.String compState){
		this.compState=compState;
	}
	
	
	public java.lang.String getIp809Address(){
		return this.ip809Address;
	}
	
	public void setIp809Address(java.lang.String ip809Address){
		this.ip809Address=ip809Address;
	}
	
	
	public java.util.Date getLastUpTime(){
		return this.lastUpTime;
	}
	
	public void setLastUpTime(java.util.Date lastUpTime){
		this.lastUpTime=lastUpTime;
	}
	
	
	public java.lang.String getCompFlag(){
		return this.compFlag;
	}
	
	public void setCompFlag(java.lang.String compFlag){
		this.compFlag=compFlag;
	}
	
	
	public java.lang.String getCompCarType(){
		return this.compCarType;
	}
	
	public void setCompCarType(java.lang.String compCarType){
		this.compCarType=compCarType;
	}
	
	
	public java.lang.String getLiveIp(){
		return this.liveIp;
	}
	
	public void setLiveIp(java.lang.String liveIp){
		this.liveIp=liveIp;
	}
	
	
	public java.lang.Integer getLivePort(){
		return this.livePort;
	}
	
	public void setLivePort(java.lang.Integer livePort){
		this.livePort=livePort;
	}
	
	
	public java.lang.String getLiveType(){
		return this.liveType;
	}
	
	public void setLiveType(java.lang.String liveType){
		this.liveType=liveType;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", compName=").append(compName);			
			sb.append(", createTime=").append(createTime);			
			sb.append(", singKey=").append(singKey);			
			sb.append(", ipAddress=").append(ipAddress);			
			sb.append(", compState=").append(compState);			
			sb.append(", ip809Address=").append(ip809Address);			
			sb.append(", lastUpTime=").append(lastUpTime);			
			sb.append(", compFlag=").append(compFlag);			
			sb.append(", compCarType=").append(compCarType);			
			sb.append(", liveIp=").append(liveIp);			
			sb.append(", livePort=").append(livePort);			
			sb.append(", liveType=").append(liveType);			
        sb.append("]");
        return sb.toString();
    }

   
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        BigdataBeidouComp other = (BigdataBeidouComp) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getCompName() == null ? other.getId() == null : this.getCompName().equals(other.getCompName()))		
				        		&&(this.getCreateTime() == null ? other.getId() == null : this.getCreateTime().equals(other.getCreateTime()))		
				        		&&(this.getSingKey() == null ? other.getId() == null : this.getSingKey().equals(other.getSingKey()))		
				        		&&(this.getIpAddress() == null ? other.getId() == null : this.getIpAddress().equals(other.getIpAddress()))		
				        		&&(this.getCompState() == null ? other.getId() == null : this.getCompState().equals(other.getCompState()))		
				        		&&(this.getIp809Address() == null ? other.getId() == null : this.getIp809Address().equals(other.getIp809Address()))		
				        		&&(this.getLastUpTime() == null ? other.getId() == null : this.getLastUpTime().equals(other.getLastUpTime()))		
				        		&&(this.getCompFlag() == null ? other.getId() == null : this.getCompFlag().equals(other.getCompFlag()))		
				        		&&(this.getCompCarType() == null ? other.getId() == null : this.getCompCarType().equals(other.getCompCarType()))		
				        		&&(this.getLiveIp() == null ? other.getId() == null : this.getLiveIp().equals(other.getLiveIp()))		
				        		&&(this.getLivePort() == null ? other.getId() == null : this.getLivePort().equals(other.getLivePort()))		
				        		&&(this.getLiveType() == null ? other.getId() == null : this.getLiveType().equals(other.getLiveType()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getCompName() == null) ? 0 : getCompName().hashCode());		
		        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());		
		        result = prime * result + ((getSingKey() == null) ? 0 : getSingKey().hashCode());		
		        result = prime * result + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());		
		        result = prime * result + ((getCompState() == null) ? 0 : getCompState().hashCode());		
		        result = prime * result + ((getIp809Address() == null) ? 0 : getIp809Address().hashCode());		
		        result = prime * result + ((getLastUpTime() == null) ? 0 : getLastUpTime().hashCode());		
		        result = prime * result + ((getCompFlag() == null) ? 0 : getCompFlag().hashCode());		
		        result = prime * result + ((getCompCarType() == null) ? 0 : getCompCarType().hashCode());		
		        result = prime * result + ((getLiveIp() == null) ? 0 : getLiveIp().hashCode());		
		        result = prime * result + ((getLivePort() == null) ? 0 : getLivePort().hashCode());		
		        result = prime * result + ((getLiveType() == null) ? 0 : getLiveType().hashCode());		
		;
        return result;
    }

}

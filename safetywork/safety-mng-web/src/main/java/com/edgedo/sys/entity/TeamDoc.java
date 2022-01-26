package com.edgedo.sys.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

@TableName("team_doc")
public class TeamDoc implements Serializable{
	
		
	/**
	 * 属性描述:主键
	 */
	@TableField(value="ID",exist=true)
	java.lang.String id;
	
	/**
	 * 属性描述:创建时间
	 */
	@TableField(value="CREATE_TIME",exist=true)
	java.util.Date createTime;
	
	/**
	 * 属性描述:车队ID
	 */
	@TableField(value="TEAM_ID",exist=true)
	java.lang.String teamId;
	
	/**
	 * 属性描述:车队名
	 */
	@TableField(value="TEAM_NAME",exist=true)
	java.lang.String teamName;

	/**
	 * 属性描述:车队名
	 */
	@TableField(value="TEAM_TYPE",exist=true)
	java.lang.String teamType;
	
	/**
	 * 属性描述:车辆总数
	 */
	@TableField(value="CAR_SUM_NUM",exist=true)
	java.lang.Integer carSumNum;
	
	/**
	 * 属性描述:确认率
	 */
	@TableField(value="CONFIRM_RATE",exist=true)
	java.math.BigDecimal confirmRate;
	
	/**
	 * 属性描述:确认总数
	 */
	@TableField(value="CONFIRM_NUM",exist=true)
	java.lang.Integer confirmNum;
	
	/**
	 * 属性描述:未完成工作
	 */
	@TableField(value="UN_TASK_WORK",exist=true)
	java.lang.Integer unTaskWork;
	
	/**
	 * 属性描述:更新时间
	 */
	@TableField(value="UPDATE_TIME",exist=true)
	java.util.Date updateTime;


	public String getTeamType() {
		return teamType;
	}

	public void setTeamType(String teamType) {
		this.teamType = teamType;
	}

	public java.lang.String getId(){
		return this.id;
	}
	
	public void setId(java.lang.String id){
		this.id=id;
	}
	
	
	public java.util.Date getCreateTime(){
		return this.createTime;
	}
	
	public void setCreateTime(java.util.Date createTime){
		this.createTime=createTime;
	}
	
	
	public java.lang.String getTeamId(){
		return this.teamId;
	}
	
	public void setTeamId(java.lang.String teamId){
		this.teamId=teamId;
	}
	
	
	public java.lang.String getTeamName(){
		return this.teamName;
	}
	
	public void setTeamName(java.lang.String teamName){
		this.teamName=teamName;
	}
	
	
	public java.lang.Integer getCarSumNum(){
		return this.carSumNum;
	}
	
	public void setCarSumNum(java.lang.Integer carSumNum){
		this.carSumNum=carSumNum;
	}
	
	
	public java.math.BigDecimal getConfirmRate(){
		return this.confirmRate;
	}
	
	public void setConfirmRate(java.math.BigDecimal confirmRate){
		this.confirmRate=confirmRate;
	}
	
	
	public java.lang.Integer getConfirmNum(){
		return this.confirmNum;
	}
	
	public void setConfirmNum(java.lang.Integer confirmNum){
		this.confirmNum=confirmNum;
	}
	
	
	public java.lang.Integer getUnTaskWork(){
		return this.unTaskWork;
	}
	
	public void setUnTaskWork(java.lang.Integer unTaskWork){
		this.unTaskWork=unTaskWork;
	}
	
	
	public java.util.Date getUpdateTime(){
		return this.updateTime;
	}
	
	public void setUpdateTime(java.util.Date updateTime){
		this.updateTime=updateTime;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", createTime=").append(createTime);			
			sb.append(", teamId=").append(teamId);			
			sb.append(", teamName=").append(teamName);			
			sb.append(", carSumNum=").append(carSumNum);			
			sb.append(", confirmRate=").append(confirmRate);			
			sb.append(", confirmNum=").append(confirmNum);			
			sb.append(", unTaskWork=").append(unTaskWork);			
			sb.append(", updateTime=").append(updateTime);			
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
        TeamDoc other = (TeamDoc) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getCreateTime() == null ? other.getId() == null : this.getCreateTime().equals(other.getCreateTime()))		
				        		&&(this.getTeamId() == null ? other.getId() == null : this.getTeamId().equals(other.getTeamId()))		
				        		&&(this.getTeamName() == null ? other.getId() == null : this.getTeamName().equals(other.getTeamName()))		
				        		&&(this.getCarSumNum() == null ? other.getId() == null : this.getCarSumNum().equals(other.getCarSumNum()))		
				        		&&(this.getConfirmRate() == null ? other.getId() == null : this.getConfirmRate().equals(other.getConfirmRate()))		
				        		&&(this.getConfirmNum() == null ? other.getId() == null : this.getConfirmNum().equals(other.getConfirmNum()))		
				        		&&(this.getUnTaskWork() == null ? other.getId() == null : this.getUnTaskWork().equals(other.getUnTaskWork()))		
				        		&&(this.getUpdateTime() == null ? other.getId() == null : this.getUpdateTime().equals(other.getUpdateTime()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());		
		        result = prime * result + ((getTeamId() == null) ? 0 : getTeamId().hashCode());		
		        result = prime * result + ((getTeamName() == null) ? 0 : getTeamName().hashCode());		
		        result = prime * result + ((getCarSumNum() == null) ? 0 : getCarSumNum().hashCode());		
		        result = prime * result + ((getConfirmRate() == null) ? 0 : getConfirmRate().hashCode());		
		        result = prime * result + ((getConfirmNum() == null) ? 0 : getConfirmNum().hashCode());		
		        result = prime * result + ((getUnTaskWork() == null) ? 0 : getUnTaskWork().hashCode());		
		        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());		
		;
        return result;
    }

}

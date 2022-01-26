package com.edgedo.sys.entity;

import java.io.Serializable;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.annotations.TableField;

@TableName("bigdata_safety_warning")
public class BigdataSafetyWarning implements Serializable{
	
		
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
	 * 属性描述:运营商id
	 */
	@TableField(value="COMP_ID",exist=true)
	java.lang.String compId;
	
	/**
	 * 属性描述:运营商名称
	 */
	@TableField(value="COMP_NAME",exist=true)
	java.lang.String compName;
	
	/**
	 * 属性描述:业务主键
	 */
	@TableField(value="B_ID",exist=true)
	java.lang.String bid;
	
	/**
	 * 属性描述:终端设备编号
	 */
	@TableField(value="DEVICENO",exist=true)
	java.lang.String deviceno;
	
	/**
	 * 属性描述:终端SIM卡号
	 */
	@TableField(value="SIM",exist=true)
	java.lang.String sim;
	
	/**
	 * 属性描述:经度
	 */
	@TableField(value="LON",exist=true)
	java.math.BigDecimal lon;
	
	/**
	 * 属性描述:纬度
	 */
	@TableField(value="LAT",exist=true)
	java.math.BigDecimal lat;
	
	/**
	 * 属性描述:速度
	 */
	@TableField(value="SPEED",exist=true)
	java.math.BigDecimal speed;
	
	/**
	 * 属性描述:方向
	 */
	@TableField(value="DIRECTION",exist=true)
	java.math.BigDecimal direction;
	
	/**
	 * 属性描述:开始时间
	 */
	@TableField(value="STARTTIME",exist=true)
	java.util.Date starttime;
	
	/**
	 * 属性描述:结束时间
	 */
	@TableField(value="ENDTIME",exist=true)
	java.util.Date endtime;
	
	/**
	 * 属性描述:车牌号
	 */
	@TableField(value="CAR_PLATE_NUM",exist=true)
	java.lang.String carPlateNum;
	
	/**
	 * 属性描述:车牌颜色
	 */
	@TableField(value="CAR_PLATE_COLOR",exist=true)
	java.lang.String carPlateColor;
	
	/**
	 * 属性描述:车牌颜色文本
	 */
	@TableField(value="CAR_PLATE_COLOR_TEXT",exist=true)
	java.lang.String carPlateColorText;
	
	/**
	 * 属性描述:车架号
	 */
	@TableField(value="CAR_FRAME_NUM",exist=true)
	java.lang.String carFrameNum;
	
	/**
	 * 属性描述:车辆类型
	 */
	@TableField(value="CAR_TYPE",exist=true)
	java.lang.String carType;
	
	/**
	 * 属性描述:司机
	 */
	@TableField(value="EMP_NAME",exist=true)
	java.lang.String empName;
	
	/**
	 * 属性描述:身份证号
	 */
	@TableField(value="EMP_ID_CARD",exist=true)
	java.lang.String empIdCard;
	
	/**
	 * 属性描述:资格证号
	 */
	@TableField(value="EMP_CODE",exist=true)
	java.lang.String empCode;
	
	/**
	 * 属性描述:从业人员id
	 */
	@TableField(value="EMP_ID",exist=true)
	java.lang.String empId;
	
	/**
	 * 属性描述:所属企业ID
	 */
	@TableField(value="OWNER_TEAM_ID",exist=true)
	java.lang.String ownerTeamId;
	
	/**
	 * 属性描述:所属企业名
	 */
	@TableField(value="OWNER_TEAM_NAME",exist=true)
	java.lang.String ownerTeamName;
	
	/**
	 * 属性描述:报警子类型
	 */
	@TableField(value="WARNING_TYPE",exist=true)
	java.lang.String warningType;
	
	/**
	 * 属性描述:报警等级
	 */
	@TableField(value="WARNING_LEVEL",exist=true)
	java.lang.String warningLevel;
	
	/**
	 * 属性描述:报警详情
	 */
	@TableField(value="WARNING_INFO",exist=true)
	java.lang.String warningInfo;
	
	/**
	 * 属性描述:上传时间
	 */
	@TableField(value="UPLOAD_TIME",exist=true)
	java.util.Date uploadTime;
	
	/**
	 * 属性描述:报警状态
	 */
	@TableField(value="ALARM_STATE",exist=true)
	java.lang.String alarmState;
	
	/**
	 * 属性描述:处理结果
	 */
	@TableField(value="DETAIL_INFO",exist=true)
	java.lang.String detailInfo;
	
	/**
	 * 属性描述:处理状态
	 */
	@TableField(value="HANDLE_STATE",exist=true)
	java.lang.String handleState;
	
	/**
	 * 属性描述:处理方式
	 */
	@TableField(value="HANDLE_TYPE",exist=true)
	java.lang.String handleType;
	
	/**
	 * 属性描述:处理时间
	 */
	@TableField(value="HANDLE_TIME",exist=true)
	java.util.Date handleTime;
	
	/**
	 * 属性描述:处理人
	 */
	@TableField(value="HANDLE_PEOPLE",exist=true)
	java.lang.String handlePeople;
	
	/**
	 * 属性描述:统计日期
	 */
	@TableField(value="COUNT_DATE",exist=true)
	java.lang.Integer countDate;
	
	/**
	 * 属性描述:统计月份
	 */
	@TableField(value="COUNT_MONTH",exist=true)
	java.lang.Integer countMonth;

	/**
	 * 属性描述:省ID
	 */
	@TableField(value="PROVINCE_ID",exist=true)
	java.lang.String provinceId;

	/**
	 * 属性描述:省名
	 */
	@TableField(value="PROVINCE_NAME",exist=true)
	java.lang.String provinceName;

	/**
	 * 属性描述:城市ID
	 */
	@TableField(value="CITY_ID",exist=true)
	java.lang.String cityId;

	/**
	 * 属性描述:城市名
	 */
	@TableField(value="CITY_NAME",exist=true)
	java.lang.String cityName;

	/**
	 * 属性描述:县区ID
	 */
	@TableField(value="XIANQU_ID",exist=true)
	java.lang.String xianquId;

	/**
	 * 属性描述:县区名
	 */
	@TableField(value="XIANQU_NAME",exist=true)
	java.lang.String xianquName;

	public String getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getXianquId() {
		return xianquId;
	}

	public void setXianquId(String xianquId) {
		this.xianquId = xianquId;
	}

	public String getXianquName() {
		return xianquName;
	}

	public void setXianquName(String xianquName) {
		this.xianquName = xianquName;
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
	
	
	public java.lang.String getCompId(){
		return this.compId;
	}
	
	public void setCompId(java.lang.String compId){
		this.compId=compId;
	}
	
	
	public java.lang.String getCompName(){
		return this.compName;
	}
	
	public void setCompName(java.lang.String compName){
		this.compName=compName;
	}
	
	
	public java.lang.String getBid(){
		return this.bid;
	}
	
	public void setBid(java.lang.String bid){
		this.bid=bid;
	}
	
	
	public java.lang.String getDeviceno(){
		return this.deviceno;
	}
	
	public void setDeviceno(java.lang.String deviceno){
		this.deviceno=deviceno;
	}
	
	
	public java.lang.String getSim(){
		return this.sim;
	}
	
	public void setSim(java.lang.String sim){
		this.sim=sim;
	}
	
	
	public java.math.BigDecimal getLon(){
		return this.lon;
	}
	
	public void setLon(java.math.BigDecimal lon){
		this.lon=lon;
	}
	
	
	public java.math.BigDecimal getLat(){
		return this.lat;
	}
	
	public void setLat(java.math.BigDecimal lat){
		this.lat=lat;
	}
	
	
	public java.math.BigDecimal getSpeed(){
		return this.speed;
	}
	
	public void setSpeed(java.math.BigDecimal speed){
		this.speed=speed;
	}
	
	
	public java.math.BigDecimal getDirection(){
		return this.direction;
	}
	
	public void setDirection(java.math.BigDecimal direction){
		this.direction=direction;
	}
	
	
	public java.util.Date getStarttime(){
		return this.starttime;
	}
	
	public void setStarttime(java.util.Date starttime){
		this.starttime=starttime;
	}
	
	
	public java.util.Date getEndtime(){
		return this.endtime;
	}
	
	public void setEndtime(java.util.Date endtime){
		this.endtime=endtime;
	}
	
	
	public java.lang.String getCarPlateNum(){
		return this.carPlateNum;
	}
	
	public void setCarPlateNum(java.lang.String carPlateNum){
		this.carPlateNum=carPlateNum;
	}
	
	
	public java.lang.String getCarPlateColor(){
		return this.carPlateColor;
	}
	
	public void setCarPlateColor(java.lang.String carPlateColor){
		this.carPlateColor=carPlateColor;
	}
	
	
	public java.lang.String getCarPlateColorText(){
		return this.carPlateColorText;
	}
	
	public void setCarPlateColorText(java.lang.String carPlateColorText){
		this.carPlateColorText=carPlateColorText;
	}
	
	
	public java.lang.String getCarFrameNum(){
		return this.carFrameNum;
	}
	
	public void setCarFrameNum(java.lang.String carFrameNum){
		this.carFrameNum=carFrameNum;
	}
	
	
	public java.lang.String getCarType(){
		return this.carType;
	}
	
	public void setCarType(java.lang.String carType){
		this.carType=carType;
	}
	
	
	public java.lang.String getEmpName(){
		return this.empName;
	}
	
	public void setEmpName(java.lang.String empName){
		this.empName=empName;
	}
	
	
	public java.lang.String getEmpIdCard(){
		return this.empIdCard;
	}
	
	public void setEmpIdCard(java.lang.String empIdCard){
		this.empIdCard=empIdCard;
	}
	
	
	public java.lang.String getEmpCode(){
		return this.empCode;
	}
	
	public void setEmpCode(java.lang.String empCode){
		this.empCode=empCode;
	}
	
	
	public java.lang.String getEmpId(){
		return this.empId;
	}
	
	public void setEmpId(java.lang.String empId){
		this.empId=empId;
	}
	
	
	public java.lang.String getOwnerTeamId(){
		return this.ownerTeamId;
	}
	
	public void setOwnerTeamId(java.lang.String ownerTeamId){
		this.ownerTeamId=ownerTeamId;
	}
	
	
	public java.lang.String getOwnerTeamName(){
		return this.ownerTeamName;
	}
	
	public void setOwnerTeamName(java.lang.String ownerTeamName){
		this.ownerTeamName=ownerTeamName;
	}
	
	
	public java.lang.String getWarningType(){
		return this.warningType;
	}
	
	public void setWarningType(java.lang.String warningType){
		this.warningType=warningType;
	}
	
	
	public java.lang.String getWarningLevel(){
		return this.warningLevel;
	}
	
	public void setWarningLevel(java.lang.String warningLevel){
		this.warningLevel=warningLevel;
	}
	
	
	public java.lang.String getWarningInfo(){
		return this.warningInfo;
	}
	
	public void setWarningInfo(java.lang.String warningInfo){
		this.warningInfo=warningInfo;
	}
	
	
	public java.util.Date getUploadTime(){
		return this.uploadTime;
	}
	
	public void setUploadTime(java.util.Date uploadTime){
		this.uploadTime=uploadTime;
	}
	
	
	public java.lang.String getAlarmState(){
		return this.alarmState;
	}
	
	public void setAlarmState(java.lang.String alarmState){
		this.alarmState=alarmState;
	}
	
	
	public java.lang.String getDetailInfo(){
		return this.detailInfo;
	}
	
	public void setDetailInfo(java.lang.String detailInfo){
		this.detailInfo=detailInfo;
	}
	
	
	public java.lang.String getHandleState(){
		return this.handleState;
	}
	
	public void setHandleState(java.lang.String handleState){
		this.handleState=handleState;
	}
	
	
	public java.lang.String getHandleType(){
		return this.handleType;
	}
	
	public void setHandleType(java.lang.String handleType){
		this.handleType=handleType;
	}
	
	
	public java.util.Date getHandleTime(){
		return this.handleTime;
	}
	
	public void setHandleTime(java.util.Date handleTime){
		this.handleTime=handleTime;
	}
	
	
	public java.lang.String getHandlePeople(){
		return this.handlePeople;
	}
	
	public void setHandlePeople(java.lang.String handlePeople){
		this.handlePeople=handlePeople;
	}
	
	
	public java.lang.Integer getCountDate(){
		return this.countDate;
	}
	
	public void setCountDate(java.lang.Integer countDate){
		this.countDate=countDate;
	}
	
	
	public java.lang.Integer getCountMonth(){
		return this.countMonth;
	}
	
	public void setCountMonth(java.lang.Integer countMonth){
		this.countMonth=countMonth;
	}
	
	
	
	
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
			sb.append(", id=").append(id);			
			sb.append(", createTime=").append(createTime);			
			sb.append(", compId=").append(compId);			
			sb.append(", compName=").append(compName);			
			sb.append(", bid=").append(bid);			
			sb.append(", deviceno=").append(deviceno);			
			sb.append(", sim=").append(sim);			
			sb.append(", lon=").append(lon);			
			sb.append(", lat=").append(lat);			
			sb.append(", speed=").append(speed);			
			sb.append(", direction=").append(direction);			
			sb.append(", starttime=").append(starttime);			
			sb.append(", endtime=").append(endtime);			
			sb.append(", carPlateNum=").append(carPlateNum);			
			sb.append(", carPlateColor=").append(carPlateColor);			
			sb.append(", carPlateColorText=").append(carPlateColorText);			
			sb.append(", carFrameNum=").append(carFrameNum);			
			sb.append(", carType=").append(carType);			
			sb.append(", empName=").append(empName);			
			sb.append(", empIdCard=").append(empIdCard);			
			sb.append(", empCode=").append(empCode);			
			sb.append(", empId=").append(empId);			
			sb.append(", ownerTeamId=").append(ownerTeamId);			
			sb.append(", ownerTeamName=").append(ownerTeamName);			
			sb.append(", warningType=").append(warningType);			
			sb.append(", warningLevel=").append(warningLevel);			
			sb.append(", warningInfo=").append(warningInfo);			
			sb.append(", uploadTime=").append(uploadTime);			
			sb.append(", alarmState=").append(alarmState);			
			sb.append(", detailInfo=").append(detailInfo);			
			sb.append(", handleState=").append(handleState);			
			sb.append(", handleType=").append(handleType);			
			sb.append(", handleTime=").append(handleTime);			
			sb.append(", handlePeople=").append(handlePeople);			
			sb.append(", countDate=").append(countDate);			
			sb.append(", countMonth=").append(countMonth);			
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
        BigdataSafetyWarning other = (BigdataSafetyWarning) that;
        boolean flag = true;
        return  flag
        		&&(this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))		
				        		&&(this.getCreateTime() == null ? other.getId() == null : this.getCreateTime().equals(other.getCreateTime()))		
				        		&&(this.getCompId() == null ? other.getId() == null : this.getCompId().equals(other.getCompId()))		
				        		&&(this.getCompName() == null ? other.getId() == null : this.getCompName().equals(other.getCompName()))		
				        		&&(this.getBid() == null ? other.getId() == null : this.getBid().equals(other.getBid()))		
				        		&&(this.getDeviceno() == null ? other.getId() == null : this.getDeviceno().equals(other.getDeviceno()))		
				        		&&(this.getSim() == null ? other.getId() == null : this.getSim().equals(other.getSim()))		
				        		&&(this.getLon() == null ? other.getId() == null : this.getLon().equals(other.getLon()))		
				        		&&(this.getLat() == null ? other.getId() == null : this.getLat().equals(other.getLat()))		
				        		&&(this.getSpeed() == null ? other.getId() == null : this.getSpeed().equals(other.getSpeed()))		
				        		&&(this.getDirection() == null ? other.getId() == null : this.getDirection().equals(other.getDirection()))		
				        		&&(this.getStarttime() == null ? other.getId() == null : this.getStarttime().equals(other.getStarttime()))		
				        		&&(this.getEndtime() == null ? other.getId() == null : this.getEndtime().equals(other.getEndtime()))		
				        		&&(this.getCarPlateNum() == null ? other.getId() == null : this.getCarPlateNum().equals(other.getCarPlateNum()))		
				        		&&(this.getCarPlateColor() == null ? other.getId() == null : this.getCarPlateColor().equals(other.getCarPlateColor()))		
				        		&&(this.getCarPlateColorText() == null ? other.getId() == null : this.getCarPlateColorText().equals(other.getCarPlateColorText()))		
				        		&&(this.getCarFrameNum() == null ? other.getId() == null : this.getCarFrameNum().equals(other.getCarFrameNum()))		
				        		&&(this.getCarType() == null ? other.getId() == null : this.getCarType().equals(other.getCarType()))		
				        		&&(this.getEmpName() == null ? other.getId() == null : this.getEmpName().equals(other.getEmpName()))		
				        		&&(this.getEmpIdCard() == null ? other.getId() == null : this.getEmpIdCard().equals(other.getEmpIdCard()))		
				        		&&(this.getEmpCode() == null ? other.getId() == null : this.getEmpCode().equals(other.getEmpCode()))		
				        		&&(this.getEmpId() == null ? other.getId() == null : this.getEmpId().equals(other.getEmpId()))		
				        		&&(this.getOwnerTeamId() == null ? other.getId() == null : this.getOwnerTeamId().equals(other.getOwnerTeamId()))		
				        		&&(this.getOwnerTeamName() == null ? other.getId() == null : this.getOwnerTeamName().equals(other.getOwnerTeamName()))		
				        		&&(this.getWarningType() == null ? other.getId() == null : this.getWarningType().equals(other.getWarningType()))		
				        		&&(this.getWarningLevel() == null ? other.getId() == null : this.getWarningLevel().equals(other.getWarningLevel()))		
				        		&&(this.getWarningInfo() == null ? other.getId() == null : this.getWarningInfo().equals(other.getWarningInfo()))		
				        		&&(this.getUploadTime() == null ? other.getId() == null : this.getUploadTime().equals(other.getUploadTime()))		
				        		&&(this.getAlarmState() == null ? other.getId() == null : this.getAlarmState().equals(other.getAlarmState()))		
				        		&&(this.getDetailInfo() == null ? other.getId() == null : this.getDetailInfo().equals(other.getDetailInfo()))		
				        		&&(this.getHandleState() == null ? other.getId() == null : this.getHandleState().equals(other.getHandleState()))		
				        		&&(this.getHandleType() == null ? other.getId() == null : this.getHandleType().equals(other.getHandleType()))		
				        		&&(this.getHandleTime() == null ? other.getId() == null : this.getHandleTime().equals(other.getHandleTime()))		
				        		&&(this.getHandlePeople() == null ? other.getId() == null : this.getHandlePeople().equals(other.getHandlePeople()))		
				        		&&(this.getCountDate() == null ? other.getId() == null : this.getCountDate().equals(other.getCountDate()))		
				        		&&(this.getCountMonth() == null ? other.getId() == null : this.getCountMonth().equals(other.getCountMonth()))		
				;
    }

  
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());		
		        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());		
		        result = prime * result + ((getCompId() == null) ? 0 : getCompId().hashCode());		
		        result = prime * result + ((getCompName() == null) ? 0 : getCompName().hashCode());		
		        result = prime * result + ((getBid() == null) ? 0 : getBid().hashCode());		
		        result = prime * result + ((getDeviceno() == null) ? 0 : getDeviceno().hashCode());		
		        result = prime * result + ((getSim() == null) ? 0 : getSim().hashCode());		
		        result = prime * result + ((getLon() == null) ? 0 : getLon().hashCode());		
		        result = prime * result + ((getLat() == null) ? 0 : getLat().hashCode());		
		        result = prime * result + ((getSpeed() == null) ? 0 : getSpeed().hashCode());		
		        result = prime * result + ((getDirection() == null) ? 0 : getDirection().hashCode());		
		        result = prime * result + ((getStarttime() == null) ? 0 : getStarttime().hashCode());		
		        result = prime * result + ((getEndtime() == null) ? 0 : getEndtime().hashCode());		
		        result = prime * result + ((getCarPlateNum() == null) ? 0 : getCarPlateNum().hashCode());		
		        result = prime * result + ((getCarPlateColor() == null) ? 0 : getCarPlateColor().hashCode());		
		        result = prime * result + ((getCarPlateColorText() == null) ? 0 : getCarPlateColorText().hashCode());		
		        result = prime * result + ((getCarFrameNum() == null) ? 0 : getCarFrameNum().hashCode());		
		        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());		
		        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());		
		        result = prime * result + ((getEmpIdCard() == null) ? 0 : getEmpIdCard().hashCode());		
		        result = prime * result + ((getEmpCode() == null) ? 0 : getEmpCode().hashCode());		
		        result = prime * result + ((getEmpId() == null) ? 0 : getEmpId().hashCode());		
		        result = prime * result + ((getOwnerTeamId() == null) ? 0 : getOwnerTeamId().hashCode());		
		        result = prime * result + ((getOwnerTeamName() == null) ? 0 : getOwnerTeamName().hashCode());		
		        result = prime * result + ((getWarningType() == null) ? 0 : getWarningType().hashCode());		
		        result = prime * result + ((getWarningLevel() == null) ? 0 : getWarningLevel().hashCode());		
		        result = prime * result + ((getWarningInfo() == null) ? 0 : getWarningInfo().hashCode());		
		        result = prime * result + ((getUploadTime() == null) ? 0 : getUploadTime().hashCode());		
		        result = prime * result + ((getAlarmState() == null) ? 0 : getAlarmState().hashCode());		
		        result = prime * result + ((getDetailInfo() == null) ? 0 : getDetailInfo().hashCode());		
		        result = prime * result + ((getHandleState() == null) ? 0 : getHandleState().hashCode());		
		        result = prime * result + ((getHandleType() == null) ? 0 : getHandleType().hashCode());		
		        result = prime * result + ((getHandleTime() == null) ? 0 : getHandleTime().hashCode());		
		        result = prime * result + ((getHandlePeople() == null) ? 0 : getHandlePeople().hashCode());		
		        result = prime * result + ((getCountDate() == null) ? 0 : getCountDate().hashCode());		
		        result = prime * result + ((getCountMonth() == null) ? 0 : getCountMonth().hashCode());		
		;
        return result;
    }

}

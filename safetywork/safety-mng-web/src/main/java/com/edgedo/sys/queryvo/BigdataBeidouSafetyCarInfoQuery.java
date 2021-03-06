package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class BigdataBeidouSafetyCarInfoQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY)
	private BigdataBeidouSafetyCarInfoView queryObj = new BigdataBeidouSafetyCarInfoView();

	private String cityId;

	private String userType;

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public BigdataBeidouSafetyCarInfoView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(BigdataBeidouSafetyCarInfoView queryObj) {
		this.queryObj = queryObj;
	}
}

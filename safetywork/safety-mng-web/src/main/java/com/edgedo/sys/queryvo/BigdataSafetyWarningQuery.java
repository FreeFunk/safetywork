package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class BigdataSafetyWarningQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private BigdataSafetyWarningView queryObj = new BigdataSafetyWarningView();

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

	public BigdataSafetyWarningView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(BigdataSafetyWarningView queryObj) {
		this.queryObj = queryObj;
	}
}

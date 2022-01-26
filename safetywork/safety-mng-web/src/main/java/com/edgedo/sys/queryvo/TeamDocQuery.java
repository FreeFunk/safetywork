package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class TeamDocQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private TeamDocView queryObj = new TeamDocView();

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

	public TeamDocView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(TeamDocView queryObj) {
		this.queryObj = queryObj;
	}
}

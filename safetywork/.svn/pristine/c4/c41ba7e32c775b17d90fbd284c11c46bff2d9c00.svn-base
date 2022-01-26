package com.edgedo.sys.queryvo;
import com.edgedo.common.base.QueryObj;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

public class BigdataAlarmRecordQuery extends QueryObj{
	@JsonSerialize(include=Inclusion.NON_EMPTY) 
	private BigdataAlarmRecordView queryObj = new BigdataAlarmRecordView();

	public BigdataAlarmRecordView getQueryObj() {
		return queryObj;
	}

	public void setQueryObj(BigdataAlarmRecordView queryObj) {
		this.queryObj = queryObj;
	}
}

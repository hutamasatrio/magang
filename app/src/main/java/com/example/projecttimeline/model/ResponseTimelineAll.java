package com.example.projecttimeline.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseTimelineAll {

	@SerializedName("data")
	private List<DataTimelineAll> data;

	@SerializedName("status")
	private boolean status;

	public void setData(List<DataTimelineAll> data){
		this.data = data;
	}

	public List<DataTimelineAll> getData(){
		return data;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"ResponseTimelineAll{" +
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
package com.example.projecttimeline.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseTimeline{

	@SerializedName("data")
	private List<DataTimeline> data;

	@SerializedName("status")
	private boolean status;

	public void setData(List<DataTimeline> data){
		this.data = data;
	}

	public List<DataTimeline> getData(){
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
			"ResponseTimeline{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
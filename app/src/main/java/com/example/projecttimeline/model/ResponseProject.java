package com.example.projecttimeline.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseProject{

	@SerializedName("data")
	private List<DataProject> data;

	@SerializedName("status")
	private boolean status;

	public void setData(List<DataProject> data){
		this.data = data;
	}

	public List<DataProject> getData(){
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
			"ResponseProject{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
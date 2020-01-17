package com.example.projecttimeline.model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseStaff{

	@SerializedName("data")
	private List<StaffItem> data;

	@SerializedName("status")
	private boolean status;

	public void setData(List<StaffItem> data){
		this.data = data;
	}

	public List<StaffItem> getData(){
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
			"ResponseStaff{" + 
			"data = '" + data + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
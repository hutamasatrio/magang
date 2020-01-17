package com.example.projecttimeline.model;

import com.google.gson.annotations.SerializedName;


public class DataTimeline {

	@SerializedName("keterangan")
	private String keterangan;

	@SerializedName("color")
	private String color;

	@SerializedName("dateTimeline")
	private String dateTimeline;

	public void setKeterangan(String keterangan){
		this.keterangan = keterangan;
	}

	public String getKeterangan(){
		return keterangan;
	}

	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setDateTimeline(String dateTimeline){
		this.dateTimeline = dateTimeline;
	}

	public String getDateTimeline(){
		return dateTimeline;
	}

	@Override
 	public String toString(){
		return 
			"DataTimeline{" +
			"keterangan = '" + keterangan + '\'' + 
			",color = '" + color + '\'' + 
			",dateTimeline = '" + dateTimeline + '\'' + 
			"}";
		}
}
package com.example.projecttimeline.model;

import com.google.gson.annotations.SerializedName;

public class DataTimelineAll {

	@SerializedName("idProject")
	private String idProject;

	@SerializedName("keterangan")
	private String keterangan;

	@SerializedName("Color")
	private String color;

	@SerializedName("dateTimeline")
	private Long dateTimeline;

	public void setIdProject(String idProject){
		this.idProject = idProject;
	}

	public String getIdProject(){
		return idProject;
	}

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

	public void setDateTimeline(Long dateTimeline){
		this.dateTimeline = dateTimeline;
	}

	public Long getDateTimeline(){
		return dateTimeline;
	}

	@Override
 	public String toString(){
		return 
			"DataTimelineAll{" +
			"idProject = '" + idProject + '\'' + 
			",keterangan = '" + keterangan + '\'' + 
			",color = '" + color + '\'' + 
			",dateTimeline = '" + dateTimeline + '\'' + 
			"}";
		}
}
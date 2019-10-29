package com.example.projecttimeline.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

public class DataProject implements Parcelable {

	@SerializedName("idProject")
	private String idProject;

	@SerializedName("keterangan")
	private String keterangan;

	@SerializedName("namaProject")
	private String namaProject;

	@SerializedName("typeProject")
	private String typeProject;

	@SerializedName("client")
	private String client;

	@SerializedName("staff")
	private String staff;

	@SerializedName("startDate")
	private String startDate;

	protected DataProject(Parcel in) {
		idProject = in.readString();
		keterangan = in.readString();
		namaProject = in.readString();
		typeProject = in.readString();
		client = in.readString();
		staff = in.readString();
		startDate = in.readString();
	}

	public static final Creator<DataProject> CREATOR = new Creator<DataProject>() {
		@Override
		public DataProject createFromParcel(Parcel in) {
			return new DataProject(in);
		}

		@Override
		public DataProject[] newArray(int size) {
			return new DataProject[size];
		}
	};

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

	public void setNamaProject(String namaProject){
		this.namaProject = namaProject;
	}

	public String getNamaProject(){
		return namaProject;
	}

	public void setTypeProject(String typeProject){
		this.typeProject = typeProject;
	}

	public String getTypeProject(){
		return typeProject;
	}

	public void setClient(String client){
		this.client = client;
	}

	public String getClient(){
		return client;
	}

	public void setStaff(String staff){
		this.staff = staff;
	}

	public String getStaff(){
		return staff;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	@Override
 	public String toString(){
		return 
			"DataProject{" +
			"idProject = '" + idProject + '\'' + 
			",keterangan = '" + keterangan + '\'' + 
			",namaProject = '" + namaProject + '\'' + 
			",typeProject = '" + typeProject + '\'' + 
			",client = '" + client + '\'' + 
			",staff = '" + staff + '\'' + 
			",startDate = '" + startDate + '\'' + 
			"}";
		}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeString(idProject);
		dest.writeString(keterangan);
		dest.writeString(namaProject);
		dest.writeString(typeProject);
		dest.writeString(client);
		dest.writeString(staff);
		dest.writeString(startDate);
	}
}
package com.example.projecttimeline.model;

import com.google.gson.annotations.SerializedName;

public class StaffItem {

	@SerializedName("password")
	private String password;

	@SerializedName("emailStaff")
	private String emailStaff;

	@SerializedName("nama")
	private String nama;

	@SerializedName("roleId")
	private String roleId;

	@SerializedName("alamat")
	private String alamat;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setEmailStaff(String emailStaff){
		this.emailStaff = emailStaff;
	}

	public String getEmailStaff(){
		return emailStaff;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNama(){
		return nama;
	}

	public void setRoleId(String roleId){
		this.roleId = roleId;
	}

	public String getRoleId(){
		return roleId;
	}

	public void setAlamat(String alamat){
		this.alamat = alamat;
	}

	public String getAlamat(){
		return alamat;
	}

	@Override
 	public String toString(){
		return 
			"StaffItem{" +
			"password = '" + password + '\'' + 
			",emailStaff = '" + emailStaff + '\'' + 
			",nama = '" + nama + '\'' + 
			",roleId = '" + roleId + '\'' + 
			",alamat = '" + alamat + '\'' + 
			"}";
		}
}
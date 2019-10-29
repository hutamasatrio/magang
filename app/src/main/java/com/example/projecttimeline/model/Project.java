package com.example.projecttimeline.model;

public class Project {

    private String NamaProject;
    private String TanggalMulaiProject;
    private String ProgressProject;
    private String NamaClient;

    public String getNamaProject() {
        return NamaProject;
    }

    public void setNamaProject(String namaProject) {
        NamaProject = namaProject;
    }

    public String getTanggalMulaiProject() {
        return TanggalMulaiProject;
    }

    public void setTanggalMulaiProject(String tanggalMulaiProject) {
        TanggalMulaiProject = tanggalMulaiProject;
    }

    public String getProgressProject() {
        return ProgressProject;
    }

    public void setProgressProject(String progressProject) {
        ProgressProject = progressProject;
    }

    public String getNamaClient() {
        return NamaClient;
    }

    public void setNamaClient(String namaClient) {
        NamaClient = namaClient;
    }

    public Project(String namaProject, String tanggalMulaiProject, String progressProject, String namaClient) {
        NamaProject = namaProject;
        TanggalMulaiProject = tanggalMulaiProject;
        ProgressProject = progressProject;
        NamaClient = namaClient;
    }
}

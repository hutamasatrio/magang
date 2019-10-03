package com.example.projecttimeline.model;

public class HomeDasboard {
    public HomeDasboard(String nama, String ci, String co, String jmlProject, String progress, String divisi) {
        Nama = nama;
        Ci = ci;
        Co = co;
        JmlProject = jmlProject;
        Progress = progress;
        Divisi = divisi;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getCi() {
        return Ci;
    }

    public void setCi(String ci) {
        Ci = ci;
    }

    public String getCo() {
        return Co;
    }

    public void setCo(String co) {
        Co = co;
    }

    public String getJmlProject() {
        return JmlProject;
    }

    public void setJmlProject(String jmlProject) {
        JmlProject = jmlProject;
    }

    public String getProgress() {
        return Progress;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public String getDivisi() {
        return Divisi;
    }

    public void setDivisi(String divisi) {
        Divisi = divisi;
    }

    private String Nama;
    private String Ci;
    private String Co;
    private String JmlProject;
    private String Progress;
    private String Divisi;

}

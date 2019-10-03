package com.example.projecttimeline.model;

public class Report {

    public Report(String nama, String divisi, String jmlProject, String performance, String month) {
        Nama = nama;
        Divisi = divisi;
        JmlProject = jmlProject;
        Performance = performance;
        Month = month;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getDivisi() {
        return Divisi;
    }

    public void setDivisi(String divisi) {
        Divisi = divisi;
    }

    public String getJmlProject() {
        return JmlProject;
    }

    public void setJmlProject(String jmlProject) {
        JmlProject = jmlProject;
    }

    public String getPerformance() {
        return Performance;
    }

    public void setPerformance(String performance) {
        Performance = performance;
    }

    public String getMonth() {
        return Month;
    }

    public void setMonth(String month) {
        Month = month;
    }

    private String Nama;
    private String Divisi;
    private String JmlProject;
    private String Performance;
    private String Month;
}

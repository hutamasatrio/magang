package com.example.projecttimeline.model;

public class Client {

    private String IdCLient;
    private String NamaClient;
    private String EmailCLient;
    private String AlamatClient;

    public Client(String idCLient, String namaClient, String emailCLient, String alamatClient, String noTelpCLient) {
        IdCLient = idCLient;
        NamaClient = namaClient;
        EmailCLient = emailCLient;
        AlamatClient = alamatClient;
        NoTelpCLient = noTelpCLient;
    }

    private String NoTelpCLient;

    public String getIdCLient() {
        return IdCLient;
    }

    public void setIdCLient(String idCLient) {
        IdCLient = idCLient;
    }

    public String getNamaClient() {
        return NamaClient;
    }

    public void setNamaClient(String namaClient) {
        NamaClient = namaClient;
    }

    public String getEmailCLient() {
        return EmailCLient;
    }

    public void setEmailCLient(String emailCLient) {
        EmailCLient = emailCLient;
    }

    public String getAlamatClient() {
        return AlamatClient;
    }

    public void setAlamatClient(String alamatClient) {
        AlamatClient = alamatClient;
    }

    public String getNoTelpCLient() {
        return NoTelpCLient;
    }

    public void setNoTelpCLient(String noTelpCLient) {
        NoTelpCLient = noTelpCLient;
    }
}

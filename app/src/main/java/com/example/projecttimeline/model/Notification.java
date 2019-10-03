package com.example.projecttimeline.model;

public class Notification {
    public Notification(String title, String subTitle, String subSubTitle) {
        Title = title;
        SubTitle = subTitle;
        SubSubTitle = subSubTitle;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubTitle() {
        return SubTitle;
    }

    public void setSubTitle(String subTitle) {
        SubTitle = subTitle;
    }

    public String getSubSubTitle() {
        return SubSubTitle;
    }

    public void setSubSubTitle(String subSubTitle) {
        SubSubTitle = subSubTitle;
    }

    private String Title;
    private String SubTitle;
    private String SubSubTitle;


}

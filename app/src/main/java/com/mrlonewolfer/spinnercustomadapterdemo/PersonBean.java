package com.mrlonewolfer.spinnercustomadapterdemo;

public class PersonBean {
    String appName,appDescription;
    int appImg;

    public PersonBean(String appName, String appDescription, int appImg) {
        this.appName = appName;
        this.appDescription = appDescription;
        this.appImg = appImg;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppDescription() {
        return appDescription;
    }

    public void setAppDescription(String appDescription) {
        this.appDescription = appDescription;
    }

    public int getAppImg() {
        return appImg;
    }

    public void setAppImg(int appImg) {
        this.appImg = appImg;
    }
}

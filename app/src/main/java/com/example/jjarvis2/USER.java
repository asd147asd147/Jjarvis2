package com.example.jjarvis2;

public class USER {
    private String userUid;
    private int userAge;
    private String userName;
    private double userHeight;
    private double userWeight;
    private double userBMI;
    private double userBMR; //기초대사량
    private double userDRC; // Daily-Recommand-Calorie
    private boolean userGender;

    public USER(){}

    public USER(String userUid, int userAge, String userName, double userHeight, double userWeight, double userBMI, double userBMR, double userDRC, boolean userGender) {
        this.userUid = userUid;
        this.userAge = userAge;
        this.userName = userName;
        this.userHeight = userHeight;
        this.userWeight = userWeight;
        this.userBMI = userBMI;
        this.userBMR = userBMR;
        this.userDRC = userDRC;
        this.userGender = userGender;
    }

    public String getUserID() {
        return userUid;
    }

    public void setUserID(String userID) {
        this.userUid = userID;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getUserHeight() {
        return userHeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public double getUserBMI() {
        return userBMI;
    }

    public void setUserBMI(double userBMI) {
        this.userBMI = userBMI;
    }

    public double getUserBMR() {
        return userBMR;
    }

    public void setUserBMR(double userBMR) {
        this.userBMR = userBMR;
    }

    public double getUserDRC() {
        return userDRC;
    }

    public void setUserDRC(double userDRC) {
        this.userDRC = userDRC;
    }

    public boolean isUserGender() {
        return userGender;
    }

    public void setUserGender(boolean userGender) {
        this.userGender = userGender;
    }
}
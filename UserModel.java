package com.example.myapplication;

import android.net.Uri;

public class UserModel {

    String name;
    String mobile;
    String imageUri;

    public UserModel(String name, String mobile, String imageUri) {
        this.name = name;
        this.mobile = mobile;
        this.imageUri = imageUri;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {

        return mobile;
    }

    public String getImageUri() {
        return imageUri;
    }
}

package com.example.reese.weatherapp.gson;

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")  //在JSON字段和Java字段之间建立映射关系
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

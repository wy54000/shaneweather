package com.shaneweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MOONRMY on 2017-06-04.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}

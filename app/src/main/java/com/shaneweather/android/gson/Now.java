package com.shaneweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by MOONRMY on 2017-06-04.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;


    }

}

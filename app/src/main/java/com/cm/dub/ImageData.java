package com.cm.dub;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Charlie on 4/21/19.
 */

public class ImageData {
    @Expose
    @SerializedName("data")
    private Image[] data;

    public Image[] getData() {
        return data;
    }
}

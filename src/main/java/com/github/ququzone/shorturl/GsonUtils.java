package com.github.ququzone.shorturl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Gson utils.
 *
 * @author Yang XuePing
 */
public class GsonUtils {
    public static final Gson DEFAULT_GSON = new GsonBuilder()
            .serializeNulls()
            .excludeFieldsWithoutExposeAnnotation()
            .setDateFormat("yyyy-MM-dd HH:mm:ss").create();
}

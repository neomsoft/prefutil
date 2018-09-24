package io.github.neomsoft.prefutil;

import android.content.Context;
import android.content.SharedPreferences;

public class PrefUtil {

    private SharedPreferences sharedPreferences;

    public PrefUtil(Context context, String prefID) {
        sharedPreferences = context.getSharedPreferences(prefID, Context.MODE_PRIVATE);
    }

    public String getString(String key, String baseValue) {
        return sharedPreferences.getString(key, baseValue);
    }

    public void setString(String key, String value) {
        sharedPreferences.edit().putString(key, value).apply();
    }

    public int getInt(String key, int baseValue) {
        return sharedPreferences.getInt(key, baseValue);
    }

    public void setInt(String key, int value) {
        sharedPreferences.edit().putInt(key, value).apply();
    }

    public boolean getBoolean(String key, boolean baseValue) {
        return sharedPreferences.getBoolean(key, baseValue);
    }

    public void setBoolean(String key, boolean value) {
        sharedPreferences.edit().putBoolean(key, value).apply();
    }
}

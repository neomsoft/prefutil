package io.github.neomsoft.prefutil;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

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

    public float getFloat(String key, float baseValue) {
        return sharedPreferences.getFloat(key, baseValue);
    }

    public void setFloat(String key, float value) {
        sharedPreferences.edit().putFloat(key, value).apply();
    }

    public long getLong(String key, long baseValue) {
        return sharedPreferences.getLong(key, baseValue);
    }

    public void setLong(String key, long value) {
        sharedPreferences.edit().putLong(key, value).apply();
    }

    public Map<String, ?> getAll() {
        return sharedPreferences.getAll();
    }

    public boolean contains(String key) {
        return sharedPreferences.contains(key);
    }

    public void remove(String key) {
        sharedPreferences.edit().remove(key).apply();
    }

    public void clear() {
        sharedPreferences.edit().clear().apply();
    }

    public SharedPreferences getSharedPreferences() {
        return sharedPreferences;
    }
}

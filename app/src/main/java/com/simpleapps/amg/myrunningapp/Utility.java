package com.simpleapps.amg.myrunningapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Angel on 5/26/2017.
 */

public class Utility {
    public static void setTheme(Context context, int theme) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putInt(context.getString(R.string.prefs_theme_key), theme).apply();
    }
    public static int getTheme(Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getInt(context.getString(R.string.prefs_theme_key), -1);
    }
}

package com.example.sdproject;

import android.content.Context;
import android.content.SharedPreferences;

public class PreConfigB {
    private static final String MY_PREFERENCE_NAME ="com.example.sdproject" ;
    private static final String PREF_TOTAL_KEY = "pref_total_key_b";

    public static void saveTotalInPrefB(Context context , int total){
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putInt(PREF_TOTAL_KEY, total);
        editor.apply();
    }

    public static int loadTotalFromPrefB(Context context){
        SharedPreferences pref = context.getSharedPreferences(MY_PREFERENCE_NAME, Context.MODE_PRIVATE);
        return pref.getInt(PREF_TOTAL_KEY,-1);
    }
}

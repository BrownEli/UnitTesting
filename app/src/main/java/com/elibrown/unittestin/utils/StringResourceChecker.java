package com.elibrown.unittestin.utils;

import android.content.Context;

public class StringResourceChecker {

    public boolean isSameString(Context context,int id,String stringToCheck){
        return context.getString(id).equals(stringToCheck);
    }
}

package com.elibrown.unittestin.utils;

import androidx.annotation.NonNull;

import com.elibrown.unittestin.models.Registration;

import java.util.ArrayList;

public class RegistrationUtil {

    private static RegistrationUtil mInstance;

    private ArrayList<String> existingUserNames;

    public static RegistrationUtil getInstance(){

        if (mInstance == null) {
            mInstance = new RegistrationUtil();
            mInstance.existingUserNames = new ArrayList<>();
            mInstance.existingUserNames.add("breezy62");
            mInstance.existingUserNames.add("eliForever");
            mInstance.existingUserNames.add("brownE");
            mInstance.existingUserNames.add("Elzareez");
            mInstance.existingUserNames.add("EBforEver62");
        }

        return mInstance;
    }

    public boolean validateRegistration(@NonNull Registration registration){

        //Check if user name is empty
        if(registration.getUserName().isEmpty())
            return false;

        //Check if user name all ready exist
        if(mInstance.existingUserNames.contains(registration.getUserName()))
            return false;

        //Check if email is empty
        if(registration.getEMail().isEmpty())
            return false;

        //Check if password is empty
        if(registration.getPassword().isEmpty())
            return false;

        //Check if password is strong enough
        if (registration.getPassword().length() < 2)
            return false;

        //Check if password match confirm password
        if(!registration.getPassword().equals(registration.getPasswordConfirm()))
            return false;

        //Return true because all fields are valid
        return true;
    }
}

package com.elibrown.unittestin.models;

public class Registration {

    private final String
            userName,
            eMail,
            password,
            passwordConfirm;

    public Registration(
            String userName,
            String eMail,
            String password,
            String passwordConfirm) {

        this.userName = userName;
        this.eMail = eMail;
        this.password = password;
        this.passwordConfirm = passwordConfirm;
    }

    public String getUserName() {
        return userName;
    }

    public String getEMail() {
        return eMail;
    }

    public String getPassword() {
        return password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }
}

package com.elibrown.unittestin.utils;

import static com.google.common.truth.Truth.assertThat;

import com.elibrown.unittestin.models.Registration;

import org.junit.Test;

public class RegistrationUtilTest {

    @Test
    public void emptyUserNameReturnsFalse(){
        Registration registration = new Registration(
                "" ,
                "eli@gmail.com",
                "123456",
                "123456"
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isFalse();
    }

    @Test
    public void userNameExistReturnsFalse(){
        Registration registration = new Registration(
                "breezy62" ,
                "eli@gmail.com",
                "123456",
                "123456"
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isFalse();
    }

    @Test
    public void emptyEmailReturnsFalse(){
        Registration registration = new Registration(
                "eliBreezy62" ,
                "",
                "123456",
                "123456"
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isFalse();
    }

    @Test
    public void emptyPasswordReturnsFalse(){
        Registration registration = new Registration(
                "eliBreezy62" ,
                "eli@gmail.com",
                "",
                ""
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isFalse();
    }

    @Test
    public void notStrongPasswordReturnsFalse(){
        Registration registration = new Registration(
                "eliBreezy62" ,
                "eli@gmail.com",
                "1",
                "1"
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isFalse();
    }

    @Test
    public void passwordDoNotMatchReturnsFalse(){
        Registration registration = new Registration(
                "eliBreezy62" ,
                "eli@gmail.com",
                "123456",
                "123654"
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isFalse();
    }


    @Test
    public void validRegistrationReturnsTrue(){
        Registration registration = new Registration(
                "eliBreezy62" ,
                "eli@gmail.com",
                "123456",
                "123456"
        );

        boolean result = RegistrationUtil.getInstance().validateRegistration(registration);

        assertThat(result).isTrue();
    }
}
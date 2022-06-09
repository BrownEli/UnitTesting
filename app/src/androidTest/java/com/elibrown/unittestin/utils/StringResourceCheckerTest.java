package com.elibrown.unittestin.utils;

import static com.google.common.truth.Truth.assertThat;
import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import com.elibrown.unittestin.R;
import org.junit.Before;
import org.junit.Test;

public class StringResourceCheckerTest {

    private StringResourceChecker stringResourceChecker;
    Context context;

    @Before
    public void setItUp(){
        stringResourceChecker = new StringResourceChecker();
        context = ApplicationProvider.getApplicationContext();
    }

    @Test
    public void isSameStringReturnsTrue(){
        boolean result = stringResourceChecker.isSameString(context, R.string.app_name,"UnitTesting");

        assertThat(result).isTrue();
    }

    @Test
    public void notSameStringReturnsFalse(){
        boolean result = stringResourceChecker.isSameString(context, R.string.app_name,"Hey Cambium");

        assertThat(result).isFalse();
    }
}
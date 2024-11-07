package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PasswordComplexityTest {
    @Test
    void verify001_Password_under_8chars(){
        Assert.assertFalse(PasswordComplexity.checkPasswordComplexity("Passwor"));
    }
    @Test
    void verify002_Password_over_8chars(){
        Assert.assertFalse(PasswordComplexity.checkPasswordComplexity("Password"));
    }
    @Test
    void verify0xx_Password_Right(){
        Assert.assertFalse(PasswordComplexity.checkPasswordComplexity("Password@123"));
    }
}

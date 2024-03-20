package com.learning.core.day10;

import org.junit.Test;

public class TestUserProfile {
    @Test(timeout = 2000)
    public void testName() {
        UserProfile userProfile = new UserProfile();
        // Test valid username
        assert(userProfile.validateUsername("JohnDoe"));
        // Test invalid username (contains digits)
        assert(!userProfile.validateUsername("John123"));
        // Test invalid username (contains special characters)
        assert(!userProfile.validateUsername("John@Doe"));
    }

    @Test(timeout = 2000)
    public void testPassword() {
        UserProfile userProfile = new UserProfile();
        // Test valid password
        assert(userProfile.validatePassword("Password1"));
        // Test invalid password (less than 8 characters)
        assert(!userProfile.validatePassword("Pass1"));
        // Test invalid password (does not contain digits)
        assert(!userProfile.validatePassword("Password"));
        // Test invalid password (does not contain alphabets)
        assert(!userProfile.validatePassword("12345678"));
        // Test invalid password (contains special characters)
        assert(!userProfile.validatePassword("Pass@word"));
    }
}

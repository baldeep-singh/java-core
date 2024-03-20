package com.learning.core.day10;

package com.learning.core.day10;

public class UserProfile {
    public boolean validateUsername(String name) {
        // Username should contain only characters (letters) and be non-empty
        return name.matches("[a-zA-Z]+") && !name.isEmpty();
    }

    public boolean validatePassword(String password) {
        // Password should be exactly 8 characters long and contain at least one letter and one digit
        return password.matches("^(?=.*[a-zA-Z])(?=.*\\d).{8}$");
    }
}

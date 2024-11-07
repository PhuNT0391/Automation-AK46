package org.example;

public class PasswordComplexity {
    public static boolean checkPasswordComplexity(String password) {
        if (password.length() <= 8) throw new IllegalArgumentException("Password should be more than 8 characters");
        if (!password.matches(".*[a-z].*"))
            throw new IllegalArgumentException("Password should be included at least 1 lowercase letter");
        if (!password.matches(".*[A-Z].*"))
            throw new IllegalArgumentException("Password should be included at least 1 uppercase letter");
        if (!password.matches(".*[!@#$%^&*()].*"))
            throw new IllegalArgumentException("Password should be included at least 1 special letter");
        if (!password.matches(".*\\d.*"))
            throw new IllegalArgumentException("Password should be included at least one digit");
        return false;
//        return password.matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()]).{9,}");

    }
}

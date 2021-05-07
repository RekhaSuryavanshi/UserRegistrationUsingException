package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String First_Name_Pattern="(^[A-Z]{1}[a-z]{2,}$)";

    public boolean checkFirstName(String fname) throws UserRegistrationException {
        try {
            boolean result = Pattern.compile(First_Name_Pattern).matcher(fname).matches();
            if (result) {
                System.out.println(fname + " is valid firstname");
            }
            return true;
        }catch (NullPointerException e) {
            throw new UserRegistrationException("please enter valid proper input");
        }
    }
}

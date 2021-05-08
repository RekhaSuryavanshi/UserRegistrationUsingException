package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String First_Name_Pattern="(^[A-Z]{1}[a-z]{2,}$)";
    private static final String Last_Name_Pattern="(^[A-Z]{1}[a-z]{2,}$)";

    public boolean checkFirstName(String fname) throws UserRegistrationException, NullPointerException {
            boolean result = Pattern.compile(First_Name_Pattern).matcher(fname).matches();
            if (result) {
                System.out.println(fname + " is valid firstname");
                return  true ;
            }
            else {
                throw new UserRegistrationException("please enter valid proper input");
            }
    }

    public boolean checkLastName(String lname) throws UserRegistrationException, NullPointerException {
        boolean result = Pattern.compile(Last_Name_Pattern).matcher(lname).matches();
        if (result) {
            System.out.println(lname + " is valid lastname");
            return  true ;
        }
        else {
            throw new UserRegistrationException("please enter valid proper input");
        }
    }
}

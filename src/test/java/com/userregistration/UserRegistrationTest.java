package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

   @Test
    public void givenNull_shouldThrowException() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result = userRegistration.checkFirstName(null);
            Assertions.assertTrue(result);
        }catch (NullPointerException e) {
            throw new UserRegistrationException("please enter not null input");
        }
    }

    @Test
    public void givenFirstname_whenNotProper_shouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result=userRegistration.checkFirstName("Re");
            Assertions.assertTrue(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirstname_whenProper_shouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.checkFirstName("Rekha");
        }catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenNullLastname_shouldThrowException() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result = userRegistration.checkLastName(null);
            Assertions.assertTrue(result);
        }catch (NullPointerException e) {
            throw new UserRegistrationException("please enter not null input");
        }
    }

    @Test
    public void givenLastname_whenNotProper_shouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result=userRegistration.checkLastName("su");
            Assertions.assertTrue(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastname_whenProper_shouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.checkLastName("Suryavanshi");
        }catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }

    @Test
    public void givenNullEmailId_shouldThrowException() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result = userRegistration.checkEmailId(null);
            Assertions.assertTrue(result);
        }catch (NullPointerException e) {
            throw new UserRegistrationException("please enter not null input");
        }
    }

    @Test
    public void givenEmailId_whenNotProper_shouldThrowException() {
        UserRegistration userRegistration = new UserRegistration();
        try {
            boolean result=userRegistration.checkEmailId("abc");
            Assertions.assertTrue(result);

        } catch (UserRegistrationException e) {
            e.printStackTrace();
        }
    }

   @Test
    public void givenEmailId_whenProper_shouldReturnValid() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = false;
        try {
            result = userRegistration.checkEmailId("abc.xyz@bl.co.in");
        }catch (UserRegistrationException e) {
            e.printStackTrace();
        }
        Assertions.assertTrue(result);
    }
}

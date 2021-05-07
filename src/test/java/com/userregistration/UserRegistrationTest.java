package com.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    @Test
   public void givenNull_shouldThrowException() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName(null);
        Assertions.assertTrue(result);
    }

    public void givenFirstname_whenProper_shouldThrowException() throws UserRegistrationException {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.checkFirstName("Rekha");
        Assertions.assertTrue(result);

    }
}

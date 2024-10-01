package org.selenium.ginandjuice.factory.data;

import net.datafaker.Faker;
import org.selenium.ginandjuice.dto.LoginDto;
import org.selenium.ginandjuice.util.Manipulation;

public class LoginData {

    private static Faker faker = new Faker();

    public static LoginDto validoLogin() {
        return new LoginDto(Manipulation.getUsername(), Manipulation.getPassword());
    }

    public static LoginDto invalidoUsernameLogin() {
        return new LoginDto(faker.internet().username(), Manipulation.getPassword());
    }

    public static LoginDto invalidoSenhaLogin() {
        return new LoginDto(Manipulation.getUsername(), faker.internet().password());
    }
}

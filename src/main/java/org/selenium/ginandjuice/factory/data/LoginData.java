package org.selenium.ginandjuice.factory.data;

import org.selenium.ginandjuice.dto.LoginDto;
import org.selenium.ginandjuice.util.Manipulation;

public class LoginData {

    public static LoginDto validLogin() {

        return new LoginDto(Manipulation.getUsername(), Manipulation.getPassword());

    }
}

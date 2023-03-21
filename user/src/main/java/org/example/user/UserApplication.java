package org.example.user;

import org.springboot.IanSpringApplication;
import org.springboot.IanSpringBootApplication;
import org.springboot.WebServerAutoConfiguration;
import org.springframework.context.annotation.Import;


@IanSpringBootApplication
public class UserApplication {

    public static void main(String[] args) {
        IanSpringApplication.run(UserApplication.class);
    }

}

package springscurityfacebooklogin.springfacebooklogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

@SpringBootApplication
@EnableOAuth2Sso // to enable single singOn oauth
public class SpringFaceBookLoginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFaceBookLoginApplication.class, args);
        System.out.println(" == spring app is running ===");
    }

}

package pl.edu.agh.iet.tsp.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bartłomiej Grochal
 */
@SpringBootApplication(scanBasePackages = {"pl.edu.agh.iet.tsp"})
public class TrueSocialPlatform {

    public static void main(String[] args) {
        SpringApplication.run(TrueSocialPlatform.class, args);
    }

}

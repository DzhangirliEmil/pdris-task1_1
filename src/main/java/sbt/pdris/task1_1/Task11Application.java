package sbt.pdris.task1_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Task11Application {

    @GetMapping("/")
    public String getUsers() {
        return "No users detected";
    }

    public static void main(String[] args) {
        SpringApplication.run(Task11Application.class, args);
    }

}

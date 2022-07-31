package kr;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableScheduling
@SpringBootApplication
public class HeapApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeapApplication.class, args);
    }


}

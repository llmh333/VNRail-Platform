package org.vnrail.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@SpringBootApplication(scanBasePackages = "org.vnrail")
@EntityScan(basePackages = "org.vnrail")
public class VnrailApplication {

    public static void main(String[] args) {
        SpringApplication.run(VnrailApplication.class, args);
    }

}

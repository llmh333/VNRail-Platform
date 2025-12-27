package org.vnrail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.vnrail")
public class VnrailApplication {
    public static void main(String[] args) {
        SpringApplication.run(VnrailApplication.class, args);
        System.out.println("🚀 VNRAIL Platform started successfully!");
    }
}

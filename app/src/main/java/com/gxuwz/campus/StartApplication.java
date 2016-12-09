package com.gxuwz.campus;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by fulunyong on 2016/12/9 10:15
 */
@SpringBootApplication
public class StartApplication extends SpringBootServletInitializer implements ExitCodeGenerator{


    public static void main(String[] args){
        SpringApplication.run(StartApplication.class, args);
    }

    public int getExitCode() {
        System.out.println("Application is over!");
        return 0;
    }
}

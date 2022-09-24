package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AbidApplication {

    public static void main(String[] args) {
        SpringApplication.run(AbidApplication.class, args);
    }

}



//        PS C:\Users\abid_> netstat -ano | findstr :8080
//        TCP    0.0.0.0:8080           0.0.0.0:0              LISTENING       8928
//        TCP    [::]:8080              [::]:0                 LISTENING       8928
//        PS C:\Users\abid_> taskkill /PID 8928 /F
//        SUCCESS: The process with PID 8928 has been terminated.
//        PS C:\Users\abid_> netstat -ano | findstr :8080
//        PS C:\Users\abid_> Windows PowerShell
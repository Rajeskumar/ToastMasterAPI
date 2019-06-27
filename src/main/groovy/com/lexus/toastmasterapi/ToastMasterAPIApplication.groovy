package com.lexus.toastmasterapi

import com.lexus.toastmasterapi.controller.APIController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer

@SpringBootApplication
class ToastMasterAPIApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        application.sources(ToastMasterAPIApplication.class)
    }

    static void main(String[] args) {
        SpringApplication.run(APIController, args)
    }
}

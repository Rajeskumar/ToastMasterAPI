package com.lexus.toastmasterapi

import com.lexus.toastmasterapi.controller.APIController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ToastMasterAPIApplication {

    static void main(String[] args) {
        SpringApplication.run(APIController, args)
    }

}

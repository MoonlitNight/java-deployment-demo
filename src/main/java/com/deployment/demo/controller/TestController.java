package com.deployment.demo.controller;

import com.deployment.demo.dto.ApiResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${app.version}")
    private String version;

    @GetMapping("/api/version")
    public ApiResponse<String> getApiVersion() {
        return new ApiResponse<>(200, "This message responds from " + version, "success");
    }

}

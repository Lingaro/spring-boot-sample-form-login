package com.example.webappboilerplate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {
    @Value("${git.commit.id.describe-short}")
    private String version;

    @GetMapping("/version")
    public String version() {
        return version;
    }
}

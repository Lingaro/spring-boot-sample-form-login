package com.example.webappboilerplate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
public class VersionController {
    @Value("${git.commit.id.describe-short}")
    private String version;

    @GetMapping("/version")
    public String version() {
        return version;
    }

    @PostMapping("/success")
    public void success(HttpServletResponse resp) throws IOException {
        resp.sendRedirect("/api/version");
    }
}

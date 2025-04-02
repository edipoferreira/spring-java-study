package com.edipof.simple_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class InfoController {

    @GetMapping("/info")
    public Map<String, String> getInfo() {
        return Collections.singletonMap("status", "running");
    }
}

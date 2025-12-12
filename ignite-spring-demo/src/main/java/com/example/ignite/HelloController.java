package com.example.ignite;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/java-app")
    public Map<String, String> hello() {
        return Map.of(
                "status", "ok",
                "message", "Hello from Viduli QA Test!"
        );
    }
}

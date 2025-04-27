package com.bradltr95;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Brad",
                        "java, springboot"
                ),
                new SoftwareEngineer(
                        1,
                        "Maddy",
                        "js, node.js, react"
                )
        );
    }
}

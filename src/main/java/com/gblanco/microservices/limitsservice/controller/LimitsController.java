package com.gblanco.microservices.limitsservice.controller;

import com.gblanco.microservices.limitsservice.bean.Limits;
import com.gblanco.microservices.limitsservice.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {

        return new Limits(configuration.getMinimum(), configuration.getMaximum());
    }
}

package org.munozy.microservices.demo.limitsservice.controller;

import org.munozy.microservices.demo.limitsservice.config.LimitConfig;
import org.munozy.microservices.demo.limitsservice.config.LimitsServiceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(LimitsConfigController.PATH)
public class LimitsConfigController {
    static  final String PATH = "/limits";

    @Autowired
    private LimitsServiceConfig limitsServiceConfig;

    @GetMapping(path = "/")
    public LimitConfig retrieveLimitsFromConfiguration() {
        return LimitConfig.builder()
                .maximum(limitsServiceConfig.getMaximum())
                .minimum(limitsServiceConfig.getMinimum())
                .build();
    }
}

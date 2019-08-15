package org.munozy.microservices.demo.limitsservice.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("limits-service")
@Data
@NoArgsConstructor
public class LimitsServiceConfig {

    int maximum;

    int minimum;
}

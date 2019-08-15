package org.munozy.microservices.demo.limitsservice.config;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LimitConfig {

    int maximum;

    int minimum;
}

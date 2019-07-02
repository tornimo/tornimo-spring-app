package io.tornimo.example;

import io.tornimo.TornimoStaticEnvironmentData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

    @Bean
    public TornimoStaticEnvironmentData environmentData() {
        return new TornimoStaticEnvironmentData("example-env-data");
    }
}

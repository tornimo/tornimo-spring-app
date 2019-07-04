package io.tornimo.example;

import io.tornimo.TornimoStaticEnvironmentData;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleConfiguration {

    /**
     * This is a very simple implementation of {@link io.tornimo.TornimoEnvironmentData}, that provides static
     * environment data, that is then visible in a metric name. You can use one that dynamically during runtime
     * recognizes data from the environment. Our cloud configurators are in this
     * <a href="https://github.com/tornimo/tornimo-spring-cloud/">repo</a>.
     */
    @Bean
    public TornimoStaticEnvironmentData environmentData() {
        return new TornimoStaticEnvironmentData("example-env-data");
    }
}

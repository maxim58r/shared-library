package com.chatter.shared.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

@Configuration
public class ReactiveConfig {
    @Bean
    public Scheduler reactiveScheduler() {
        return Schedulers.boundedElastic();
    }
}

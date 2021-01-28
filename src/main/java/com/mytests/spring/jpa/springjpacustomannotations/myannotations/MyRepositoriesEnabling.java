package com.mytests.spring.jpa.springjpacustomannotations.myannotations;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@EnableJpaRepositories
public @interface MyRepositoriesEnabling {
    
    @AliasFor(annotation = EnableJpaRepositories.class, attribute = "basePackages")
    String[] reposLocation();
}
package com.mytests.spring.jpa.springjpacustomannotations.app;

import com.mytests.spring.jpa.springjpacustomannotations.myannotations.MyDataAndRepositoriesEnabling;
import com.mytests.spring.jpa.springjpacustomannotations.myannotations.MyFixedRepositoriesEnabling;
import com.mytests.spring.jpa.springjpacustomannotations.myannotations.MyRepositoriesEnabling;
import com.mytests.spring.jpa.springjpacustomannotations.repositories.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.mytests.spring.jpa.springjpacustomannotations.data")
@EnableJpaRepositories(basePackages = "com.mytests.spring.jpa.springjpacustomannotations.repositories")
//@MyFixedRepositoriesEnabling       // works
//@MyRepositoriesEnabling(reposLocation = "com.mytests.spring.jpa.springjpacustomannotations.repositories")   // doesn't work
//@MyDataAndRepositoriesEnabling(entitiesLocation = "com.mytests.spring.jpa.springjpacustomannotations.data",reposLocation = "com.mytests.spring.jpa.springjpacustomannotations.repositories") // doesn't work
public class SpringJpaCustomAnnotationsApplication implements CommandLineRunner {

    
    @Autowired
    ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaCustomAnnotationsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        SampleService sampleService = ctx.getBean(SampleService.class);
        sampleService.displayExistByVersionGreaterThan2();
        sampleService.displayFirstBlueSample();
        sampleService.displayAllCyansWithSpecificName();
        sampleService.displayMinVersionOfWhiteAndBlacks();
        sampleService.displayIdAndNameAndColor();
    }
}

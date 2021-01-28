package com.mytests.spring.jpa.springjpacustomannotations.app;

import com.mytests.spring.jpa.springjpacustomannotations.data.Sample;
import com.mytests.spring.jpa.springjpacustomannotations.repositories.SampleRepository;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 28.01.2021.</p>
 * <p>Project: spring-jpa-custom-annotations</p>
 * *
 */
@Service
public class SampleService {

    private final SampleRepository sampleRepository;

    public SampleService(SampleRepository sampleRepository) {
        this.sampleRepository = sampleRepository;
    }
    
    public void displayFirstBlueSample(){
        System.out.println("=== getDistinctFirstByColor('blue')");
        System.out.println(sampleRepository.getDistinctFirstByColor("blue").toString());
    }
    
    public void displayExistByVersionGreaterThan2(){
        System.out.println("=== existsSampleByVersionGreaterThan(2)");
        System.out.println(sampleRepository.existsSampleByVersionGreaterThan(2).toString());
    }
    
    public void displayAllCyansWithSpecificName(){

        System.out.println("=== getAllByColorAndSamplePattern('cyan', '_')");
        for (Sample sample : sampleRepository.getAllByColorAndSamplePattern("cyan", "_")) {
            System.out.println(sample.toString());
        }
    }

    public void displayMinVersionOfWhiteAndBlacks(){

        System.out.println("=== getMinVersion(\"white\", \"black\")");
        System.out.println(sampleRepository.getMinVersion("white", "black"));

    }
    public void displayIdAndNameAndColor(){

        System.out.println("=== getIdsNamesColorsConcatenation()");
        for (String s : sampleRepository.getIdsNamesColorsConcatenation()) {
            System.out.println(s);
        }
    }
}

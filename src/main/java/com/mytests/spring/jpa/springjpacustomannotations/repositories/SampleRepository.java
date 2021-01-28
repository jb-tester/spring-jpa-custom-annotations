package com.mytests.spring.jpa.springjpacustomannotations.repositories;

import com.mytests.spring.jpa.springjpacustomannotations.data.Sample;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by irina on 28.01.2021.</p>
 * <p>Project: spring-jpa-custom-annotations</p>
 * *
 */
public interface SampleRepository extends CrudRepository<Sample, Integer> {
    
    Sample getDistinctFirstByColor(String color);
    Boolean existsSampleByVersionGreaterThan(Integer version);
    
    @Query(value = "select s from Sample s where s.color = :color and s.sample like %:sample%")
    List<Sample> getAllByColorAndSamplePattern(@Param("color") String color, @Param("sample") String sample);
    
    @Query("select min(version) from Sample where color=?1 or color=?2")
    Integer getMinVersion(String c1, String c2);
    
    @Query("select id||': '||upper(sample)||' ('||color||')' from Sample ")
    //@Query("select concat(id,': ', upper(sample), ' (',color,')') from Sample ")
    List<String> getIdsNamesColorsConcatenation();
}

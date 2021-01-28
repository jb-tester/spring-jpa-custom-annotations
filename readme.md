To test the following cases:
 - ```@EntityScan``` support: https://youtrack.jetbrains.com/issue/IDEA-260624 
   (Spring Boot: @EntityScan annotation: support  'basePackages', show warnings for repositories that use not managed entities)
 - meta-annotations for ```@EnableJpaRepositories```: https://youtrack.jetbrains.com/issue/IDEA-260630 
   (Spring Boot: the custom anotation based on @EnabledJpaRepositories is not recognized if it defines alias for #basePackages attribute)
 - JPA QL: || operator support: https://youtrack.jetbrains.com/issue/IDEA-260631
   (JPA QL: the '||' (concatenation) operation is not supported)
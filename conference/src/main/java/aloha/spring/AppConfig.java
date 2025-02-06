package aloha.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "aloha.spring" })
public class AppConfig {

    /*
     * With Autowired, you just need to use @ComponentScan and Spring Framework will
     * do dependency injection automatically
     */

    // @Bean(name = "speakerService")
    // @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    // public SpeakerService getSpeakerService() {
    // // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepo()); //
    // Constructor injection
    // SpeakerServiceImpl service = new SpeakerServiceImpl();
    // // service.setRepo(getSpeakerRepo()); // Setter injection
    // return service;
    // }

    // @Bean(name = "speakerRepo")
    // public SpeakerRepo getSpeakerRepo() {
    // return new StubSpeakerRepoImpl();
    // }

}

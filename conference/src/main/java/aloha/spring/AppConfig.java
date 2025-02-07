package aloha.spring;

import java.util.Calendar;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import aloha.spring.util.CalendarFactory;

@Configuration
@ComponentScan({ "aloha.spring" })
public class AppConfig {

    @Bean(name = "cal")
    public CalendarFactory calFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

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

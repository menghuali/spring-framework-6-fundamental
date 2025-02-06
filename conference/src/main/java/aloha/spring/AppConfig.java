package aloha.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import aloha.spring.repo.SpeakerRepo;
import aloha.spring.repo.StubSpeakerRepoImpl;
import aloha.spring.service.SpeakerService;
import aloha.spring.service.SpeakerServiceImpl;

@Configuration
public class AppConfig {

    @Bean(name = "speakerService")
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepo()); // Constructor injection
        // service.setRepo(getSpeakerRepo()); // Setter injection
        return service;
    }

    @Bean(name = "speakerRepo")
    public SpeakerRepo getSpeakerRepo() {
        return new StubSpeakerRepoImpl();
    }

}

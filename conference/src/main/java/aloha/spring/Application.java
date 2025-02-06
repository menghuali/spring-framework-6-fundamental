package aloha.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import aloha.spring.service.SpeakerService;

public class Application {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        // SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appCtx.getBean("speakerService", SpeakerService.class);
        service.findAll().stream().forEach(speaker -> {
            System.out.println(
                    String.format("First name: %s, Last name: %s", speaker.getFirstName(), speaker.getLastName()));
        });
    }
}
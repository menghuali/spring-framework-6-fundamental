package aloha.spring;

import aloha.spring.service.SpeakerService;
import aloha.spring.service.SpeakerServiceImpl;

public class Application {
    public static void main(String[] args) {
        SpeakerService service = new SpeakerServiceImpl();
        service.findAll().stream().forEach(speaker -> {
            System.out.println(
                    String.format("First name: %s, Last name: %s", speaker.getFirstName(), speaker.getLastName()));
        });
    }
}
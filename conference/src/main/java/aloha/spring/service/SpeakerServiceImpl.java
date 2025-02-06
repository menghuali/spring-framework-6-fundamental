package aloha.spring.service;

import java.util.List;

import aloha.spring.model.Speaker;
import aloha.spring.repo.StubSpeakerRepoImpl;

public class SpeakerServiceImpl implements SpeakerService {

    private StubSpeakerRepoImpl repo = new StubSpeakerRepoImpl();

    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

}

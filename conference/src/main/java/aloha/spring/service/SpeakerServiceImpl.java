package aloha.spring.service;

import java.util.List;

import aloha.spring.model.Speaker;
import aloha.spring.repo.SpeakerRepo;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo repo;

    public SpeakerServiceImpl(SpeakerRepo repo) {
        this.repo = repo;
    }

    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

    public void setRepo(SpeakerRepo repo) {
        this.repo = repo;
    }

}

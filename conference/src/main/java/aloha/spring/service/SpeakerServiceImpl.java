package aloha.spring.service;

import java.util.List;

import aloha.spring.model.Speaker;
import aloha.spring.repo.SpeakerRepo;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo repo;

    public SpeakerServiceImpl() {
        System.out.println("SpeakerServiceImpl: no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepo repo) {
        System.out.println("SpeakerServiceImpl: constructor injection");
        this.repo = repo;
    }

    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

    public void setRepo(SpeakerRepo repo) {
        System.out.println("SpeakerServiceImpl: setter injection");
        this.repo = repo;
    }

}

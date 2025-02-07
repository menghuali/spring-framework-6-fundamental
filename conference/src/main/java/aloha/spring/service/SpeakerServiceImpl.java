package aloha.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import aloha.spring.model.Speaker;
import aloha.spring.repo.SpeakerRepo;
import jakarta.annotation.PostConstruct;

@Service("speakerService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepo repo;

    public SpeakerServiceImpl() {
    System.out.println("SpeakerServiceImpl no args constructor");
    }

    /**
     * If the constructor with dependency arguments is the only constructor, you
     * don't even need @Autowired. Spring will automatically use the constructor to
     * create the component and inject denepdenies.
     * 
     * @param repo Service repository, the dependecy to be injecteted.
     */
    @Autowired
    public SpeakerServiceImpl(SpeakerRepo repo) {
        System.out.println("SpeakerServiceImpl repo constructor");
        this.repo = repo;
    }

    @PostConstruct
    private void init() {
        System.out.println("SpeakerServiceImpl init: called after the constructors");
    }

    @Override
    public List<Speaker> findAll() {
        return repo.findAll();
    }

    // @Autowired
    public void setRepo(SpeakerRepo repo) {
        System.out.println("SpeakerServiceImpl repo setter");
        this.repo = repo;
    }

}

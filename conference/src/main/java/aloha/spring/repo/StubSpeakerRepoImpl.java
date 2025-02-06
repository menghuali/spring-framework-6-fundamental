package aloha.spring.repo;

import java.util.Arrays;
import java.util.List;

import aloha.spring.model.Speaker;

public class StubSpeakerRepoImpl implements SpeakerRepo {

    @Override
    public List<Speaker> findAll() {
        return Arrays.asList(new Speaker("Bruce", "Wayne"), new Speaker("Peter", "Parker"));
    }

}

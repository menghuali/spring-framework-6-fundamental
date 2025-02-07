package aloha.spring.repo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import aloha.spring.model.Speaker;

@Repository("speakerRepo")
@Profile("dev")
public class StubSpeakerRepoImpl implements SpeakerRepo {

    private Calendar cal;

    // Sample of SpEL
    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedNum;

    @Override
    public List<Speaker> findAll() {
        System.out.println("cal: " + cal.getTime());
        return Arrays.asList(new Speaker("Bruce", "Wayne", seedNum), new Speaker("Peter", "Parker", seedNum));
    }

    @Autowired
    public void setCal(Calendar cal) {
        this.cal = cal;
    }

}

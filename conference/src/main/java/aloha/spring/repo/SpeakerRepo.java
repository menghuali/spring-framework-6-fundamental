package aloha.spring.repo;

import java.util.List;

import aloha.spring.model.Speaker;

public interface SpeakerRepo {

    List<Speaker> findAll();

}
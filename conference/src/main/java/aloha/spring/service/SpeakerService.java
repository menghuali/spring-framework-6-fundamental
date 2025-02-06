package aloha.spring.service;

import java.util.List;

import aloha.spring.model.Speaker;

public interface SpeakerService {

    List<Speaker> findAll();

}
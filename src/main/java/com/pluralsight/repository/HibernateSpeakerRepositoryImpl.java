package com.pluralsight.repository;


import com.pluralsight.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Brandt");
        speaker.setLastName("Campbell");

        speakers.add(speaker);

        return speakers;
    }

}

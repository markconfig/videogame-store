package com.markconfig.videogames.service;

import com.markconfig.videogames.domain.Developer;
import com.markconfig.videogames.repository.DeveloperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeveloperService {
    @Autowired
    private final DeveloperRepository developerRepository;

    public DeveloperService(DeveloperRepository developerRepository) {
        this.developerRepository = developerRepository;
    }

    public List<Developer> findAllDevelopers() {
        return this.developerRepository.findAllOrderbyName();
    }
}

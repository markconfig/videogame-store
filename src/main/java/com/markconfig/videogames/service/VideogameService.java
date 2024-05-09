package com.markconfig.videogames.service;

import com.markconfig.videogames.domain.Videogame;
import com.markconfig.videogames.repository.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideogameService {
    @Autowired
    private final VideoGameRepository videoGameRepository;

    public VideogameService(VideoGameRepository videoGameRepository) {
        this.videoGameRepository = videoGameRepository;
    }


    public List<Videogame> searchDestacate() {
        List<Videogame> videogameList = new ArrayList<>();

//        videogameList = videoGameRepository.findAll();
        videogameList = videoGameRepository.searchAll();
        return videogameList;
    }

    public List<Videogame> findBySupplier(int supplierId) {
        List<Videogame> videogameBySupplier = new ArrayList<>();
        videogameBySupplier = this.videoGameRepository.findBySupplier(supplierId);
        return videogameBySupplier;
    }


    public List<Videogame> search(String query) {
        List<Videogame> listGame = new ArrayList<>();
        listGame = this.videoGameRepository.findByNameContaining(query);
        return listGame;
    }


    public Videogame save(Videogame videogame) {
        return this.videoGameRepository.save(videogame);
    }
}

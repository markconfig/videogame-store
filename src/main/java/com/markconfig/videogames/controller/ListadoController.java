package com.markconfig.videogames.controller;

import com.markconfig.videogames.domain.Videogame;
import com.markconfig.videogames.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ListadoController {

    //Inyeccion de dependencias por parametro
//    @Autowired
//    private VideogameService videogameService;

    //Inyección de dependencias por constructor
    @Autowired
    private final VideogameService videogameService;

    public ListadoController(VideogameService videogameService) {
        this.videogameService = videogameService;
    }

    @RequestMapping("/")
    public String listVideoGames(Model model) {
        List<Videogame> destacates = this.videogameService.searchDestacate();
        model.addAttribute("videogames", destacates);
        return "listado";
    }

    @RequestMapping("/videogameBySupplier")
    public String listVideogameBySupplier(int supplierId, Model model) {
        List<Videogame> games = videogameService.findBySupplier(supplierId);
        model.addAttribute("videogames", games);

        return "listado";
    }

    @RequestMapping("/search")
    public String search(@RequestParam("q") String query, Model model) {
        List<Videogame> gameList = new ArrayList<>();
        gameList = videogameService.search(query);
        model.addAttribute("videogames", gameList);
        return "listado";
    }
}

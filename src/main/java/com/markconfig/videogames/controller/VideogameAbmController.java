package com.markconfig.videogames.controller;

import com.markconfig.videogames.domain.Videogame;
import com.markconfig.videogames.repository.SupplierRepository;
import com.markconfig.videogames.service.DeveloperService;
import com.markconfig.videogames.service.SupplierService;
import com.markconfig.videogames.service.VideogameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideogameAbmController {
    @Autowired
    private final DeveloperService developerService;

    @Autowired
    private final SupplierService supplierService;

    @Autowired
    private final VideogameService videogameService;

    public VideogameAbmController(DeveloperService developerService, SupplierService supplierService, VideogameService videogameService) {
        this.developerService = developerService;
        this.supplierService = supplierService;
        this.videogameService = videogameService;
    }

//    public VideogameAbmController(SupplierService supplierService) {
//        this.supplierService = supplierService;
//    }

    @RequestMapping("/videogame/new")
    public String formNewVideogame(Model model) {
        model.addAttribute("suppliers", this.supplierService.getAll());
        model.addAttribute("developers", this.developerService.findAllDevelopers());
        model.addAttribute("videogame", new Videogame());
        return "formVideogame";
    }

    @PostMapping("/videogame/save")
    public String save(Videogame videogame) {
        this.videogameService.save(videogame);
        return "redirect:/";
    }
}

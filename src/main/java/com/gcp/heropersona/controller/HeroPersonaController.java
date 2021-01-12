package com.gcp.heropersona.controller;

import com.gcp.heropersona.entity.Hero;
import com.gcp.heropersona.service.HeroPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroPersonaController {
    List<Hero> heroList;

    public HeroPersonaController() {
        Hero hero = new Hero("Batman");
        heroList = new ArrayList<>();
        heroList.add(hero);
        hero = new Hero("SpiderMan");
        heroList.add(hero);
    }

    @GetMapping("/gcp/api/heros")
    public List<Hero> getAllHeros(){
        return heroList;
    }
}

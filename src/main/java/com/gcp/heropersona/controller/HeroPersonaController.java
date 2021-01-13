package com.gcp.heropersona.controller;

import com.gcp.heropersona.entity.Hero;
import com.gcp.heropersona.service.HeroPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class HeroPersonaController {
    private List<Hero> heroList;

    public HeroPersonaController() {
        Hero hero = new Hero("/src/batman.jpg","Bruce Wayne","Batman","6 feet","180 lbs",
        "None", "100", "90", "None", "Normal","60",
                "Fighting crime at night wearing bat suit", "Turned into batman to make the gotham city safer");
        heroList = new ArrayList<>();
        heroList.add(hero);
        hero = new Hero("SpiderMan");
        heroList.add(hero);
        hero = new Hero("SuperMan");
        heroList.add(hero);
    }

    @GetMapping("/gcp/api/heros")
    public List<Hero> getAllHeros(){
        return heroList;
    }

    @GetMapping("/gcp/api/heros/{name}")
    public Hero getHeroByName(@PathVariable String name) {
        return heroList.stream().filter(hero -> hero.getHeroName().equalsIgnoreCase(name)).findFirst().orElse(null);
    }
}

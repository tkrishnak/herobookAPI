package com.gcp.heropersona.controller;

import com.gcp.heropersona.customexception.HeroNotFoundException;
import com.gcp.heropersona.entity.Hero;
import com.gcp.heropersona.entity.Villain;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/gcp/api")
public class HeroPersonaController {
    private List<Hero> heroList;
    private List<Villain> villainList;

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

        Villain villain = new Villain("Joker","Batman","/src/joker.jpg","Jack Napier","Batman","6 feet","180 lbs",
                "None", "200", "60", "None", "Fast","70",
                "Fighting Batman", "Fight Batman with all his evil ideas");
        villainList = new ArrayList<>();
        villainList.add(villain);
        villain = new Villain("Dr.Octopus");
        villainList.add(villain);
        villain = new Villain("Lex Luther");
        villainList.add(villain);
    }

    @GetMapping("/heros")
    public List<Hero> getAllHeros(){
        return heroList;
    }

    @GetMapping("/heros/{name}")
    public ResponseEntity getHeroByName(@PathVariable String name) throws HeroNotFoundException {
        List<Hero> myHero =  heroList.stream().filter(hero -> hero.getHeroName().equalsIgnoreCase(name)).collect(Collectors.toList());
        if(myHero != null && myHero.size()>0)
            return ResponseEntity.ok().body(myHero.get(0));
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hero doesn't exist");
    }

    @GetMapping("/villains")
    public List<Villain> getAllVillains(){
        return villainList;
    }

    @GetMapping("/villains/{name}")
    public ResponseEntity getVillainsByName(@PathVariable String name) throws HeroNotFoundException {
        List<Hero> myVillain =  villainList.stream().filter(villain -> villain.getVillainName().equalsIgnoreCase(name)).collect(Collectors.toList());
        if(myVillain != null && myVillain.size()>0)
            return ResponseEntity.ok().body(myVillain.get(0));
        else
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hero doesn't exist");
    }
}

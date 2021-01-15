package com.gcp.heropersona.controller;

import com.gcp.heropersona.customexception.HeroNotFoundException;
import com.gcp.heropersona.entity.Hero;
import com.gcp.heropersona.entity.Villain;
import com.gcp.heropersona.service.HeroPersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gcp/api")
public class HeroPersonaController {

    private HeroPersonaService heroPersonaService;

    public HeroPersonaController(HeroPersonaService heroPersonaService) {
        this.heroPersonaService = heroPersonaService;
    }

    @GetMapping("/heros")
    public List<Hero> getAllHeros(){
        return heroPersonaService.getAllHeros();
    }

    @GetMapping("/heros/{name}")
    public ResponseEntity getHeroByName(@PathVariable String name) throws HeroNotFoundException {
        Optional<Hero> hero = heroPersonaService.findHeroByName(name);
        if(hero.isPresent()) {
            return ResponseEntity.ok().body(hero);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Hero doesn't exist");
        }
    }

    @GetMapping("/villains")
    public List<Villain> getAllVillains(){
        return heroPersonaService.findAllVillains();
    }

    @GetMapping("/villains/{name}")
    public ResponseEntity getVillainsByName(@PathVariable String name) throws HeroNotFoundException {
        Optional<Villain> villain = heroPersonaService.findVillainByName(name);
        if(villain.isPresent()) {
            return ResponseEntity.ok().body(villain);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Villain doesn't exist");
        }
    }
}

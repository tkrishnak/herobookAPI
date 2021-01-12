package com.gcp.heropersona.controller;

import com.gcp.heropersona.entity.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HeroPersonaController {

    @GetMapping("/gcp/api/heros")
    public List<Hero> getAllHeros(){
        return new ArrayList<>();

    }
}

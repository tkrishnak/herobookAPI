package com.gcp.heropersona.service;

import com.gcp.heropersona.entity.Hero;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HeroPersonaService {
    public List<Hero> getAllHeros() {
        Hero hero = new Hero("Batman");
        List<Hero> heroList = new ArrayList<>();
        heroList.add(hero);
        return heroList;
    }
}

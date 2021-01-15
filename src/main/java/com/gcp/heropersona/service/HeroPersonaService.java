package com.gcp.heropersona.service;

import com.gcp.heropersona.entity.Hero;
import com.gcp.heropersona.repository.HeroPersonaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroPersonaService {

    HeroPersonaRepository heroPersonaRepository;

    public HeroPersonaService(HeroPersonaRepository heroPersonaRepository) {
        this.heroPersonaRepository = heroPersonaRepository;
    }

    public List<Hero> getAllHeros() {
        return heroPersonaRepository.findAll();
    }
}

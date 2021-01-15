package com.gcp.heropersona.service;

import com.gcp.heropersona.entity.Hero;
import com.gcp.heropersona.entity.Villain;
import com.gcp.heropersona.repository.HeroRepository;
import com.gcp.heropersona.repository.VillainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HeroPersonaService {

    HeroRepository heroRepository;
    VillainRepository villainRepository;

    public HeroPersonaService(HeroRepository heroRepository, VillainRepository villainRepository) {
        this.heroRepository = heroRepository;
        this.villainRepository= villainRepository;
    }

    public List<Hero> getAllHeros() {
        return heroRepository.findAll();
    }

    public Optional<Hero> findHeroByName(String name) {
        return heroRepository.findById(name);
    }

    public List<Villain> findAllVillains() {
        return villainRepository.findAll();
    }
}

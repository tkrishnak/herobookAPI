package com.gcp.heropersona.service;

import com.gcp.heropersona.entity.Villain;
import com.gcp.heropersona.repository.VillainRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VillainPersonaService {
    VillainRepository villainRepository;

    public VillainPersonaService(VillainRepository villainRepository) {
        this.villainRepository= villainRepository;
    }

    public List<Villain> findAllVillains() {
        return villainRepository.findAll();
    }

    public Optional<Villain> findVillainByName(String name) {
        return villainRepository.findById(name);
    }
}

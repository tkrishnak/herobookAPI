package com.gcp.heropersona.controller;

import com.gcp.heropersona.customexception.HeroNotFoundException;
import com.gcp.heropersona.entity.Villain;
import com.gcp.heropersona.service.VillainPersonaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/gcp/api/villains")
public class VillainPersonaController {

    VillainPersonaService villainPersonaService;

    public VillainPersonaController(VillainPersonaService villainPersonaService) {
        this.villainPersonaService = villainPersonaService;
    }

    @GetMapping()
    public List<Villain> getAllVillains(){
        return villainPersonaService.findAllVillains();
    }

    @GetMapping("/{name}")
    public ResponseEntity getVillainsByName(@PathVariable String name) throws HeroNotFoundException {
        Optional<Villain> villain = villainPersonaService.findVillainByName(name);
        if(villain.isPresent()) {
            return ResponseEntity.ok().body(villain);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Villain doesn't exist");
        }
    }
}

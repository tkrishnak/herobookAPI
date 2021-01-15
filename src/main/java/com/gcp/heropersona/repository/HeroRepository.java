package com.gcp.heropersona.repository;

import com.gcp.heropersona.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HeroRepository extends JpaRepository<Hero, String> {
}

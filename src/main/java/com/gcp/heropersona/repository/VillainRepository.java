package com.gcp.heropersona.repository;

import com.gcp.heropersona.entity.Villain;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VillainRepository extends JpaRepository<Villain, String> {
}

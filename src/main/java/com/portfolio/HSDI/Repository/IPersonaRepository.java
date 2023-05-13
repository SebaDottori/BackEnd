package com.portfolio.HSDI.Repository;

import com.portfolio.HSDI.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
     
public interface IPersonaRepository extends JpaRepository<Persona, Long> {
    
}

package com.portfolio.HSDI.Repository;

import com.portfolio.HSDI.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
     
public interface IPersonaRepository extends JpaRepository<Persona, Integer> {
    public Optional<Persona> findByNombre(String nombre);
    public Boolean existsByNombre(String nombre);
    public Optional<Persona> findByApellido(String apellido);
    public Boolean existsByApellido(String apellido);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.HSDI.Repository;

import com.portfolio.HSDI.Entity.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sebad
 */
public interface RHyS extends JpaRepository<HyS, Integer>{
    Optional<HyS> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}

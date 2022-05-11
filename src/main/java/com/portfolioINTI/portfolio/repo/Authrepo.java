/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioINTI.portfolio.repo;

import com.portfolioINTI.portfolio.model.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author walke
 */
@Repository
public interface Authrepo extends JpaRepository<Usuario,Long>{

    public List<Usuario> findByEmailAndIsEnabledTrue(String correo);
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioINTI.portfolio.repo;

import com.portfolioINTI.portfolio.model.EducacionModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author walke
 */
@Repository
public interface EducacionRepo extends CrudRepository<EducacionModel,Integer> {
    
}

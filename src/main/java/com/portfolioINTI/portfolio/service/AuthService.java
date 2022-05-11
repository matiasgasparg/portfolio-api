/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.service;

import com.portfolioINTI.portfolio.dto.UserDto;
import com.portfolioINTI.portfolio.model.Usuario;
import com.portfolioINTI.portfolio.repo.Authrepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author walke
 */
@Service
public class AuthService {
    @Autowired
    Authrepo authRepo;
    @Autowired
    PasswordEncoder passwordEncoder;
    
    public boolean isUserEnabled(UserDto userDto){
            boolean isUserEnabled=false;
            List<Usuario> usuarios= authRepo.findByEmailAndIsEnabledTrue(userDto.getEmail());
            if (!usuarios.isEmpty()){
                Usuario usuario=usuarios.get(0);
                if (passwordEncoder.matches(userDto.getPassword(),usuario.getPassword()))
                    isUserEnabled=true;
            }
            return isUserEnabled;
    }
        
    public void crearUsuario(Usuario usuario) throws Exception{
        
        List<Usuario> usuarios= authRepo.findByEmailAndIsEnabledTrue(usuario.getEmail());
        if(!usuarios.isEmpty()){
            throw new Exception ("El email ya esta registrado!. ");
        }
        else{
        usuario.setPassword(passwordEncoder.encode(usuario.getPassword()));
        usuario.setEnabled(true);
        authRepo.save(usuario);
    }
    }
}

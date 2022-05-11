package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.dto.UserDto;
import com.portfolioINTI.portfolio.model.Usuario;
import com.portfolioINTI.portfolio.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author walke
 */
@RestController
public class AuthController {
    @Autowired
    AuthService authService;
    
    @PostMapping("/login")
    public boolean login(@RequestBody UserDto userDto){
        return authService.isUserEnabled(userDto);
    }
  
    @PostMapping("/register")
    
    public void register (@RequestBody Usuario usuario )throws Exception{
        authService.crearUsuario(usuario);
    }
    
    
}

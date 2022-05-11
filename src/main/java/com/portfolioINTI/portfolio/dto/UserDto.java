/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioINTI.portfolio.dto;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author walke
 */
@Getter @Setter
public class UserDto {
    private String email;
    private String password;

    public UserDto() {
    }

    public UserDto(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto{" + "email=" + email + ", password=" + password + '}';
    }
    
    
    
}

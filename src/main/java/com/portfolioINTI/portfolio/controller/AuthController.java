package com.portfolioINTI.portfolio.controller;

import com.portfolioINTI.portfolio.model.PersonaModel;
import com.portfolioINTI.portfolio.service.PersonaService;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author walke
 */
@RestController
@CrossOrigin("*")
@RequestMapping("/api/login")

public class AuthController {
    @Autowired
    private PersonaService personaService;
    
   private String getJWTToken(String username){
       String secretKey="wa4k3r";
		List<GrantedAuthority> grantedAuthorities = AuthorityUtils
		.commaSeparatedStringToAuthorityList("ROLE_USER");
		
		String token = Jwts
				.builder()
				.setId("api3320")
				.setSubject(username)
				.claim("authorities",
						grantedAuthorities.stream()
								.map(GrantedAuthority::getAuthority)
								.collect(Collectors.toList()))
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis() + 600000))
				.signWith(SignatureAlgorithm.HS512,
						secretKey.getBytes()).compact();

		return "Bearer " + token;
   }
    
    @PostMapping 
   public ResponseEntity<PersonaModel> login (@Validated @RequestBody PersonaModel user){
       PersonaModel persona= personaService.getByUsername(user.getUsername());
       if(persona.getPassword().equals(user.getPassword())){
           String token= getJWTToken(user.getUsername());
           persona.setToken(token);
           persona.setPassword(null);
           return ResponseEntity.ok().body(persona);
       }
       else{
           return ResponseEntity.badRequest().build();
       }
       
   }
  

    
    
}

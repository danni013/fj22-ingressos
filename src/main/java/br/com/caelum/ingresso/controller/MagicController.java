package br.com.caelum.ingresso.controller;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caelum.ingresso.model.Permissao;
import br.com.caelum.ingresso.model.Usuario;

@RestController
public class MagicController {
   
	@PersistenceContext
    private EntityManager manager;
    
    
	@GetMapping("/magic/239ej3f4jjf")
	@Transactional
	public String salvaUsuario(){
		Set<Permissao> permissoes = new HashSet<>();
		
		//ADMIN
		Permissao permissao = new Permissao("ROLE_ADMIN");
//		manager.persist(permissao);
	
		permissoes.add(permissao);
		
		BCryptPasswordEncoder bCrypt = new BCryptPasswordEncoder();
		String password = bCrypt.encode("123");
		Usuario usuario = new Usuario("daniele@gmail.com", password, permissoes);
		manager.persist(usuario);
		permissoes.clear();
		
		//COMPRADOR
		Permissao permissaoComprador = new Permissao("ROLE_COMPRADOR");
		manager.persist(permissaoComprador);
		permissoes.add(permissaoComprador);
		
		password = bCrypt.encode("123");
		Usuario usuarioComprador = new Usuario("daniele.oliveira@gmail.com", password, permissoes);
		manager.persist(usuarioComprador);
		
		return "Cadastrado";
	}
}

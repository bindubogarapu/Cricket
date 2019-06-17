package com.cricket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.dto.PlayerDTO;
import com.cricket.service.IPlayerService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = {"*","*/"},origins = {"*","*/"})
public class PlayerController {
	
	@Autowired
	IPlayerService playerService;
	
	@PostMapping("/player")
	public ResponseEntity<PlayerDTO> addPlayer(@RequestBody PlayerDTO playerDTO){
		return playerService.addPlayer(playerDTO);
				
	}
	

}

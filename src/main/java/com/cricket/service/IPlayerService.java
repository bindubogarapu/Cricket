package com.cricket.service;

import org.springframework.http.ResponseEntity;

import com.cricket.dto.PlayerDTO;

public interface IPlayerService {
 
	public ResponseEntity<PlayerDTO> addPlayer(PlayerDTO playerDTO);
}

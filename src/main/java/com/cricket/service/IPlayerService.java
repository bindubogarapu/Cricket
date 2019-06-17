package com.cricket.service;

import org.springframework.http.ResponseEntity;

import com.cricket.dto.PlayerDTO;

public interface IPlayerService {
 
	public PlayerDTO addPlayer(PlayerDTO playerDTO);
	public PlayerDTO findPlayerByPlayerId(Long playerId);
}

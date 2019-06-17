 package com.cricket.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cricket.dto.PlayerDTO;
import com.cricket.entity.PlayerEntity;
import com.cricket.repository.PlayerRepository;

@Service
public class PlayerServiceImpl implements IPlayerService {
	
	@Autowired
	PlayerRepository playerRepository;

	@Override
	public ResponseEntity<PlayerDTO> addPlayer(PlayerDTO playerDTO) {
		
		PlayerEntity player = new PlayerEntity();
		player.setAge(playerDTO.getAge());
		player.setCountry(playerDTO.getCountry());
		
		
		
		
		return null;
	}

}

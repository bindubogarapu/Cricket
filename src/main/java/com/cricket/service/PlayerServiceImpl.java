 package com.cricket.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cricket.dto.PlayerDTO;
import com.cricket.entity.PlayerEntity;
import com.cricket.entity.ProfileEntity;
import com.cricket.exception.PlayerNotFoundException;
import com.cricket.repository.PlayerRepository;
import com.cricket.repository.ProfileRepository;

@Service
public class PlayerServiceImpl implements IPlayerService {
	
	
	@Autowired PlayerRepository playerRepository;
	
	
	@Autowired
	ProfileRepository  profileRepository;

	@Override
	public PlayerDTO addPlayer(PlayerDTO playerDTO) {
		
		PlayerEntity player = new PlayerEntity();
		player.setAge(playerDTO.getAge());
		player.setCountry(playerDTO.getCountry());
		player.setPlayerName(playerDTO.getPlayerName());
		player.setRole(playerDTO.getRole());
		player.setStyle(playerDTO.getStyle());
		
		ProfileEntity profile = new ProfileEntity();
		BeanUtils.copyProperties(playerDTO, profile, "age","country","playerName","role","style");
		
		player.setProfile(profile);
		profile.setPlayerEntity(player);
		playerRepository.save(player);	
		playerDTO.setPlayerId(player.getPlayerId());
		return playerDTO;
	}
	
	@Override
	public PlayerDTO findPlayerByPlayerId(Long playerId){
		PlayerEntity playerEntity = playerRepository.findById(playerId).orElse(null);
	
		PlayerDTO playerDTO = new PlayerDTO();
		BeanUtils.copyProperties(playerEntity, playerDTO);
		playerDTO.setBowlingAvg(playerEntity.getProfile().getBowlingAvg());
		return playerDTO;
	}

}

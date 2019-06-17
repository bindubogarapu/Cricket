package com.cricket.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "player_profile")

@Getter @Setter @ToString @NoArgsConstructor
public class ProfileEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long profileId;	
	@OneToOne
	@JoinColumn(name = "playerId")
	private PlayerEntity playerEntity;
	private long totalRuns;
	private long totalMatches;
	private long totalWickets;
	private double strikeRate;
	private double bowlingAvg;
	private long centuries;
	private long halfCenturies;
	private String imagePath;
	private String imageName;

}

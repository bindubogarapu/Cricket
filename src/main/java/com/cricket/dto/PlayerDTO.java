package com.cricket.dto;



import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString @NoArgsConstructor
public class PlayerDTO {
	private String playerName;
	private int age;
	private int role;
	private String country;
	private int style;
	private long totalRuns;
	private long totalMatches;
	private long totalWickets;
	private double strikeRate;
	private double bowlingAvg;
	private long centuries;
	private long halfCenturies;
	private String imagePath;
	private String imageName;
	private long profileId;
	private long playerId;
	
	
	
}

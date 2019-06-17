package com.cricket.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "player")

@Getter @Setter @ToString @NoArgsConstructor
public class PlayerEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long playerId;
	private String playerName;
	private int age;
	private int role;
	private String country;
	private int style;
	
	@OneToOne(cascade = CascadeType.ALL,mappedBy = "playerEntity")
	private ProfileEntity profile;
	
}

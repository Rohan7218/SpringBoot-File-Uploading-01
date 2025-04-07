package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Entity
@Data
public class Document 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer docId;
	
	@Lob
	private byte[] aadharCard;
	@Lob
	private byte[] panCard;
	@Lob
	private byte[] driverLicens;
	
	
}

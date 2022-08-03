package com.bootcamp.virtualwallet.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document("virtualwallet")
public class VirtualWallet {
	@Id	
	private String id;
	private String documentTypeId;
	private String documentNumber;
	private String name;
	private String email;
}

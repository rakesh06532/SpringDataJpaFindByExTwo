package com.ex.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Id
	private Integer productCode;
	private String productName;
	private Integer productQnty;
	private Double productCost;
	private Date mfgDate;
	private Boolean status;

}

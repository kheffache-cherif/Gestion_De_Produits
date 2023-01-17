package com.kheffache.produits.models;

import java.io.Serializable;
import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Table(name = "PRODUITS")
@Entity
public class Produit implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idProduit")
	private Long idProduit;
	
	@Column(name = "nomProduit")
	private String nomProduit;
	@Column(name = "prixProduit")
	private Double prixProduit;
	
	@Column(name = "dateCreation")
	private Date dateCreation;

}

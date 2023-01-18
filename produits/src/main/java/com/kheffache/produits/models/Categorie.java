package com.kheffache.produits.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie {
	
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCat;
private String nomCat;
private String descriptionCat;


@JsonIgnore
@OneToMany(mappedBy = "category")
private List<Produit> produits;

public Categorie(String nomCat, String descriptionCat, List<Produit> produits) {
	super();
	this.nomCat = nomCat;
	this.descriptionCat = descriptionCat;
	this.produits = produits;
}

public Categorie() {
	super();
	// TODO Auto-generated constructor stub
}

public String getNomCat() {
	return nomCat;
}

public void setNomCat(String nomCat) {
	this.nomCat = nomCat;
}

public String getDescriptionCat() {
	return descriptionCat;
}

public void setDescriptionCat(String descriptionCat) {
	this.descriptionCat = descriptionCat;
}

public List<Produit> getProduits() {
	return produits;
}

public void setProduits(List<Produit> produits) {
	this.produits = produits;
}




}

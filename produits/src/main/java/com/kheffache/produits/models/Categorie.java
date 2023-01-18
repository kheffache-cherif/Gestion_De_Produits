package com.kheffache.produits.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter

@Entity
public class Categorie {
	
	
@Id     
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idCat;
private String nomCat;
private String descriptionCat;


@JsonIgnore // lors de la serialisation je demande à spring de ne pas retourner la liste des produit incluse dans une category
@OneToMany(mappedBy = "categorie")

private List<Produit> produits;

public Categorie(String nomCat, String descriptionCat, List<Produit> produits) {
	super();
	this.nomCat = nomCat;
	this.descriptionCat = descriptionCat;
	this.produits = produits;
}



}

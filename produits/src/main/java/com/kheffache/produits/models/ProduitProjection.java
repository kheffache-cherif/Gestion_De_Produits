package com.kheffache.produits.models;

import org.springframework.data.rest.core.config.Projection;


//limiter l'affichage de JSON 
@Projection(name = "nomProd", types = { Produit.class })
public interface ProduitProjection {
	public String getNomProduit();
	
	}

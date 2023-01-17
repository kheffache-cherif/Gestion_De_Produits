package com.kheffache.produits.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kheffache.produits.models.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}

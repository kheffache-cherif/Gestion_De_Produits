package com.kheffache.produits.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kheffache.produits.models.Categorie;

@Repository
public interface categorieRepository extends JpaRepository<Categorie, Long> {

}

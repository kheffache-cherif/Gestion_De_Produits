package com.kheffache.produits.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.kheffache.produits.models.Categorie;
import com.kheffache.produits.models.Produit;

@RepositoryRestResource(path = "rest")
public interface ProduitRepository extends JpaRepository<Produit, Long> {
	
List<Produit> findByNomProduit(String nom);

List<Produit> findByNomProduitContains(String nom);

/*//sql interoge les table et JPA ql intzroge les entité objet 
@Query("select p from Produit p where p.nomProduit like %?1 and p.prixProduit > ?2") 
List<Produit> findByNomPrix (String nom, Double prix); //%?1 premier param   ?2 pram 2 le prix
}*/


@Query("select p from Produit p where p.nomProduit like %:nom and p.prixProduit > :prix")
List<Produit> findByNomPrix (@Param("nom") String nom,@Param("prix") Double prix);


@Query("select p from Produit p where p.categorie = ?1")

//RECHERCHE SELON TYPE CATEGORIE
List<Produit> findByCategorie (Categorie category);


//RECHERCHE SELON ID DE LA CATEGORIE
List<Produit> findByCategorieIdCat(Long id);


////RECHERCHE TRIE SELON ORDER CROISSANT 
List<Produit> findByOrderByNomProduitAsc();


@Query("select p from Produit p order by p.nomProduit ASC, p.prixProduit DESC")
List<Produit> trierProduitsNomsPrix ();
}
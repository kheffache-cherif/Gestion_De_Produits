package com.kheffache.produits;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kheffache.produits.Repository.ProduitRepository;
import com.kheffache.produits.models.Produit;

@SpringBootTest
class ProduitsApplicationTests {


	//IOC / INECTION DE DEPENDENCE 
	@Autowired
	private ProduitRepository produitRepository;
	
	
	@Test
	public void testCreateProduit() {
		Produit prod = new Produit("PS 4",1000.0,new Date());
	
	produitRepository.save(prod);
	
	}
	@Test
	public void testFindProduit(){
		Produit p = produitRepository.findById(1L).get();
		System.out.println(p);
	
	}
	@Test
	public void testUpdateProduit(){
	Produit p = produitRepository.findById(1L).get();
	p.setPrixProduit(1000.0);
	produitRepository.save(p);
	System.out.println(p);
	}
	
	@Test
	public void testDeleteProduit(){
		produitRepository.deleteById(3L);
		
	
	}
	@ Test
	public void testFindAllProduit() {
		List<Produit> prods = produitRepository.findAll();
		
		for(Produit p:prods)
			System.out.println(p);
		
	}
	@Test
	public void testFindNomProduit(){
		
List<Produit> prods = produitRepository.findByNomProduit("PC Dell");
		
		for(Produit p:prods)
			
		System.out.println(p);
	
	}
	@Test
	public void testFindNomContains(){
		
List<Produit> prods = produitRepository.findByNomProduitContains("e");
		
		for(Produit p:prods)
			
		System.out.println(p);
	
	}
	@Test public void testfindByNomPrix()
	{
	List<Produit> prods = produitRepository.findByNomPrix("PS 4", 1000.0);
	for (Produit p : prods)
	{
	System.out.println(p);
	}
	}
	
	

}

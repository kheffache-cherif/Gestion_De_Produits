package com.kheffache.produits.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kheffache.produits.Repository.CategorieRepository;
import com.kheffache.produits.models.Categorie;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class CategorieRESTController {
	
	
	@Autowired
	 CategorieRepository categorieRepository;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categorie> getAllCategories()
		{
		return categorieRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Categorie getCategorieById(@PathVariable("id") Long id) {
	return categorieRepository.findById(id).get();
	}
	
}
	

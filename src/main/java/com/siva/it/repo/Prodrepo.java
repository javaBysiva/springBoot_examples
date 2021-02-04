package com.siva.it.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.siva.it.Entity.Product;

public interface Prodrepo extends JpaRepository<Product,Integer> {
    
	 // @Query("SELECT e FROM Product e")
	// List<Product> getAllproducr();
}

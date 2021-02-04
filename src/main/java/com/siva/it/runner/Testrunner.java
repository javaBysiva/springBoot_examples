package com.siva.it.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import com.siva.it.Entity.Product;
import com.siva.it.Entity.Vender;
import com.siva.it.repo.Prodrepo;
import com.siva.it.repo.Vendrepo;
@Component
public class Testrunner implements CommandLineRunner {
	  @Autowired
	private Vendrepo vrepo;
	  @Autowired
	private Prodrepo prepo;

	@Override
	public void run(String... args) throws Exception {
		
		/*Vender v =new Vender(10,"siva","HYD");
		Vender v1 =new Vender(20,"ram","GUNTUR");
		//vrepo.save(v);
		//vrepo.save(v1);
		Product p = new Product(18,"Book",20.0, v);
		Product p1 = new Product(19,"PEN",10.0, v1);
		Product p2 = new Product(20,"LAPTOP",20.0, v1);
		Product p3 = new Product(21,"MOBIE",10.0, v);
		prepo.save(p);
		prepo.save(p1);
		prepo.save(p2);
		prepo.save(p3);*/
		  
		 Sort sort= Sort.by("p_cost");
		Iterable<Product> find = prepo.findAll(sort);
		find.forEach(System.out::println);
		//List<Product> prod = prepo.getAllproducr();
		 
		
	}

}

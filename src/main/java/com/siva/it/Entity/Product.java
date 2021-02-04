package com.siva.it.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="prd_tab")
public class Product {
	@Id
	   @Column(name="p_id")
	 private Integer prdId;
	    @Column(name="p_name")
	 private String prdName;
	    @Column(name="p_cost")
	 private Double PrdCost;
	  @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	  @JoinColumn(name="vidFk")
      private Vender ven;
}

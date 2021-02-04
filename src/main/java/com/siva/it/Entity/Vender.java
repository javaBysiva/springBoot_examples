package com.siva.it.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ven_tab")
public class Vender {
	@Id
	@Column(name="v_id")
	private Integer venId;
	@Column(name="v_Name")
	private String venName;
	@Column(name="v_loc")
	private String veCol;

}

package com.inomera.pdks.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personel")
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "kartfc", nullable = false)
	private String kartFc;

	@Column(name = "kartno", nullable = false)
	private String kartNo;

	@OneToMany
	@Column(name = "kartid", nullable = false)
	private String kartID;

	@Column(name = "ad")
	private String ad;
	@Column(name = "kartid")
	private String soyad;
	@Column(name = "kartid")
	private String durum;
}

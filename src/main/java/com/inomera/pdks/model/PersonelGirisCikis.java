package com.inomera.pdks.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pts_giriscikis")
public class PersonelGirisCikis {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	// @Column(name = "personelid", nullable = false)
	// private Integer personelID;

	@ManyToOne
	@JoinColumn(name = "personelid", referencedColumnName = "id", nullable = false)
	private Personel personelid;

	@Column(name = "giristarihi", nullable = true)
	private Timestamp giristarihi;

	@Column(name = "girissaati", nullable = true)
	private Timestamp girissaati;

	@Column(name = "cikistarihi", nullable = true)
	private Timestamp cikistarihi;

	@Column(name = "cikissaati", nullable = true)
	private Timestamp cikissaati;

	@Column(name = "toplamsure", nullable = true)
	private String toplamsure;

	@Column(name = "ellegiris", nullable = true)
	private String elleGiris;

	@Column(name = "ellecikis", nullable = true)
	private String elleCikis;

	@Column(name = "islemturu", nullable = true)
	private String islemTuru;

	@Column(name = "izintipi", nullable = true)
	private String izinTipi;

	@Column(name = "izinturid", nullable = true)
	private Integer izinTurID;

	@Column(name = "izinsure", nullable = true)
	private Timestamp izinSure;

	@Column(name = "aciklama", nullable = true)
	private String aciklama;

	@Column(name = "geciptal")
	private Integer gecIptal;

	@Column(name = "erkiptal")
	private Integer erkIptal;

	@Column(name = "eksiptal")
	private Integer eksIptal;

	@Column(name = "mesaiiptal")
	private Integer mesaiIptal;

	@Column(name = "kapiterminalid", nullable = true)
	private Long kapiTerminalID;

	@Column(name = "giristerminalno", nullable = true)
	private String girisTerminalNo;

	@Column(name = "cikisterminalno", nullable = true)
	private String cikisTerminalNo;

	@Column(name = "kapiterminalkod", nullable = true)
	private String kapiterminalKod;

	@Column(name = "surefarki", nullable = true)
	private Timestamp sureFarki;

	@Column(name = "isurefarki")
	private Long iSureFarki;

	@Column(name = "iizinsure")
	private Long iIzinSure;

	@Column(name = "kartno", nullable = true)
	private String kartNo;

	@Column(name = "uszikesbordroid", nullable = true)
	private Integer usziKesbordroid;

	@Column(name = "girissaati1", nullable = true)
	private Timestamp girisSaati1;

	@Column(name = "cikissaati1", nullable = true)
	private Timestamp cikisSaati1;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Personel getPersonelID() {
		return personelid;
	}

	public void setPersonelID(Personel personelID) {
		this.personelid = personelID;
	}

	public Timestamp getGiristarihi() {
		return giristarihi;
	}

	public void setGiristarihi(Timestamp giristarihi) {
		this.giristarihi = giristarihi;
	}

	public Timestamp getGirissaati() {
		return girissaati;
	}

	public void setGirissaati(Timestamp girissaati) {
		this.girissaati = girissaati;
	}

	public Timestamp getCikistarihi() {
		return cikistarihi;
	}

	public void setCikistarihi(Timestamp cikistarihi) {
		this.cikistarihi = cikistarihi;
	}

	public Timestamp getCikissaati() {
		return cikissaati;
	}

	public void setCikissaati(Timestamp cikissaati) {
		this.cikissaati = cikissaati;
	}

	public String getToplamsure() {
		return toplamsure;
	}

	public void setToplamsure(String toplamsure) {
		this.toplamsure = toplamsure;
	}

	public String getElleGiris() {
		return elleGiris;
	}

	public void setElleGiris(String elleGiris) {
		this.elleGiris = elleGiris;
	}

	public String getElleCikis() {
		return elleCikis;
	}

	public void setElleCikis(String elleCikis) {
		this.elleCikis = elleCikis;
	}

	public String getIslemTuru() {
		return islemTuru;
	}

	public void setIslemTuru(String islemTuru) {
		this.islemTuru = islemTuru;
	}

	public String getIzinTipi() {
		return izinTipi;
	}

	public void setIzinTipi(String izinTipi) {
		this.izinTipi = izinTipi;
	}

	public Integer getIzinTurID() {
		return izinTurID;
	}

	public void setIzinTurID(Integer izinTurID) {
		this.izinTurID = izinTurID;
	}

	public Timestamp getIzinSure() {
		return izinSure;
	}

	public void setIzinSure(Timestamp izinSure) {
		this.izinSure = izinSure;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public Integer getGecIptal() {
		return gecIptal;
	}

	public void setGecIptal(Integer gecIptal) {
		this.gecIptal = gecIptal;
	}

	public Integer getErkIptal() {
		return erkIptal;
	}

	public void setErkIptal(Integer erkIptal) {
		this.erkIptal = erkIptal;
	}

	public Integer getEksIptal() {
		return eksIptal;
	}

	public void setEksIptal(Integer eksIptal) {
		this.eksIptal = eksIptal;
	}

	public Integer getMesaiIptal() {
		return mesaiIptal;
	}

	public void setMesaiIptal(Integer mesaiIptal) {
		this.mesaiIptal = mesaiIptal;
	}

	public Long getKapiTerminalID() {
		return kapiTerminalID;
	}

	public void setKapiTerminalID(Long kapiTerminalID) {
		this.kapiTerminalID = kapiTerminalID;
	}

	public String getGirisTerminalNo() {
		return girisTerminalNo;
	}

	public void setGirisTerminalNo(String girisTerminalNo) {
		this.girisTerminalNo = girisTerminalNo;
	}

	public String getCikisTerminalNo() {
		return cikisTerminalNo;
	}

	public void setCikisTerminalNo(String cikisTerminalNo) {
		this.cikisTerminalNo = cikisTerminalNo;
	}

	public String getKapiterminalKod() {
		return kapiterminalKod;
	}

	public void setKapiterminalKod(String kapiterminalKod) {
		this.kapiterminalKod = kapiterminalKod;
	}

	public Timestamp getSureFarki() {
		return sureFarki;
	}

	public void setSureFarki(Timestamp sureFarki) {
		this.sureFarki = sureFarki;
	}

	public Long getiSureFarki() {
		return iSureFarki;
	}

	public void setiSureFarki(Long iSureFarki) {
		this.iSureFarki = iSureFarki;
	}

	public Long getiIzinSure() {
		return iIzinSure;
	}

	public void setiIzinSure(Long iIzinSure) {
		this.iIzinSure = iIzinSure;
	}

	public String getKartNo() {
		return kartNo;
	}

	public void setKartNo(String kartNo) {
		this.kartNo = kartNo;
	}

	public Integer getUsziKesbordroid() {
		return usziKesbordroid;
	}

	public void setUsziKesbordroid(Integer usziKesbordroid) {
		this.usziKesbordroid = usziKesbordroid;
	}

	public Timestamp getGirisSaati1() {
		return girisSaati1;
	}

	public void setGirisSaati1(Timestamp girisSaati1) {
		this.girisSaati1 = girisSaati1;
	}

	public Timestamp getCikisSaati1() {
		return cikisSaati1;
	}

	public void setCikisSaati1(Timestamp cikisSaati1) {
		this.cikisSaati1 = cikisSaati1;
	}

}
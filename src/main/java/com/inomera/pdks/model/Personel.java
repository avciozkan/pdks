package com.inomera.pdks.model;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Blob;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "personel")
public class Personel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JoinColumn(name = "id", table = "PersonelGirisCikis")
	private Integer id;

	@Column(name = "kartfc", nullable = false)
	private String kartFc;

	@Column(name = "kartno", nullable = false)
	private String kartNo;

	@Column(name = "kartid", nullable = false)
	private String kartID;

	@Column(name = "ad")
	private String ad;

	@Column(name = "soyad")
	private String soyad;

	@Column(name = "sicilno")
	private String sicilNo;

	@Column(name = "durum")
	private String durum;

	@Column(name = "firmaid")
	private String firmaID;

	@Column(name = "grupid")
	private String grupID;

	@Column(name = "bolumid")
	private String bolumID;

	@Column(name = "gorevid")
	private String gorevID;

	@Column(name = "servisid")
	private String servisID;

	@Column(name = "bolgeid")
	private String bolgeID;

	@Column(name = "birimid")
	private String birimID;

	@Column(name = "takimid")
	private String takimID;

	@Column(name = "subeid")
	private String subeID;

	@Column(name = "isegiristarihi")
	private Timestamp iseGirisTarihi;

	@Column(name = "istencikistarihi")
	private Timestamp istenCikisTarihi;

	@Column(name = "istenayrilmanedeni")
	private String istenAyrilmaNedeni;

	@Column(name = "ucret")
	private BigInteger ucret;

	@Column(name = "saatucreti")
	private BigInteger saatUcreti;

	@Column(name = "ucrettipi")
	private String ucretTipi;

	@Column(name = "ucret_onceki")
	private BigInteger ucretOnceki;

	@Column(name = "primucrettipi")
	private String primUcretTipi;

	@Column(name = "primucreti")
	private BigInteger primUcreti;

	@Column(name = "yolucrettipi")
	private String yolUcretTipi;

	@Column(name = "yolucreti")
	private BigInteger yolUcreti;

	@Column(name = "yemekucrettipi")
	private String yemekUcretTipi;

	@Column(name = "yemekucreti")
	private BigInteger yemekUcreti;

	@Column(name = "resim")
	private Blob resim;

	@Column(name = "webadres")
	private String webAdres;

	@Column(name = "vergino")
	private String vergiNo;

	@Column(name = "evtel")
	private String evTel;

	@Column(name = "ceptel")
	private String cepTel;

	@Column(name = "istel")
	private String isTel;

	@Column(name = "email")
	private String email;

	@Column(name = "egitim")
	private String egitim;

	@Column(name = "yabancidil")
	private String yabanciDil;

	@Column(name = "askerlikdurumu")
	private String askerlikDurumu;

	@Column(name = "gozluk")
	private String gozluk;

	@Column(name = "sabika")
	private String sabika;

	@Column(name = "kilo")
	private Integer kilo;

	@Column(name = "boy")
	private Integer boy;

	@Column(name = "ayak")
	private Integer ayak;

	@Column(name = "pan")
	private Integer pan;

	@Column(name = "medenihali")
	private String medeniHali;

	@Column(name = "cocuksayisi")
	private Integer cocukSayisi;

	@Column(name = "esdurumu")
	private String esDurumu;

	@Column(name = "adres")
	private String adres;

	@Column(name = "il")
	private String il;

	@Column(name = "ilce")
	private String ilce;

	@Column(name = "ilksoyad")
	private String ilkSoyad;

	@Column(name = "kimlikno")
	private String kimlikNo;

	@Column(name = "babaad")
	private String babaAd;

	@Column(name = "annead")
	private String anneAd;

	@Column(name = "dogumyeri")
	private String dogumYeri;

	@Column(name = "dogumtarihi")
	private Timestamp dogumTarihi;

	@Column(name = "kangrubu")
	private String kanGrubu;

	@Column(name = "uyruk")
	private String uyruk;

	@Column(name = "cinsiyet")
	private String cinsiyet;

	@Column(name = "nufus_il")
	private String nufusIl;

	@Column(name = "nufus_ilce")
	private String nufusIlce;

	@Column(name = "nufus_mahkoy")
	private String nufusMahKoy;

	@Column(name = "nufus_ciltno")
	private String nufus_ciltno;

	@Column(name = "nufus_ailesirano")
	private String nufus_ailesirano;

	@Column(name = "nufus_sirano")
	private String nufus_sirano;

	@Column(name = "banka_subeadi")
	private String banka_subeadi;

	@Column(name = "banka_hesapno")
	private String banka_hesapno;

	@Column(name = "ehliyet_sinif")
	private String ehliyet_sinif;

	@Column(name = "ehliyet_verililce")
	private String ehliyet_verililce;

	@Column(name = "ehliyet_belgeno")
	private String ehliyet_belgeno;

	@Column(name = "ehliyet_vertarih")
	private Date ehliyet_vertarih;

	@Column(name = "ehliyet_kulcihazprotez")
	private String ehliyet_kulcihazprotez;

	@Column(name = "personelturu")
	private String personelturu;

	@Column(name = "aciklama")
	private String aciklama;

	@Column(name = "gunlukkontor")
	private Integer gunlukkontor;

	@Column(name = "uyedurumu")
	private String uyedurumu;

	@Column(name = "uyebaslamatarihi")
	private Date uyebaslamatarihi;

	@Column(name = "uyebitistarihi")
	private Date uyebitistarihi;

	@Column(name = "odedigitutar")
	private BigDecimal odedigitutar;

	@Column(name = "kalantutar")
	private BigDecimal kalantutar;

	@Column(name = "uyebaslamasaati")
	private Timestamp uyebaslamasaati;

	@Column(name = "uyebitissaati")
	private Timestamp uyebitissaati;

	@Column(name = "ogrenci_kayittarihi")
	private Date ogrenci_kayittarihi;

	@Column(name = "ogrenci_cikistarihi")
	private Date ogrenci_cikistarihi;

	@Column(name = "ogrenci_basariorani")
	private Integer ogrenci_basariorani;

	@Column(name = "ogrenci_grupid")
	private Integer ogrenci_grupid;

	@Column(name = "ogrenci_bolumid")
	private Integer ogrenci_bolumid;

	@Column(name = "ogrenci_sinifid")
	private Integer ogrenci_sinifid;

	@Column(name = "ogretmen_bransid")
	private String ogretmen_bransid;

	@Column(name = "ogretmen_dersid")
	private String ogretmen_dersid;

	@Column(name = "ogrenci_alanturu")
	private String ogrenci_alanturu;

	@Column(name = "ogrenci_geldigiokul")
	private String ogrenci_geldigiokul;

	@Column(name = "ogrenci_sinif")
	private String ogrenci_sinif;

	@Column(name = "ogrenci_bolum")
	private String ogrenci_bolum;

	@Column(name = "ogrenci_okulno")
	private String ogrenci_okulno;

	@Column(name = "ogrenci_veliad")
	private String ogrenci_veliad;

	@Column(name = "ogrenci_velievtel")
	private String ogrenci_velievtel;

	@Column(name = "ogrenci_veliistel")
	private String ogrenci_veliistel;

	@Column(name = "ogrenci_veliceptel")
	private String ogrenci_veliceptel;

	@Column(name = "mesaisaatucreti")
	private BigDecimal mesaisaatucreti;

	@Column(name = "ozelucrettipi")
	private String ozelucrettipi;

	@Column(name = "ozelucret")
	private BigDecimal ozelucret;

	@Column(name = "yetkiid")
	private Integer yetkiid;

	@Column(name = "uyetipiid")
	private Integer uyetipiid;

	@Column(name = "ilkgiristarihi")
	private Date ilkgiristarihi;

	@Column(name = "songiristarihi")
	private Date songiristarihi;

	@Column(name = "toplamgirissayisi")
	private Integer toplamgirissayisi;

	@Column(name = "gecisgrupid")
	private Integer gecisgrupid;

	@Column(name = "gecisyetki")
	private String gecisyetki;

	@Column(name = "toplamkontor")
	private Integer toplamkontor;

	@Column(name = "kalankontor")
	private Integer kalankontor;

	@Column(name = "isegiristarihi1")
	private Date isegiristarihi1;

	@Column(name = "ucret1")
	private BigDecimal ucret1;

	@Column(name = "fazlamesaialir")
	private Integer fazlamesaialir;

	@Column(name = "devamsizlikcezasi")
	private BigDecimal devamsizlikcezasi;

	@Column(name = "agialir")
	private Integer agialir;

	@Column(name = "nufus_cuzdanverildigiyer")
	private String nufus_cuzdanverildigiyer;

	@Column(name = "nufus_cuzdanverilisnedeni")
	private String nufus_cuzdanverilisnedeni;

	@Column(name = "nufus_cuzdankayitno")
	private String nufus_cuzdankayitno;

	@Column(name = "nufus_cuzdanverilistarihi")
	private Date nufus_cuzdanverilistarihi;

	@Column(name = "elbisebedenno")
	private String elbisebedenno;

	@Column(name = "kapiyetki")
	private Integer kapiyetki;

	@Column(name = "yillikizinonceki")
	private Integer yillikizinonceki;

	@Column(name = "saglikraporu1")
	private Date saglikraporu1;

	@Column(name = "saglikraporu2")
	private Date saglikraporu2;

	@Column(name = "saglikraporu3")
	private Date saglikraporu3;

	@Column(name = "ay")
	private Integer ay;

	@Column(name = "parmaktanimlandi")
	private Integer parmaktanimlandi;

	@Column(name = "sgk_no")
	private String sgk_no;

	@Column(name = "sgk_isegiristarihi")
	private Date sgk_isegiristarihi;

	@Column(name = "sgk_istencikiskodu")
	private String sgk_istencikiskodu;

	@Column(name = "sgk_meslekkodu")
	private String sgk_meslekkodu;

	@Column(name = "sgk_calismadonemi")
	private String sgk_calismadonemi;

	@Column(name = "sgk_kapsam")
	private String sgk_kapsam;

	@Column(name = "sgk_ucrettipi")
	private String sgk_ucrettipi;

	@Column(name = "sgk_hesaptipi")
	private String sgk_hesaptipi;

	@Column(name = "sgk_issizliksigortakes")
	private Integer sgk_issizliksigortakes;

	@Column(name = "sgk_grubu")
	private String sgk_grubu;

	@Column(name = "sgk_belgeturu")
	private String sgk_belgeturu;

	@Column(name = "sgk_tabioldugukanun")
	private String sgk_tabioldugukanun;

	@Column(name = "sgk_kanunbitistarihi")
	private Date sgk_kanunbitistarihi;

	@Column(name = "sgk_ozurlulukderecesi")
	private Integer sgk_ozurlulukderecesi;

	@Column(name = "ilkisegiristarihi")
	private Date ilkisegiristarihi;

	@Column(name = "wckesintisiuygula")
	private Integer wckesintisiuygula;

	@Column(name = "ncsaatucreti")
	private BigDecimal ncsaatucreti;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKartFc() {
		return kartFc;
	}

	public void setKartFc(String kartFc) {
		this.kartFc = kartFc;
	}

	public String getKartNo() {
		return kartNo;
	}

	public void setKartNo(String kartNo) {
		this.kartNo = kartNo;
	}

	public String getKartID() {
		return kartID;
	}

	public void setKartID(String kartID) {
		this.kartID = kartID;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}

	public String getFirmaID() {
		return firmaID;
	}

	public void setFirmaID(String firmaID) {
		this.firmaID = firmaID;
	}

	public String getGrupID() {
		return grupID;
	}

	public void setGrupID(String grupID) {
		this.grupID = grupID;
	}

	public String getBolumID() {
		return bolumID;
	}

	public void setBolumID(String bolumID) {
		this.bolumID = bolumID;
	}

	public String getGorevID() {
		return gorevID;
	}

	public void setGorevID(String gorevID) {
		this.gorevID = gorevID;
	}

	public String getServisID() {
		return servisID;
	}

	public void setServisID(String servisID) {
		this.servisID = servisID;
	}

	public String getBolgeID() {
		return bolgeID;
	}

	public void setBolgeID(String bolgeID) {
		this.bolgeID = bolgeID;
	}

	public String getBirimID() {
		return birimID;
	}

	public void setBirimID(String birimID) {
		this.birimID = birimID;
	}

	public String getTakimID() {
		return takimID;
	}

	public void setTakimID(String takimID) {
		this.takimID = takimID;
	}

	public String getSubeID() {
		return subeID;
	}

	public void setSubeID(String subeID) {
		this.subeID = subeID;
	}

	public Timestamp getIseGirisTarihi() {
		return iseGirisTarihi;
	}

	public void setIseGirisTarihi(Timestamp iseGirisTarihi) {
		this.iseGirisTarihi = iseGirisTarihi;
	}

	public Timestamp getIstenCikisTarihi() {
		return istenCikisTarihi;
	}

	public void setIstenCikisTarihi(Timestamp istenCikisTarihi) {
		this.istenCikisTarihi = istenCikisTarihi;
	}

	public String getIstenAyrilmaNedeni() {
		return istenAyrilmaNedeni;
	}

	public void setIstenAyrilmaNedeni(String istenAyrilmaNedeni) {
		this.istenAyrilmaNedeni = istenAyrilmaNedeni;
	}

	public BigInteger getUcret() {
		return ucret;
	}

	public void setUcret(BigInteger ucret) {
		this.ucret = ucret;
	}

	public BigInteger getSaatUcreti() {
		return saatUcreti;
	}

	public void setSaatUcreti(BigInteger saatUcreti) {
		this.saatUcreti = saatUcreti;
	}

	public String getUcretTipi() {
		return ucretTipi;
	}

	public void setUcretTipi(String ucretTipi) {
		this.ucretTipi = ucretTipi;
	}

	public BigInteger getUcretOnceki() {
		return ucretOnceki;
	}

	public void setUcretOnceki(BigInteger ucretOnceki) {
		this.ucretOnceki = ucretOnceki;
	}

	public String getPrimUcretTipi() {
		return primUcretTipi;
	}

	public void setPrimUcretTipi(String primUcretTipi) {
		this.primUcretTipi = primUcretTipi;
	}

	public BigInteger getPrimUcreti() {
		return primUcreti;
	}

	public void setPrimUcreti(BigInteger primUcreti) {
		this.primUcreti = primUcreti;
	}

	public String getYolUcretTipi() {
		return yolUcretTipi;
	}

	public void setYolUcretTipi(String yolUcretTipi) {
		this.yolUcretTipi = yolUcretTipi;
	}

	public BigInteger getYolUcreti() {
		return yolUcreti;
	}

	public void setYolUcreti(BigInteger yolUcreti) {
		this.yolUcreti = yolUcreti;
	}

	public String getYemekUcretTipi() {
		return yemekUcretTipi;
	}

	public void setYemekUcretTipi(String yemekUcretTipi) {
		this.yemekUcretTipi = yemekUcretTipi;
	}

	public BigInteger getYemekUcreti() {
		return yemekUcreti;
	}

	public void setYemekUcreti(BigInteger yemekUcreti) {
		this.yemekUcreti = yemekUcreti;
	}

	public Blob getResim() {
		return resim;
	}

	public void setResim(Blob resim) {
		this.resim = resim;
	}

	public String getWebAdres() {
		return webAdres;
	}

	public void setWebAdres(String webAdres) {
		this.webAdres = webAdres;
	}

	public String getVergiNo() {
		return vergiNo;
	}

	public void setVergiNo(String vergiNo) {
		this.vergiNo = vergiNo;
	}

	public String getEvTel() {
		return evTel;
	}

	public void setEvTel(String evTel) {
		this.evTel = evTel;
	}

	public String getCepTel() {
		return cepTel;
	}

	public void setCepTel(String cepTel) {
		this.cepTel = cepTel;
	}

	public String getIsTel() {
		return isTel;
	}

	public void setIsTel(String isTel) {
		this.isTel = isTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEgitim() {
		return egitim;
	}

	public void setEgitim(String egitim) {
		this.egitim = egitim;
	}

	public String getYabanciDil() {
		return yabanciDil;
	}

	public void setYabanciDil(String yabanciDil) {
		this.yabanciDil = yabanciDil;
	}

	public String getAskerlikDurumu() {
		return askerlikDurumu;
	}

	public void setAskerlikDurumu(String askerlikDurumu) {
		this.askerlikDurumu = askerlikDurumu;
	}

	public String getGozluk() {
		return gozluk;
	}

	public void setGozluk(String gozluk) {
		this.gozluk = gozluk;
	}

	public String getSabika() {
		return sabika;
	}

	public void setSabika(String sabika) {
		this.sabika = sabika;
	}

	public Integer getKilo() {
		return kilo;
	}

	public void setKilo(Integer kilo) {
		this.kilo = kilo;
	}

	public Integer getBoy() {
		return boy;
	}

	public void setBoy(Integer boy) {
		this.boy = boy;
	}

	public Integer getAyak() {
		return ayak;
	}

	public void setAyak(Integer ayak) {
		this.ayak = ayak;
	}

	public Integer getPan() {
		return pan;
	}

	public void setPan(Integer pan) {
		this.pan = pan;
	}

	public String getMedeniHali() {
		return medeniHali;
	}

	public void setMedeniHali(String medeniHali) {
		this.medeniHali = medeniHali;
	}

	public Integer getCocukSayisi() {
		return cocukSayisi;
	}

	public void setCocukSayisi(Integer cocukSayisi) {
		this.cocukSayisi = cocukSayisi;
	}

	public String getEsDurumu() {
		return esDurumu;
	}

	public void setEsDurumu(String esDurumu) {
		this.esDurumu = esDurumu;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getIl() {
		return il;
	}

	public void setIl(String il) {
		this.il = il;
	}

	public String getIlce() {
		return ilce;
	}

	public void setIlce(String ilce) {
		this.ilce = ilce;
	}

	public String getIlkSoyad() {
		return ilkSoyad;
	}

	public void setIlkSoyad(String ilkSoyad) {
		this.ilkSoyad = ilkSoyad;
	}

	public String getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(String kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public String getBabaAd() {
		return babaAd;
	}

	public void setBabaAd(String babaAd) {
		this.babaAd = babaAd;
	}

	public String getAnneAd() {
		return anneAd;
	}

	public void setAnneAd(String anneAd) {
		this.anneAd = anneAd;
	}

	public String getDogumYeri() {
		return dogumYeri;
	}

	public void setDogumYeri(String dogumYeri) {
		this.dogumYeri = dogumYeri;
	}

	public Timestamp getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(Timestamp dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getKanGrubu() {
		return kanGrubu;
	}

	public void setKanGrubu(String kanGrubu) {
		this.kanGrubu = kanGrubu;
	}

	public String getUyruk() {
		return uyruk;
	}

	public void setUyruk(String uyruk) {
		this.uyruk = uyruk;
	}

	public String getCinsiyet() {
		return cinsiyet;
	}

	public void setCinsiyet(String cinsiyet) {
		this.cinsiyet = cinsiyet;
	}

	public String getNufusIl() {
		return nufusIl;
	}

	public void setNufusIl(String nufusIl) {
		this.nufusIl = nufusIl;
	}

	public String getNufusIlce() {
		return nufusIlce;
	}

	public void setNufusIlce(String nufusIlce) {
		this.nufusIlce = nufusIlce;
	}

	public String getNufusMahKoy() {
		return nufusMahKoy;
	}

	public void setNufusMahKoy(String nufusMahKoy) {
		this.nufusMahKoy = nufusMahKoy;
	}

	public String getNufus_ciltno() {
		return nufus_ciltno;
	}

	public void setNufus_ciltno(String nufus_ciltno) {
		this.nufus_ciltno = nufus_ciltno;
	}

	public String getNufus_ailesirano() {
		return nufus_ailesirano;
	}

	public void setNufus_ailesirano(String nufus_ailesirano) {
		this.nufus_ailesirano = nufus_ailesirano;
	}

	public String getNufus_sirano() {
		return nufus_sirano;
	}

	public void setNufus_sirano(String nufus_sirano) {
		this.nufus_sirano = nufus_sirano;
	}

	public String getBanka_subeadi() {
		return banka_subeadi;
	}

	public void setBanka_subeadi(String banka_subeadi) {
		this.banka_subeadi = banka_subeadi;
	}

	public String getBanka_hesapno() {
		return banka_hesapno;
	}

	public void setBanka_hesapno(String banka_hesapno) {
		this.banka_hesapno = banka_hesapno;
	}

	public String getEhliyet_sinif() {
		return ehliyet_sinif;
	}

	public void setEhliyet_sinif(String ehliyet_sinif) {
		this.ehliyet_sinif = ehliyet_sinif;
	}

	public String getEhliyet_verililce() {
		return ehliyet_verililce;
	}

	public void setEhliyet_verililce(String ehliyet_verililce) {
		this.ehliyet_verililce = ehliyet_verililce;
	}

	public String getEhliyet_belgeno() {
		return ehliyet_belgeno;
	}

	public void setEhliyet_belgeno(String ehliyet_belgeno) {
		this.ehliyet_belgeno = ehliyet_belgeno;
	}

	public Date getEhliyet_vertarih() {
		return ehliyet_vertarih;
	}

	public void setEhliyet_vertarih(Date ehliyet_vertarih) {
		this.ehliyet_vertarih = ehliyet_vertarih;
	}

	public String getEhliyet_kulcihazprotez() {
		return ehliyet_kulcihazprotez;
	}

	public void setEhliyet_kulcihazprotez(String ehliyet_kulcihazprotez) {
		this.ehliyet_kulcihazprotez = ehliyet_kulcihazprotez;
	}

	public String getPersonelturu() {
		return personelturu;
	}

	public void setPersonelturu(String personelturu) {
		this.personelturu = personelturu;
	}

	public String getAciklama() {
		return aciklama;
	}

	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}

	public Integer getGunlukkontor() {
		return gunlukkontor;
	}

	public void setGunlukkontor(Integer gunlukkontor) {
		this.gunlukkontor = gunlukkontor;
	}

	public String getUyedurumu() {
		return uyedurumu;
	}

	public void setUyedurumu(String uyedurumu) {
		this.uyedurumu = uyedurumu;
	}

	public Date getUyebaslamatarihi() {
		return uyebaslamatarihi;
	}

	public void setUyebaslamatarihi(Date uyebaslamatarihi) {
		this.uyebaslamatarihi = uyebaslamatarihi;
	}

	public Date getUyebitistarihi() {
		return uyebitistarihi;
	}

	public void setUyebitistarihi(Date uyebitistarihi) {
		this.uyebitistarihi = uyebitistarihi;
	}

	public BigDecimal getOdedigitutar() {
		return odedigitutar;
	}

	public void setOdedigitutar(BigDecimal odedigitutar) {
		this.odedigitutar = odedigitutar;
	}

	public BigDecimal getKalantutar() {
		return kalantutar;
	}

	public void setKalantutar(BigDecimal kalantutar) {
		this.kalantutar = kalantutar;
	}

	public Timestamp getUyebaslamasaati() {
		return uyebaslamasaati;
	}

	public void setUyebaslamasaati(Timestamp uyebaslamasaati) {
		this.uyebaslamasaati = uyebaslamasaati;
	}

	public Timestamp getUyebitissaati() {
		return uyebitissaati;
	}

	public void setUyebitissaati(Timestamp uyebitissaati) {
		this.uyebitissaati = uyebitissaati;
	}

	public Date getOgrenci_kayittarihi() {
		return ogrenci_kayittarihi;
	}

	public void setOgrenci_kayittarihi(Date ogrenci_kayittarihi) {
		this.ogrenci_kayittarihi = ogrenci_kayittarihi;
	}

	public Date getOgrenci_cikistarihi() {
		return ogrenci_cikistarihi;
	}

	public void setOgrenci_cikistarihi(Date ogrenci_cikistarihi) {
		this.ogrenci_cikistarihi = ogrenci_cikistarihi;
	}

	public Integer getOgrenci_basariorani() {
		return ogrenci_basariorani;
	}

	public void setOgrenci_basariorani(Integer ogrenci_basariorani) {
		this.ogrenci_basariorani = ogrenci_basariorani;
	}

	public Integer getOgrenci_grupid() {
		return ogrenci_grupid;
	}

	public void setOgrenci_grupid(Integer ogrenci_grupid) {
		this.ogrenci_grupid = ogrenci_grupid;
	}

	public Integer getOgrenci_bolumid() {
		return ogrenci_bolumid;
	}

	public void setOgrenci_bolumid(Integer ogrenci_bolumid) {
		this.ogrenci_bolumid = ogrenci_bolumid;
	}

	public Integer getOgrenci_sinifid() {
		return ogrenci_sinifid;
	}

	public void setOgrenci_sinifid(Integer ogrenci_sinifid) {
		this.ogrenci_sinifid = ogrenci_sinifid;
	}

	public String getOgretmen_bransid() {
		return ogretmen_bransid;
	}

	public void setOgretmen_bransid(String ogretmen_bransid) {
		this.ogretmen_bransid = ogretmen_bransid;
	}

	public String getOgretmen_dersid() {
		return ogretmen_dersid;
	}

	public void setOgretmen_dersid(String ogretmen_dersid) {
		this.ogretmen_dersid = ogretmen_dersid;
	}

	public String getOgrenci_alanturu() {
		return ogrenci_alanturu;
	}

	public void setOgrenci_alanturu(String ogrenci_alanturu) {
		this.ogrenci_alanturu = ogrenci_alanturu;
	}

	public String getOgrenci_geldigiokul() {
		return ogrenci_geldigiokul;
	}

	public void setOgrenci_geldigiokul(String ogrenci_geldigiokul) {
		this.ogrenci_geldigiokul = ogrenci_geldigiokul;
	}

	public String getOgrenci_sinif() {
		return ogrenci_sinif;
	}

	public void setOgrenci_sinif(String ogrenci_sinif) {
		this.ogrenci_sinif = ogrenci_sinif;
	}

	public String getOgrenci_bolum() {
		return ogrenci_bolum;
	}

	public void setOgrenci_bolum(String ogrenci_bolum) {
		this.ogrenci_bolum = ogrenci_bolum;
	}

	public String getOgrenci_okulno() {
		return ogrenci_okulno;
	}

	public void setOgrenci_okulno(String ogrenci_okulno) {
		this.ogrenci_okulno = ogrenci_okulno;
	}

	public String getOgrenci_veliad() {
		return ogrenci_veliad;
	}

	public void setOgrenci_veliad(String ogrenci_veliad) {
		this.ogrenci_veliad = ogrenci_veliad;
	}

	public String getOgrenci_velievtel() {
		return ogrenci_velievtel;
	}

	public void setOgrenci_velievtel(String ogrenci_velievtel) {
		this.ogrenci_velievtel = ogrenci_velievtel;
	}

	public String getOgrenci_veliistel() {
		return ogrenci_veliistel;
	}

	public void setOgrenci_veliistel(String ogrenci_veliistel) {
		this.ogrenci_veliistel = ogrenci_veliistel;
	}

	public String getOgrenci_veliceptel() {
		return ogrenci_veliceptel;
	}

	public void setOgrenci_veliceptel(String ogrenci_veliceptel) {
		this.ogrenci_veliceptel = ogrenci_veliceptel;
	}

	public BigDecimal getMesaisaatucreti() {
		return mesaisaatucreti;
	}

	public void setMesaisaatucreti(BigDecimal mesaisaatucreti) {
		this.mesaisaatucreti = mesaisaatucreti;
	}

	public String getOzelucrettipi() {
		return ozelucrettipi;
	}

	public void setOzelucrettipi(String ozelucrettipi) {
		this.ozelucrettipi = ozelucrettipi;
	}

	public BigDecimal getOzelucret() {
		return ozelucret;
	}

	public void setOzelucret(BigDecimal ozelucret) {
		this.ozelucret = ozelucret;
	}

	public Integer getYetkiid() {
		return yetkiid;
	}

	public void setYetkiid(Integer yetkiid) {
		this.yetkiid = yetkiid;
	}

	public Integer getUyetipiid() {
		return uyetipiid;
	}

	public void setUyetipiid(Integer uyetipiid) {
		this.uyetipiid = uyetipiid;
	}

	public Date getIlkgiristarihi() {
		return ilkgiristarihi;
	}

	public void setIlkgiristarihi(Date ilkgiristarihi) {
		this.ilkgiristarihi = ilkgiristarihi;
	}

	public Date getSongiristarihi() {
		return songiristarihi;
	}

	public void setSongiristarihi(Date songiristarihi) {
		this.songiristarihi = songiristarihi;
	}

	public Integer getToplamgirissayisi() {
		return toplamgirissayisi;
	}

	public void setToplamgirissayisi(Integer toplamgirissayisi) {
		this.toplamgirissayisi = toplamgirissayisi;
	}

	public Integer getGecisgrupid() {
		return gecisgrupid;
	}

	public void setGecisgrupid(Integer gecisgrupid) {
		this.gecisgrupid = gecisgrupid;
	}

	public String getGecisyetki() {
		return gecisyetki;
	}

	public void setGecisyetki(String gecisyetki) {
		this.gecisyetki = gecisyetki;
	}

	public Integer getToplamkontor() {
		return toplamkontor;
	}

	public void setToplamkontor(Integer toplamkontor) {
		this.toplamkontor = toplamkontor;
	}

	public Integer getKalankontor() {
		return kalankontor;
	}

	public void setKalankontor(Integer kalankontor) {
		this.kalankontor = kalankontor;
	}

	public Date getIsegiristarihi1() {
		return isegiristarihi1;
	}

	public void setIsegiristarihi1(Date isegiristarihi1) {
		this.isegiristarihi1 = isegiristarihi1;
	}

	public BigDecimal getUcret1() {
		return ucret1;
	}

	public void setUcret1(BigDecimal ucret1) {
		this.ucret1 = ucret1;
	}

	public Integer getFazlamesaialir() {
		return fazlamesaialir;
	}

	public void setFazlamesaialir(Integer fazlamesaialir) {
		this.fazlamesaialir = fazlamesaialir;
	}

	public BigDecimal getDevamsizlikcezasi() {
		return devamsizlikcezasi;
	}

	public void setDevamsizlikcezasi(BigDecimal devamsizlikcezasi) {
		this.devamsizlikcezasi = devamsizlikcezasi;
	}

	public Integer getAgialir() {
		return agialir;
	}

	public void setAgialir(Integer agialir) {
		this.agialir = agialir;
	}

	public String getNufus_cuzdanverildigiyer() {
		return nufus_cuzdanverildigiyer;
	}

	public void setNufus_cuzdanverildigiyer(String nufus_cuzdanverildigiyer) {
		this.nufus_cuzdanverildigiyer = nufus_cuzdanverildigiyer;
	}

	public String getNufus_cuzdanverilisnedeni() {
		return nufus_cuzdanverilisnedeni;
	}

	public void setNufus_cuzdanverilisnedeni(String nufus_cuzdanverilisnedeni) {
		this.nufus_cuzdanverilisnedeni = nufus_cuzdanverilisnedeni;
	}

	public String getNufus_cuzdankayitno() {
		return nufus_cuzdankayitno;
	}

	public void setNufus_cuzdankayitno(String nufus_cuzdankayitno) {
		this.nufus_cuzdankayitno = nufus_cuzdankayitno;
	}

	public Date getNufus_cuzdanverilistarihi() {
		return nufus_cuzdanverilistarihi;
	}

	public void setNufus_cuzdanverilistarihi(Date nufus_cuzdanverilistarihi) {
		this.nufus_cuzdanverilistarihi = nufus_cuzdanverilistarihi;
	}

	public String getElbisebedenno() {
		return elbisebedenno;
	}

	public void setElbisebedenno(String elbisebedenno) {
		this.elbisebedenno = elbisebedenno;
	}

	public Integer getKapiyetki() {
		return kapiyetki;
	}

	public void setKapiyetki(Integer kapiyetki) {
		this.kapiyetki = kapiyetki;
	}

	public Integer getYillikizinonceki() {
		return yillikizinonceki;
	}

	public void setYillikizinonceki(Integer yillikizinonceki) {
		this.yillikizinonceki = yillikizinonceki;
	}

	public Date getSaglikraporu1() {
		return saglikraporu1;
	}

	public void setSaglikraporu1(Date saglikraporu1) {
		this.saglikraporu1 = saglikraporu1;
	}

	public Date getSaglikraporu2() {
		return saglikraporu2;
	}

	public void setSaglikraporu2(Date saglikraporu2) {
		this.saglikraporu2 = saglikraporu2;
	}

	public Date getSaglikraporu3() {
		return saglikraporu3;
	}

	public void setSaglikraporu3(Date saglikraporu3) {
		this.saglikraporu3 = saglikraporu3;
	}

	public Integer getAy() {
		return ay;
	}

	public void setAy(Integer ay) {
		this.ay = ay;
	}

	public Integer getParmaktanimlandi() {
		return parmaktanimlandi;
	}

	public void setParmaktanimlandi(Integer parmaktanimlandi) {
		this.parmaktanimlandi = parmaktanimlandi;
	}

	public String getSgk_no() {
		return sgk_no;
	}

	public void setSgk_no(String sgk_no) {
		this.sgk_no = sgk_no;
	}

	public Date getSgk_isegiristarihi() {
		return sgk_isegiristarihi;
	}

	public void setSgk_isegiristarihi(Date sgk_isegiristarihi) {
		this.sgk_isegiristarihi = sgk_isegiristarihi;
	}

	public String getSgk_istencikiskodu() {
		return sgk_istencikiskodu;
	}

	public void setSgk_istencikiskodu(String sgk_istencikiskodu) {
		this.sgk_istencikiskodu = sgk_istencikiskodu;
	}

	public String getSgk_meslekkodu() {
		return sgk_meslekkodu;
	}

	public void setSgk_meslekkodu(String sgk_meslekkodu) {
		this.sgk_meslekkodu = sgk_meslekkodu;
	}

	public String getSgk_calismadonemi() {
		return sgk_calismadonemi;
	}

	public void setSgk_calismadonemi(String sgk_calismadonemi) {
		this.sgk_calismadonemi = sgk_calismadonemi;
	}

	public String getSgk_kapsam() {
		return sgk_kapsam;
	}

	public void setSgk_kapsam(String sgk_kapsam) {
		this.sgk_kapsam = sgk_kapsam;
	}

	public String getSgk_ucrettipi() {
		return sgk_ucrettipi;
	}

	public void setSgk_ucrettipi(String sgk_ucrettipi) {
		this.sgk_ucrettipi = sgk_ucrettipi;
	}

	public String getSgk_hesaptipi() {
		return sgk_hesaptipi;
	}

	public void setSgk_hesaptipi(String sgk_hesaptipi) {
		this.sgk_hesaptipi = sgk_hesaptipi;
	}

	public Integer getSgk_issizliksigortakes() {
		return sgk_issizliksigortakes;
	}

	public void setSgk_issizliksigortakes(Integer sgk_issizliksigortakes) {
		this.sgk_issizliksigortakes = sgk_issizliksigortakes;
	}

	public String getSgk_grubu() {
		return sgk_grubu;
	}

	public void setSgk_grubu(String sgk_grubu) {
		this.sgk_grubu = sgk_grubu;
	}

	public String getSgk_belgeturu() {
		return sgk_belgeturu;
	}

	public void setSgk_belgeturu(String sgk_belgeturu) {
		this.sgk_belgeturu = sgk_belgeturu;
	}

	public String getSgk_tabioldugukanun() {
		return sgk_tabioldugukanun;
	}

	public void setSgk_tabioldugukanun(String sgk_tabioldugukanun) {
		this.sgk_tabioldugukanun = sgk_tabioldugukanun;
	}

	public Date getSgk_kanunbitistarihi() {
		return sgk_kanunbitistarihi;
	}

	public void setSgk_kanunbitistarihi(Date sgk_kanunbitistarihi) {
		this.sgk_kanunbitistarihi = sgk_kanunbitistarihi;
	}

	public Integer getSgk_ozurlulukderecesi() {
		return sgk_ozurlulukderecesi;
	}

	public void setSgk_ozurlulukderecesi(Integer sgk_ozurlulukderecesi) {
		this.sgk_ozurlulukderecesi = sgk_ozurlulukderecesi;
	}

	public Date getIlkisegiristarihi() {
		return ilkisegiristarihi;
	}

	public void setIlkisegiristarihi(Date ilkisegiristarihi) {
		this.ilkisegiristarihi = ilkisegiristarihi;
	}

	public Integer getWckesintisiuygula() {
		return wckesintisiuygula;
	}

	public void setWckesIntegerisiuygula(Integer wckesintisiuygula) {
		this.wckesintisiuygula = wckesintisiuygula;
	}

	public BigDecimal getNcsaatucreti() {
		return ncsaatucreti;
	}

	public void setNcsaatucreti(BigDecimal ncsaatucreti) {
		this.ncsaatucreti = ncsaatucreti;
	}

}
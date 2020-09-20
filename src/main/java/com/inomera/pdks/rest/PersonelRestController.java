package com.inomera.pdks.rest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.inomera.pdks.excel.ExcelGenerator;
import com.inomera.pdks.model.Personel;
import com.inomera.pdks.spring.data.PersonelRepository;

import net.minidev.json.JSONObject;

@RestController
public class PersonelRestController {
	@Autowired
	PersonelRepository personelRepository;

	@RequestMapping(path = "/per/{ad}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Personel show(@PathVariable String ad, HttpServletRequest request) {
		return personelRepository.findByAd(ad);
	}

	@RequestMapping(path = "/per/json/{ad}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody JSONObject showJSON(@PathVariable String ad, HttpServletRequest request) {
		JSONObject object = new JSONObject();
		Personel personel = personelRepository.findByAd(ad);

		object.appendField("id", personel.getId());
		object.appendField("ad", personel.getAd());
		object.appendField("soyad", personel.getSoyad());
		object.appendField("durum", personel.getDurum());
		object.appendField("kart_no", personel.getKartNo());
		object.appendField("ise_giris_tarihi", personel.getIseGirisTarihi());
		object.appendField("email", personel.getEmail());
		object.appendField("firma_id", personel.getFirmaID());
		object.appendField("grup_id", personel.getGrupID());
		object.appendField("bolum_id", personel.getBolumID());

		return object;
		// return personelRepository.findByAd(ad);
	}

	@GetMapping(value = "/download/personel.xlsx")
	public ResponseEntity<InputStreamResource> excelCustomersReport() throws IOException {
		List<Personel> personels = (List<Personel>) personelRepository.findAll();

		ByteArrayInputStream in = ExcelGenerator.allPersonelToExcel(personels);
		// return IOUtils.toByteArray(in);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=customers.xlsx");

		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}
}

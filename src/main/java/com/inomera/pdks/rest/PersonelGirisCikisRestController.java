package com.inomera.pdks.rest;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.inomera.pdks.excel.ExcelGenerator;
import com.inomera.pdks.model.PersonelGirisCikis;
import com.inomera.pdks.spring.data.PersonelGirisCikisRepository;
import com.inomera.pdks.spring.data.PersonelRepository;
import com.inomera.pdks.util.PdksUtil;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;

@RestController
public class PersonelGirisCikisRestController {
	@Autowired
	PersonelGirisCikisRepository personelGirisCikisRepository;

	@Autowired
	PersonelRepository personelRepository;

	@RequestMapping(path = "/gircik/{per_id}", method = RequestMethod.GET)
	public JSONObject getPersonel(@PathVariable(name = "per_id") int perId) {
		JSONObject jsonObjectPersonel = new JSONObject();

		List<PersonelGirisCikis> girCik = personelGirisCikisRepository.findByPersonelID(perId);

		jsonObjectPersonel.appendField("AD",
				girCik.get(0).getPersonelID().getAd() + " " + girCik.get(0).getPersonelID().getSoyad());
		jsonObjectPersonel.appendField("personel_id", girCik.get(0).getPersonelID().getId());
		JSONArray array = new JSONArray();
		for (PersonelGirisCikis personelGirisCikis : girCik) {
			JSONObject jsonObject = new JSONObject();
			jsonObject.appendField("personel_giris_tarihi",
					PdksUtil.getDateOfTime(personelGirisCikis.getGiristarihi()));
			jsonObject.appendField("personel_giris_saati", PdksUtil.getHourOfTime(personelGirisCikis.getGirissaati()));
			jsonObject.appendField("personel_cikis_tarihi",
					PdksUtil.getDateOfTime(personelGirisCikis.getCikistarihi()));
			jsonObject.appendField("personel_cikis_saati", PdksUtil.getHourOfTime(personelGirisCikis.getCikissaati()));
			array.add(jsonObject);
		}

		JSONObject finalJsonObjectPersonel = new JSONObject();
		finalJsonObjectPersonel.put("personel_bilgileri", array);

		return finalJsonObjectPersonel;
	}

	@RequestMapping(path = "/giriscikis/excel/{yil}-{ay}-{per_id}.xlsx", method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> getPersonelGirisCikisExcelOnePerson(
			@PathVariable(name = "per_id") int perId, @PathVariable(name = "yil") int yil,
			@PathVariable(name = "ay") int ay) throws IOException {
		List<PersonelGirisCikis> girisCikisList = personelGirisCikisRepository.findByPersonelID(perId, yil, ay);

		ByteArrayInputStream in = ExcelGenerator.allPersonelGirisCikisToExcel(girisCikisList);
		final String fileName = girisCikisList.get(0).getPersonelID().getAd() + ""
				+ girisCikisList.get(0).getPersonelID().getSoyad() + ""
				+ girisCikisList.get(0).getPersonelID().getId().toString();

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=" + fileName + ".xlsx");

		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}

	@RequestMapping(path = "/giriscikis/excel/personels.xlsx", method = RequestMethod.GET)
	public ResponseEntity<InputStreamResource> getPersonelGirisCikisExcelAllPerson(
			@PathVariable(name = "per_id") int perId, @PathVariable(name = "yil") int yil,
			@PathVariable(name = "ay") int ay) throws IOException {
		List<PersonelGirisCikis> girisCikisList = personelGirisCikisRepository.findByPersonelID(perId, yil, ay);

		ByteArrayInputStream in = ExcelGenerator.allPersonelGirisCikisToExcel(girisCikisList);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "attachment; filename=personels.xlsx");

		return ResponseEntity.ok().headers(headers).body(new InputStreamResource(in));
	}
}

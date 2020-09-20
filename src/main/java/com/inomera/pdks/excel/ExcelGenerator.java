package com.inomera.pdks.excel;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Objects;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.inomera.pdks.model.Personel;
import com.inomera.pdks.model.PersonelGirisCikis;

public class ExcelGenerator {
	public static ByteArrayInputStream allPersonelToExcel(List<Personel> personelList) throws IOException {
		String[] COLUMNs = { "ID", "Personel", "Tarih", "İlk Giriş", "Son Çıkış", "Toplam Süre",
				"Dışarıda Geçirilen Süre", "Net Süre", "Eksik/Fazla Çalışma", "Günlük Mesai Süresi",
				"Öğle Tatili Süresi", "Hata Sayısı" };
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			CreationHelper createHelper = workbook.getCreationHelper();

			Sheet sheet = workbook.createSheet("Personels");

			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerFont.setColor(IndexedColors.BLUE.getIndex());

			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFont(headerFont);

			// Row for Header
			Row headerRow = sheet.createRow(0);

			// Header
			for (int col = 0; col < COLUMNs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(COLUMNs[col]);
				cell.setCellStyle(headerCellStyle);
			}

			// CellStyle for Age
			CellStyle ageCellStyle = workbook.createCellStyle();
			ageCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("#"));

			int rowIdx = 1;
			for (Personel prsnl : personelList) {
				Row row = sheet.createRow(rowIdx++);
				if (rowIdx == 2) {
					row.createCell(0).setCellValue(prsnl.getId());
				}
				row.createCell(0).setCellValue(prsnl.getId());
				row.createCell(1).setCellValue(prsnl.getAd());
				row.createCell(2).setCellValue(prsnl.getAdres());

				Cell ageCell = row.createCell(3);
				ageCell.setCellValue(prsnl.getEmail());
				ageCell.setCellStyle(ageCellStyle);
			}

			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		}
	}

	public static ByteArrayInputStream allPersonelGirisCikisToExcel(List<PersonelGirisCikis> personelList)
			throws IOException {
		String[] COLUMNs = { "ID", "Personel", "Tarih", "İlk Giriş", "Son Çıkış", "Toplam Süre",
				"Dışarıda Geçirilen Süre", "Net Süre", "Eksik/Fazla Çalışma", "Günlük Mesai Süresi",
				"Öğle Tatili Süresi", "Hata Sayısı" };
		try (Workbook workbook = new XSSFWorkbook(); ByteArrayOutputStream out = new ByteArrayOutputStream();) {
			CreationHelper createHelper = workbook.getCreationHelper();

			Sheet sheet = workbook.createSheet("Personels");

			Font headerFont = workbook.createFont();
			headerFont.setBold(true);
			headerFont.setColor(IndexedColors.BLUE.getIndex());

			CellStyle headerCellStyle = workbook.createCellStyle();
			headerCellStyle.setFont(headerFont);

			// Row for Header
			Row headerRow = sheet.createRow(0);

			// Header
			for (int col = 0; col < COLUMNs.length; col++) {
				Cell cell = headerRow.createCell(col);
				cell.setCellValue(COLUMNs[col]);
				cell.setCellStyle(headerCellStyle);
			}

			// CellStyle for Age
			CellStyle ageCellStyle = workbook.createCellStyle();
			ageCellStyle.setDataFormat(createHelper.createDataFormat().getFormat("#"));

			int rowIdx = 1;
			for (PersonelGirisCikis prsnl : personelList) {
				Row row = sheet.createRow(rowIdx++);
				if (rowIdx == 2) {
					row.createCell(0)
							.setCellValue(prsnl.getPersonelID().getAd() + " " + prsnl.getPersonelID().getSoyad());
					row.createCell(1).setCellValue(prsnl.getPersonelID().getId());
				}
				row.createCell(2)
						.setCellValue(Objects.nonNull(prsnl.getGiristarihi())
								? new SimpleDateFormat("dd.MM.yyyy").format(prsnl.getGiristarihi())
								: "");
				row.createCell(3)
						.setCellValue(Objects.nonNull(prsnl.getGirissaati())
								? new SimpleDateFormat("HH.mm.ss").format(prsnl.getGirissaati())
								: "");

				// Cell ageCell = row.createCell(3);
				// ageCell.setCellValue(prsnl.getEmail());
				// ageCell.setCellStyle(ageCellStyle);
			}

			workbook.write(out);
			return new ByteArrayInputStream(out.toByteArray());
		}
	}
}

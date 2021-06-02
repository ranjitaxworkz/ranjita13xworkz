package com.xworkz.xworkzapp.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.xworkz.xworkzapp.dto.InstagramDTO;

public class ReadingFromExcel {
	
	public List<InstagramDTO> ReadFromExcel() throws IOException {

		List list = new ArrayList();
		// ClassLoader classLoader = TestUtil.class.getClassLoader();
		String excelFilePath = "D:/excel/Insta XLSX Worksheet.xlsx";
		
		FileInputStream inputStream = new FileInputStream(excelFilePath);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = sheet.iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			if (nextRow.getRowNum() == 0)
				continue;

			InstagramDTO dto = new InstagramDTO();
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				int columnIndex = cell.getColumnIndex();
				switch (columnIndex + 1) {
				case 1:
					dto.setUserName(cell.getStringCellValue());
					break;
				case 2:
					dto.setPassword(cell.getStringCellValue());
					break;
				case 3:
					dto.setType(cell.getStringCellValue());
					break;
				case 4:
					dto.setActive(cell.getBooleanCellValue());
					break;
				case 5:
					dto.setNoOfFollowers((int) cell.getNumericCellValue());
					break;
				}

			}
			list.add(dto);
		}

		workbook.close();
		inputStream.close();
		return list;
	}

}

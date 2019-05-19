package com.cp.autotest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	@SuppressWarnings({ "resource", "deprecation" })
	public static void main(String[] args) throws IOException {

		File src = new File("C:\\Users\\CP\\Desktop\\TestData.xlsx");

		FileInputStream fs = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fs);

		/* XSSFSheet sh = wb.getSheet("Sheet2"); */
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int rowcount = sheet1.getLastRowNum();
		System.out.println("Total Row " + rowcount);
		for (int i = 0; i < rowcount + 1; i++) {
			System.out.println(i);
			Cell cell1 = sheet1.getRow(i).getCell(0);
			System.out.println(cell1.getCellType());
			switch (cell1.getCellType()) {

			case Cell.CELL_TYPE_NUMERIC:
				System.out.println(sheet1.getRow(i).getCell(0).getNumericCellValue());
				break;

			case Cell.CELL_TYPE_STRING:
				System.out.println(sheet1.getRow(i).getCell(0).getStringCellValue());
				break;
			}

		}
	}

}

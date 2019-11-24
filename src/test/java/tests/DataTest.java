package tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class DataTest {

	String filePath = "C:\\Users\\Anir\\eclipse-workspace\\TestNG_sample\\utils\\TestData.xlsx";

	@Test
	public void f() {
		FileInputStream fis;
		Workbook wb;

		try {
			fis = new FileInputStream(filePath);
			wb = new XSSFWorkbook(fis);

			Sheet ws = wb.getSheet("Sheet1");

			int rowCount = ws.getLastRowNum();
			int colCount = ws.getRow(0).getLastCellNum();

			for (int i = 0; i <= rowCount; i++) {
				for (int j = 0; j <= colCount; j++) {
					String cellVal = ws.getRow(i).getCell(j).getStringCellValue();
					System.out.println(cellVal);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

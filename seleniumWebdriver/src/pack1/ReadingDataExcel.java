package pack1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataExcel {

	public static void main(String[] args) throws IOException {

		// Validate login Functionality with data driven

		FileInputStream fi = new FileInputStream("E:\\SampleData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("Sheet1");

		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		System.out.println(sheet.getRow(0).getCell(1).getNumericCellValue());

		int rows = sheet.getLastRowNum();

		for (int i = 0; i <= rows; i++) {

			int cols = sheet.getRow(i).getLastCellNum();

			for (int j = 0; j <= cols; j++) {

				String data = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(data);
			}
		}

		book.close();
	}
}

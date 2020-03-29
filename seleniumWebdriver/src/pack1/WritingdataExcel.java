package pack1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingdataExcel {

	public static void main(String[] args) throws IOException {
		
		File file = new File("E:\\SampleData.xlsx");
		
		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fi);
		XSSFSheet sheet = book.getSheet("Sheet1");
		// Writing
		sheet.getRow(2).createCell(3).setCellValue("Hello");
		sheet.createRow(6).createCell(0).setCellValue(12345);
		
		FileOutputStream fo = new FileOutputStream(file);
		book.write(fo); // Saving the workbook with changes
		
		book.close();
		fi.close();
		
	}
}

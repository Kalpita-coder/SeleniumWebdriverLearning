package day40;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

       // FileOutputStream file=new FileOutputStream("/Users/kalpitaraul/eclipse-workspace/seleniumwebdriver/TestData/myfile.xls");
//path useing currnt project location + file path
	//	FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"/TestData/myfile.x1sx");

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("Data");

		XSSFRow row1=sheet.createRow(0);
		row1.createCell(0).setCellValue("Java");
		row1.createCell(1).setCellValue (1234);
		row1.createCell(2).setCellValue("Automation");

		XSSFRow row2=sheet.createRow(1);
		row2.createCell(0).setCellValue("php");
		row2.createCell(1) .setCellValue (5555);
		row2.createCell(2).setCellValue("Automation test");

		XSSFRow row3 =sheet.createRow(2);
		row3.createCell(0).setCellValue("React");
		row3.createCell(1) .setCellValue (7777);
		row3.createCell(2).setCellValue("Automation test");

		FileOutputStream file=new FileOutputStream("/Users/kalpitaraul/eclipse-workspace/seleniumwebdriver/TestData/myfile.xls");

		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("File is created.....");

	}

}

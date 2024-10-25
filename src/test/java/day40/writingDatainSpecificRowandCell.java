package day40;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class writingDatainSpecificRowandCell {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileOutputStream file=new FileOutputStream("/Users/kalpitaraul/eclipse-workspace/seleniumwebdriver/TestData/data2.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet ("Sheet1");
		XSSFRow row=sheet.createRow(3);
		XSSFCell cell =row.createCell(4);

		workbook.write(file);
		workbook.close();
		file.close();

		System.out.println("File is created.....");

	}

}

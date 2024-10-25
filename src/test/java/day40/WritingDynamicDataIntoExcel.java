package day40;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("DynamicData");

		Scanner sc=new Scanner (System.in);
		System.out.println("Enter how many rows?");
		int noofrows=sc.nextInt();
		System.out.println("Enter how many cells?");
		int noofcells=sc.nextInt();

		for (int r=0;r<=noofrows;r++)
		{
		  XSSFRow currentRow=sheet.createRow(r);
		for (int c=0;c<noofcells;c++)
		 {
		   XSSFCell cell=currentRow.createCell(c);
		   cell.setCellValue(sc.next()) ;
		 }
		}
        FileOutputStream file=new FileOutputStream("/Users/kalpitaraul/eclipse-workspace/seleniumwebdriver/TestData/DynamicFile.xls");
		workbook.write(file);//attach workbook to file
		workbook.close();

		file.close();
		System.out.println("dynamic File is created.....");

	}

}

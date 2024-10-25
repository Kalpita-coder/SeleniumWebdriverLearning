package day40;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class readingDataFromExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//FileInputStream file=new FileInputStream("specify the test data file path");
		FileInputStream file=new FileInputStream("/Users/kalpitaraul/eclipse-workspace/seleniumwebdriver/TestData/data.xlsx");
		//HSSFWorkbook hssfWorkbook=new HSSFWorkbook(file);

        XSSFSheet sheet;
        try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {

            // XSSFSheet sheet=workbook.getSheetAt(0);
            sheet = workbook.getSheet("Sheet1");
        }
        //XSSF sheet=hssfWorkbook.getSheet("Sheet1");
		int totalRows=sheet.getLastRowNum();
		int totalCells=sheet.getRow(0).getLastCellNum();

		System.out.println("Num of rows" + totalRows );
		System.out.println("Num of columns"+ totalCells);
		/*
		for (int r=0;r<=totalRows;r++)
		{
			XSSFRow currentRow=sheet.getRow(r);
		for(int c=0;c<totalCells;c++)
			{
			XSSFCell cell=currentRow.getCell(c);

			System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}

		 */


	}

}

package day40;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadDataFromExcel {

      public static void main(String[] args) throws IOException {
          FileInputStream fileInputStream=new FileInputStream("/Users/kalpitaraul/eclipse-workspace/seleniumwebdriver/TestData/data.xlsx");
          XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
          Sheet sheet=xssfWorkbook.getSheet("Sheet1");
          int total=sheet.getLastRowNum();
          System.out.println(total);
          System.out.println(sheet.getRow(0).getLastCellNum());
      }
}


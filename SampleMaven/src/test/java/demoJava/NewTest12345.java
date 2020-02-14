package demoJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class NewTest12345 {
  @Test
  public void f() throws Exception {
	  
	  
	  File myf1=new File("C:\\Users\\Training1\\Desktop\\pro.xlsx");
	  FileInputStream fis=new FileInputStream(myf1);
	  XSSFWorkbook wb=new XSSFWorkbook(fis);
	  XSSFSheet sh=wb.getSheetAt(0);
	  int rws=sh.getLastRowNum();
	  for(int i=1;i<=rws;i++)
	  {
		  String u_name=sh.getRow(i).getCell(0).getStringCellValue();
		  String pswrd=sh.getRow(i).getCell(1).getStringCellValue();
		  System.out.println("username this time is:"+u_name);
		  System.out.println("password this time is:"+pswrd);
		//  String A_txt=driver.findElement(By.xpath("").getTitle();
		  sh.getRow(i).createCell(2).setCellValue("Login Success");
		  FileOutputStream fout=new FileOutputStream(new File("C:\\\\Users\\\\Training1\\\\Desktop\\\\pro.xlsx"));
		  wb.write(fout);
		  
	  }
	  wb.close();
  }
}

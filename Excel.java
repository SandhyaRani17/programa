package TestAutomate;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
public class Excel {
	void  Export(int Col1, int Row1, String Data) throws IOException, WriteException, BiffException
	{
	File file1= new File("C:\\Users\\admin\\Desktop\\TestcaseOne.xls");
	Workbook workbook1 = Workbook.getWorkbook(file1);
		File file2= new File("C:\\Users\\admin\\Desktop\\TestcaseOne.xls");
	    WritableWorkbook copy = Workbook.createWorkbook(file1, workbook1);
	    WritableSheet sheet = copy.getSheet(0); 
		Label lable1= new Label(Col1,Row1,Data);
		System.out.println(lable1);
		sheet.addCell(lable1);
		copy.write();
		copy.close();
		workbook1.close();
}
}

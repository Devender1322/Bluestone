package bluestone;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldata {

	public static void main(String[] args) throws IOException  {
		File source = new File("E:\\walls\\ss\\testfile.xlsx");
		
		FileInputStream data = new FileInputStream(source);
		
		XSSFWorkbook xxs = new XSSFWorkbook(data);
		
		XSSFSheet sheet = xxs.getSheetAt(0);
		
		String SQ = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(SQ);
	}

}

package utils;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFShape;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	static String projectPath ;
	static XSSFWorkbook workbook ;
	static XSSFSheet sheet;
	
	public ExcelUtils(String excelPath,String sheetName ){
		
		
	}
	
	public static void main(String args[]) {
		getRowCount();
		getCellDataString(0,0);
		getCellDataNumber(1,1);
	}
	
	public static void getRowCount() {		
		try {
			projectPath=System.getProperty("user.dir");
			workbook = new XSSFWorkbook(projectPath+"/excel/Testdata.xlsx");
			sheet=workbook.getSheet("sheet1");
			int rowCount=sheet.getPhysicalNumberOfRows();
			System.out.println("No of rows : "+rowCount);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
	
	public static void getCellDataString(int rowNum, int colNum) {
		projectPath=System.getProperty("user.dir");
		try {
			workbook= new XSSFWorkbook(projectPath+"/excel/Testdata.xlsx");
			sheet=workbook.getSheet("Sheet1");
			String cellData=sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println(cellData);
		} catch (Exception e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static void getCellDataNumber(int rowNum,int colNum) {
		projectPath=System.getProperty("user.dir");
		try {
			workbook=new XSSFWorkbook(projectPath+"/excel/Testdata.xlsx");
			sheet = workbook.getSheet("sheet1");
			double numericCellData=sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(numericCellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
	}
}

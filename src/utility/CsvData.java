package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import au.com.bytecode.opencsv.CSVReader;

public class CsvData {
	public static XSSFSheet sheet;
	
	/**
	 * This method implements how to get the specified sheetname.
	 * @param firepath
	 * @param sheetname
	 */
	public static void setPath(String path, String sheetName){
		FileInputStream fs;
		try {
			fs = new FileInputStream(path);
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			Log.error("Package utilly||Class ExcelData||Method setPath " + e.getMessage());
			e.printStackTrace();
		}
		
	}	
	
	public static List<String[]> getLocatorsFromObjectsFile(){
		CSVReader csvReader;
		List<String[]> lists =new ArrayList<>();
				
		try {
				csvReader = new CSVReader(new FileReader(Contants.path + Contants.csvFileName));
				lists = csvReader.readAll();
				csvReader.close();
			} catch (IOException e) {
				Log.error("Fail to get the web locators from ObjectRepository file. ");
				e.printStackTrace();
			} 
				
		return lists;
	}
	
}

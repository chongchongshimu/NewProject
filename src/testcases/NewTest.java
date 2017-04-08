package testcases;

import java.util.List;

import org.testng.annotations.Test;

import utility.CsvData;

public class NewTest {
  @Test
  public void f() {
	  String name;
	  String locator;
	  String path;
	  
	  List<String[]> list = CsvData.getLocatorsFromObjectsFile();
	  for(String[] s : list){
		  int len = s.length;
//		  System.out.println("len = " + len);
		  for(int i=0; i < s.length;i++){
			  System.out.print(s[i] + ",");
		  }
		  System.out.println();
	  }
	  
  }
}

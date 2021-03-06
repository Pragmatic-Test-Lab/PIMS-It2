package com.ptl.PIMS.util;

import com.ptl.PIMS.TestCases.TestBase;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.Hashtable;
import java.util.Random;


public class TestUtil {

	private static final String RANDOM_CHAR_LIST =
			"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

	public static String getRandomString(int length) {

		StringBuffer randStr = new StringBuffer();
		Random random = new Random();

		for (int i = 0; i < length; i++) {
			randStr.append(RANDOM_CHAR_LIST.charAt(random.nextInt(RANDOM_CHAR_LIST.length() - 1)));
		}
		return randStr.toString();
	}

	public static boolean isTestCaseRunmodeYes(String testCaseName,	ReadXLS xls) {

		for (int rowNum = 2; rowNum <= xls.getRowCount("Test Cases"); rowNum++) {
			if (xls.getCellData("Test Cases", "TCID", rowNum).equalsIgnoreCase(testCaseName)) {
				if (xls.getCellData("Test Cases", "Runmode", rowNum).equalsIgnoreCase("Yes")){
					// String testDataSheet= xls.getCellData("Test Case", "TestCaseID", rowNum);
					//System.out.println("rowNum: "+ rowNum);
					//System.out.println("Runmode " + xls.getCellData(testCaseName, "Runmode", rowNum));
					return true;
				}
				else{
					//System.out.println("rowNum: "+ rowNum);
					return false;
				}
			}
		}
		return false;
	}
	
	
	public static Object[][] getTestData(String testCaseName, ReadXLS xls){
		
		//Test data starting row number
		//int testDataStartRowNum = 2;
		//number of data rows
		int totalDataRows = xls.getRowCount(testCaseName);
		//number of columns
		int totalCols = xls.getColumnCount(testCaseName);
		
		Object[][] data = new Object[totalDataRows - 1][1];
		int index=0;
		
		Hashtable<String, String> table = null;
		for(int dataRowNum=2; dataRowNum<=totalDataRows; dataRowNum++){
			
			table = new Hashtable<String, String>();
			
			for(int dataColNum=0; dataColNum<totalCols; dataColNum++){
				table.put(xls.getCellData(testCaseName, dataColNum, 1), 
						xls.getCellData(testCaseName, dataColNum, dataRowNum));
				//System.out.print(xls.getCellData(testCaseName, dataColNum, dataRowNum)+ " -- ");
			}
			data[index][0] = table;
			index++;
			//System.out.println();			
		}
		
		//System.out.println("done");
		//System.out.println("Number of data rows: "+ (totalDataRows-1));
		
		return data;
		
	}
	
	public static void takeScreenShot(String fileName) {
		File srcFile = ((TakesScreenshot)(TestBase.driver)).getScreenshotAs(OutputType.FILE);
	    try {
	    	/*Date date = new Date(System.currentTimeMillis());*/				
	        String dateString = String.valueOf(System.currentTimeMillis());
	    	FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir")+"\\screenshots\\"+fileName+dateString+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static Object[][] FilterOnlyRunModeYes(Object[][] table, String RunModeColName){
		
		Object[][] filteredArray =  new Object[1][1];
		
		for (int i = 0; i < table.length; i++) {
			Hashtable<String, String> data = (Hashtable<String, String>)table[i][0];
			
			if(data.get(RunModeColName).equals("Yes")){
				filteredArray[0][0] = data;
				return filteredArray;
			}
		}
		return filteredArray;
		
	}
	
	public static String getTodaysDate(){
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		
		String Month = "";
		
		switch(month){
			case 0:Month = "Jan"; break;
			case 1:Month = "Feb"; break;
			case 2:Month = "Mar"; break;
			case 3:Month = "Apr"; break;
			case 4:Month = "May"; break;
			case 5:Month = "Jun"; break;
			case 6:Month = "Jul"; break;
			case 7:Month = "Aug"; break;
			case 8:Month = "Sep"; break;
			case 9:Month = "Oct"; break;
			case 10:Month = "Nov"; break;
			case 11:Month = "Dec"; break;		
		}
		
		return year + "-" +  Month + "-" + day;}
	
public static String getTodaysDateandtime(){
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		int month = Calendar.getInstance().get(Calendar.MONTH);
		int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int hour= Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
		int minuteTemp= Calendar.getInstance().get(Calendar.MINUTE);

		int minute = minuteTemp - (minuteTemp%5);
		
		String Month = "";
		
		switch(month){
			case 0:Month = "Jan"; break;
			case 1:Month = "Feb"; break;
			case 2:Month = "Mar"; break;
			case 3:Month = "Apr"; break;
			case 4:Month = "May"; break;
			case 5:Month = "Jun"; break;
			case 6:Month = "Jul"; break;
			case 7:Month = "Aug"; break;
			case 8:Month = "Sep"; break;
			case 9:Month = "Oct"; break;
			case 10:Month = "Nov"; break;
			case 11:Month = "Dec"; break;		 
		}
		if (String.valueOf(minute).length() == 1) 
			return year + "-" +  Month + "-" + day + "-" + hour +"-0"+ minute;
		
		return year + "-" +  Month + "-" + day+ "-" + hour +"-"+ minute;
		
}

public static String getTodaysDateandtimeOut(){
	
	int year = Calendar.getInstance().get(Calendar.YEAR);
	int month = Calendar.getInstance().get(Calendar.MONTH);
	int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
	int hour= Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
	int minuteTemp= Calendar.getInstance().get(Calendar.MINUTE);

	int minute = minuteTemp - (minuteTemp%5)-10;
	
	String Month = "";
	
	switch(month){
		case 0:Month = "Jan"; break;
		case 1:Month = "Feb"; break;
		case 2:Month = "Mar"; break;
		case 3:Month = "Apr"; break;
		case 4:Month = "May"; break;
		case 5:Month = "Jun"; break;
		case 6:Month = "Jul"; break;
		case 7:Month = "Aug"; break;
		case 8:Month = "Sep"; break;
		case 9:Month = "Oct"; break;
		case 10:Month = "Nov"; break;
		case 11:Month = "Dec"; break;		 
	}
	
	if (String.valueOf(minute).length() == 1) 
		return year + "-" +  Month + "-" + day + "-" + hour +"-0"+ minute;
		
	return year + "-" +  Month + "-" + day+ "-" + hour +"-"+ minute;
	
}


public static String getPastDateandtime(String goBack){
	
	String[] goBackAmount = goBack.split("-");
	
	int year = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(goBackAmount[0]);
	int month = Calendar.getInstance().get(Calendar.MONTH) - Integer.parseInt(goBackAmount[1]);
	int day = Calendar.getInstance().get(Calendar.DAY_OF_MONTH) - Integer.parseInt(goBackAmount[2]);
	int hour= Calendar.getInstance().get(Calendar.HOUR_OF_DAY) - Integer.parseInt(goBackAmount[3]);
	int minuteTemp= Calendar.getInstance().get(Calendar.MINUTE) - Integer.parseInt(goBackAmount[4]);

	int minute = minuteTemp - (minuteTemp%5)-5;
	
	String Month = "";
	
	switch(month){
		case 0:Month = "Jan"; break;
		case 1:Month = "Feb"; break;
		case 2:Month = "Mar"; break;
		case 3:Month = "Apr"; break;
		case 4:Month = "May"; break;
		case 5:Month = "Jun"; break;
		case 6:Month = "Jul"; break;
		case 7:Month = "Aug"; break;
		case 8:Month = "Sep"; break;
		case 9:Month = "Oct"; break;
		case 10:Month = "Nov"; break;
		case 11:Month = "Dec"; break;		 
	}
	
	if (String.valueOf(minute).length() == 1) 
		return year + "-" +  Month + "-" + day + "-" + hour +"-0"+ minute;	
	
	return year + "-" +  Month + "-" + day + "-" + hour +"-"+ minute;
	
}

public static String wordMonthToNumber(String date){
	
	String[] dates = date.split("-");
	
	String year = dates[0];
	String month = dates[1];
	String day = dates[2];
	int Month = 0;
	
	switch(month){
		case "Jan" :Month = 1; break;
		case "Feb":Month = 2; break;
		case "Mar":Month = 3; break;
		case "Apr":Month = 4; break;
		case "May":Month = 5; break;
		case "Jun":Month = 6; break;
		case "Jul":Month = 7; break;
		case "Aug":Month = 8; break;
		case "Sep":Month = 9; break;
		case "Oct":Month = 10; break;
		case "Nov":Month = 11; break;
		case "Dec":Month = 12; break;		 
	}
	
	return year + "-" +  Month + "-" + day;
}

}

package data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException {
		
		//open workbook with file name and path
				XSSFWorkbook wb = new XSSFWorkbook("./datasheet/Registration.xlsx");
				
				//Go to specific sheet using sheet name/index
				XSSFSheet sheet = wb.getSheet("Sheet1");
				
				//to get number of rows in the sheet
				int row_count = sheet.getLastRowNum();
				
				//to get number of Columns in the sheet
				int column_count = sheet.getRow(0).getLastCellNum();
				
				System.out.println("Total number of rows present is : " + row_count );
				System.out.println("Total number of column present is : " + column_count );
				
				String[][]	data = new String[row_count][column_count];
				
				//read all data from excel
				for(int i = 1 ; i<=row_count;i++) {
					XSSFRow row = sheet.getRow(i);
					for(int j = 0; j<column_count; j++) {
						String stringcellvalue = row.getCell(j).getStringCellValue();
						System.out.println(stringcellvalue);
						data[i-1][j] = stringcellvalue;
					}
				}
		
	}

}

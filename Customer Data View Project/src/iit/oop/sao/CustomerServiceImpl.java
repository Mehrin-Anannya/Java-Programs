package iit.oop.sao;

import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.bouncycastle.util.test.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

 
import iit.oop.dao.Customer;

public class CustomerServiceImpl implements CustomerService{

	@Override
	public void writeData(Customer customer) throws IOException {
//		File file = new File("E:\\Test.xlsx");
//		FileInputStream fis = null;
//		try {
//			 fis = new FileInputStream(file);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
		
		//need to create this file first in the required location
		String excelFileName = "E:\\Test.xlsx";//name of excel file

		String sheetName = "Sheet1";//name of sheet

		try (XSSFWorkbook wb = new XSSFWorkbook()) {
			XSSFSheet sheet = wb.createSheet(sheetName) ;

			//iterating r number of rows
			for (int r=0;r < 5; r++ )
			{
				XSSFRow row = sheet.createRow(r);

				//iterating c number of columns
				for (int c=0;c < 5; c++ )
				{
					XSSFCell cell = row.createCell(c);

					cell.setCellValue("Cell "+r+" "+c);
				}
			}

			FileOutputStream fileOut = new FileOutputStream(excelFileName);

			//write this workbook to an Outputstream.
			wb.write(fileOut);
			fileOut.flush();
			fileOut.close();
		}
	}
	@Override
	public void viewData(Customer customer) {
		// TODO Auto-generated method stub
	     InputStream ExcelFileToRead = null;
		try {
			ExcelFileToRead = new FileInputStream("E:\\Test.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook(ExcelFileToRead);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		XSSFSheet sheet = wb.getSheetAt(0);
		XSSFRow row; 
		XSSFCell cell;

		Iterator rows = sheet.rowIterator();

		while (rows.hasNext())
		{
			row=(XSSFRow) rows.next();
			Iterator cells = row.cellIterator();
			while (cells.hasNext())
			{
				cell=(XSSFCell) cells.next();
		
				if (cell.getCellType() != null)
				{
					System.out.print(cell.getStringCellValue()+" ");
				}
				else if(cell.getCellType() != null)
				{
					System.out.print(cell.getNumericCellValue()+" ");
				}
				else
				{
					//U Can Handel Boolean, Formula, Errors
				}
			}
			System.out.println();
		}
	
	}

	@Override
	public List<Customer> getAllCustomers(Customer customers) {
		// TODO Auto-generated method stub
		return null;
	}


	public List<Customer> getAllCustomers(Customer firstCustomer, Customer secondCustomer) {
		// TODO Auto-generated method stub
		return null;
	}

}

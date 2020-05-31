package com.test.filter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import org.apache.commons.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class FilterData {

	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream(new File("C:\\Users\\tushar92\\Documents\\Test.xls"));
		
		HSSFWorkbook wb = new HSSFWorkbook(fs);
		
		HSSFSheet st = wb.getSheetAt(0);
		
		FormulaEvaluator fE = wb.getCreationHelper().createFormulaEvaluator();
		
		for (Row row : st) 
		{
			for (Cell cell : row) 
			{
				switch(fE.evaluateInCell(cell).getCellType())
				{
				case Cell.CELL_TYPE_NUMERIC:
					System.out.println(cell.getNumericCellValue()+"\t\t");
				break;
				case Cell.CELL_TYPE_STRING:
					System.out.println(cell.getStringCellValue()+"\t\t");
				break;
				}
			}
		System.out.println();
		}
	}
}

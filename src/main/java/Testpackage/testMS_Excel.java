/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testpackage;

import com.sun.rowset.internal.Row;
import java.io.FileOutputStream;
import java.io.IOException;
 

public class testMS_Excel {
 
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("Results");
         
        Object[][] Data = {
                {"Semester", "A171"},
                {"Course", "STIW3054"},
                {"Group", "A"},
                {"Tak", "A"},
        };
 
        int rowCount = 0;
         
        for (Object[] aBook : Data) {
            Row row = sheet.createRow(++rowCount);
            int columnCount = 0;
            int colNum;
              int x;
              
            Cell cell = row.createCell(colNum++);
            Object[] Information;
            Object field = Information[x];
            if (field instanceof String) {
                cell.setCellValue((String) Information[x]);
            }
             
             {
                Cell cell = row.createCell(++columnCount);
                field = "Matrik";
                if (field instanceof String) {
                    cell.setCellValue("Matrik");
                } 
                
                 Cell cell = row.createCell(++columnCount);
                field = "LOC";
                if (field instanceof String) {
                    cell.setCellValue("LOC");
                } 
                
                 Cell cell = row.createCell(++columnCount);
                field = "Blank";
                if (field instanceof String) {
                    cell.setCellValue("Blank");
                } 
                
                 Cell cell = row.createCell(++columnCount);
                field = "Comment";
                if (field instanceof String) {
                    cell.setCellValue("Comment");
                } 
                
                 Cell cell = row.createCell(++columnCount);
                field = "ActualLOC";
                if (field instanceof String) {
                    cell.setCellValue("ActualLOC");
                } 
                
                
              Cell cell = row.createCell(++columnCount);
                field = "Total";
                if (field instanceof String) {
                    cell.setCellValue("Total");
                } 
            }
             
        }
         
         
        try (FileOutputStream outputStream = new FileOutputStream("Results.xlsx")) {
            workbook.write(outputStream);
        }
    }
 
}

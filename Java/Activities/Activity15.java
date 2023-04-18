package activities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Activity15 {
    private static String FILE_NAME = "resources/TestSheet.xlsx";
    public static void main (String[] arg)
    {
        XSSFWorkbook wb= new XSSFWorkbook();
        XSSFSheet ws = wb.createSheet("NewSheet");
        Object[] [] datatypes =
                {
                        {"Datatype", "Type", "Size(in bytes)"},
                        {"int", "Primitive", 2},
                        {"float", "Primitive", 4},
                        {"double", "Primitive", 8},
                        {"char", "Primitive", 1},
                        {"String", "Non-Primitive", "No fixed size"}
                };
        int rownum=0;
        for (Object[] datatype: datatypes);
        {
            Row row = ws.createRow(rownum++);
            int colnum=0;
            for (Object field : datatypes)
            {
                Cell cell=row.createCell(colnum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }
        try
        {
            FileOutputStream outputStream= new FileOutputStream(FILE_NAME);
            wb.write(outputStream);
            wb.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        System.out.println("Done");
    }
}

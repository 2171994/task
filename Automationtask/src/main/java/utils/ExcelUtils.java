package utils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {
    public static String getData(String filePath, int sheetIndex, int row, int cell) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(sheetIndex);
        Row r = sheet.getRow(row);
        Cell c = r.getCell(cell);
        String value = c.getStringCellValue();
        workbook.close();
        return value;
    }
}

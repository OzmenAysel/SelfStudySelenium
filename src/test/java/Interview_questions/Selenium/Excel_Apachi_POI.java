package Interview_questions.Selenium;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_Apachi_POI {

    public void readExcel() throws IOException {
        String filePath = "";
        FileInputStream fileInputStream = new FileInputStream(filePath);

        Workbook wb = WorkbookFactory.create(fileInputStream);
        Sheet sh = wb.getSheet("Sheet1");
        Row row = sh.getRow(3);
        Cell cell = row.getCell(2);

        cell.setCellValue("coffee");

    }
}

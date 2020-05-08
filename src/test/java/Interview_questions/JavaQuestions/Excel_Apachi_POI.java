package Interview_questions.JavaQuestions;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;

public class Excel_Apachi_POI {


    public static void main(String[] args) throws IOException {
        String filePath = "C:/Users/aysel/IdeaProjects/SelfStudy_JavaAndSelenium/src/test/resources/Deneme.xlsx";

        FileInputStream fileInputStream = new FileInputStream(filePath);

        Workbook wb = WorkbookFactory.create(fileInputStream);

        Sheet sh1 = wb.getSheet("Sheet1");
        Sheet sh2 = wb.getSheet("Sheet2");

        Cell cell = sh1.getRow(2).getCell(2);
        System.out.println(cell); // Zeynep2
        // OR
        System.out.println(cell.getStringCellValue()); // Zeynep2


        Cell cell2 = sh2.getRow(4).getCell(3); // Baba4
        System.out.println(cell2);


    }
}

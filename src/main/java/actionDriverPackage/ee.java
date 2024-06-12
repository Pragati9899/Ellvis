package actionDriverPackage;

import basePackage.BaseClass;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class ee extends BaseClass {
/*

    public ee(WebDriver driver) {
        super(driver);
    }

    public static void javaScriptExecutor(WebDriver driver, WebElement element){
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",element);
    }


    public static String GetText(WebDriver driver, WebElement element){
        String elementText=element.getText();
        return elementText;
    }
    public static String ReadExcelFile(WebDriver driver,String filePath) throws IOException {

        String data=null;
        File file = new File(filePath);
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet1 = workbook.getSheetAt(0);
        int rowcount = sheet1.getLastRowNum() + 1;
        for (int i = 0; i < rowcount; i++) {
            XSSFRow row = sheet1.getRow(i);
            for (int j = 0; j < row.getLastCellNum(); j++) {
                 data = sheet1.getRow(i).getCell(j).getStringCellValue();
                System.out.print(data + " ");
            }
        }
        return data;
    }
*/


}


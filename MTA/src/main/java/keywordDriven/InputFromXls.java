package keywordDriven;

import base.CommonAPI;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import pages.FeatureForKeyWord;

import java.io.FileInputStream;

public class InputFromXls extends FeatureForKeyWord {
    static HSSFWorkbook workbook;
    static HSSFSheet sheet;
    public static void setExcelFile(String path,String sheetName) throws Exception {
        FileInputStream fis=new FileInputStream(path);
        workbook=new HSSFWorkbook(fis);
        sheet=workbook.getSheet(sheetName);
    }
   public static String getCelldata(int row,int column){
        HSSFCell cell=sheet.getRow(row).getCell(column);
        String cellData=cell.getStringCellValue();
        return cellData;
   }
    public  void SignInByKeyWord() throws Exception {
        String path = "E:\\GreenGroup\\MTA\\Data\\Key2.xls";
        InputFromXls.setExcelFile(path, "sheet1");
        for (int i = 1; i <= 5; i++) {
            String actionKeyword = InputFromXls.getCelldata(i, 1);
            if (actionKeyword.equals("ClickSignIn")) {
                clickOnSignUp();
            } else if (actionKeyword.equals("Username")) {
                inputUsername();
            } else if (actionKeyword.equals("Password")) {
                inputPassword();
            } else if(actionKeyword.equals("Login")) {
                clickOnLoginButton();
            }
        }
    }

    }


package datProviderUtilityWIthXlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new Xls_Reader("C:\\Users\\Jewell\\Desktop\\Project\\Generic\\src\\main\\java\\datProviderUtilityWIthXlsReader\\Workbook2.xls");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        // change only sheet name in line 19
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  Items = reader.getCellData("Sheet1", "Items",rowNum );
//        String passCode = reader.getCellData("Sheet1","passCode", rowNum);
//        String message = reader.getCellData("Sheet1","message", rowNum);
            Object obj[] = {Items};
            myData.add(obj);
        }

        return  myData;
    }
}
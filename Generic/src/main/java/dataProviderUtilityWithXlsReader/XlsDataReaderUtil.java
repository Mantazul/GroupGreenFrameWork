package dataProviderUtilityWithXlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {
    static XlsReader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

        ArrayList<Object[]> myData = new ArrayList<Object[]>();
        try {
            reader = new XlsReader("/Users/asifchowdhury/Desktop/BankWeb/Generic/src/main/java/dataProviderUtilityWithXlsReader/BankofAmericaDataReader.xls");
      }
        catch (Exception e){
            e.printStackTrace();
        }
        // change only sheet name in line 19
        for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
            String  username = reader.getCellData("Sheet1", "username",rowNum );
            String password = reader.getCellData("Sheet1","password", rowNum);
            Object obj[] = {username, password};
            myData.add(obj);
        }

        return  myData;
    }

}

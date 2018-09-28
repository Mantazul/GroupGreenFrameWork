package datProviderUtilityWIthXlsReader;

import java.util.ArrayList;

public class XlsDataReaderUtil {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getDataFromExcel(){

    ArrayList<Object[]> myData = new ArrayList<Object[]>();
    try {
        reader = new Xls_Reader("E:\\GreenGroup\\MTA\\Data\\Book1.xls");
    }
    catch (Exception e){
        e.printStackTrace();
    }
     // change only sheet name in line 19
    for (int rowNum =2; rowNum <= reader.getRowCount("Sheet1"); rowNum++){
        String  Username = reader.getCellData("Sheet1", "Username",rowNum );
        String Password = reader.getCellData("Sheet1","Password", rowNum);
       // String message = reader.getCellData("Sheet1","message", rowNum);
        Object obj[] = {Username,Password};
        myData.add(obj);
       }

    return  myData;
   }
}

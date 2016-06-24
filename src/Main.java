import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {

        String mkPath = "";
        File mkDir = null;

        //get the list of files in directory
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Input the path to the directory with base MK files");
            mkPath = reader.readLine();
            mkDir = new File(mkPath);
            if (!mkDir.exists()) {
                System.out.println("Wrong path or directory not exist!");
            } else break;
        }
        File[] files = mkDir.listFiles();
        ArrayList<FileItem> fileItemArrayList = new ArrayList<>();
        for (File f : files) {

            String s = f.getName();
            if (s.contains(".jpg")) {
                fileItemArrayList.add(new FileItem(s.split("=")[0], s.split("=")[2], s.split("=")[2], s.split("=")[3], s.split("=")[4]));
            }
        }

        for (FileItem f : fileItemArrayList) {
            System.out.println(f);
        }


        //get the list of files in excel list

        File excelItemsFile = new File("inputExcel.txt");
        BufferedReader reader = new BufferedReader(new FileReader(excelItemsFile));
        ArrayList<ExcelItem> excelItemArrayList = new ArrayList<>();
        while (reader.ready()) {
            String s = reader.readLine();
            excelItemArrayList.add(new ExcelItem(s.split("=")[0], s.split("=")[1], s.split("=")[2], s.split("=")[3], s.split("=")[4], s.split("=")[5]));
        }

        for (ExcelItem f : excelItemArrayList) {
            System.out.println(f);
        }


    }
}

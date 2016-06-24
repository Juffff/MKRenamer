import java.io.*;
import java.util.ArrayList;

public class FirstComparator {
    private File[] files;
    private File inputExcel;

    public FirstComparator(File[] files, File inputExcel) {
        this.files = files;
        this.inputExcel = inputExcel;
    }

    public void parse() throws IOException {
        ArrayList<String> fileNames = new ArrayList<String>();
        ArrayList<String> excelNames = new ArrayList<String>();

        BufferedReader reader = new BufferedReader(new FileReader(inputExcel));
        while (reader.ready()){

        }

    }

}

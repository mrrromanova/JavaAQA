package Lesson12;

import java.io.FileOutputStream;
import java.io.IOException;

public class MainAppData {

    public void main(String[] args) {

        String pathToFile = "C:\\Users\\roman\\files\\csvfile.csv";
        AppData data = new AppData();
        String[] headerInfo = {"Value 1", "Value 2", "Value 3"};
        data.setHeader(headerInfo);
        int[][] dataInfo = {{100, 200, 300}, {400, 500, 600}};
        data.setData(dataInfo);

        try (FileOutputStream fileOutputStream = new FileOutputStream(pathToFile)) {
            for (String text : data.getHeader()) {
                fileOutputStream.write(text.getBytes());
                fileOutputStream.write("; ".getBytes());
            }
            fileOutputStream.write("\n".getBytes());
            for (int i = 0; i < data.getData().length; i++){
                for (int j = 0; j <= data.getData().length; j++){
                    fileOutputStream.write(String.valueOf(data.getData()[i][j]).getBytes());
                    fileOutputStream.write("; ".getBytes());
                    if (j == data.getData().length){
                        fileOutputStream.write("\n".getBytes());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
package activities;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] arg) throws IOException {
        File file = new File("src/main/resources/newfile.txt");
        boolean Status = file.createNewFile();
        if (Status)
        {
            System.out.println("File created successfully!");
        }
        else
        {
            System.out.println("File already exists at this path.");
        }
        File fileutil = FileUtils.getFile("src/main/resources/newfile.txt");
        System.out.println("File date is : "+FileUtils.readFileToString(fileutil, "UTF8"));

        File destDir = new File("examples");
        FileUtils.copyFileToDirectory(file,destDir);
        File newFile = FileUtils.getFile(destDir, "newfile.txt");
        String newFileData = FileUtils.readFileToString(newFile, "UTF8");
        System.out.println("Data in new file: " + newFileData);

    }
}

package hometask15;

import org.junit.*;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


import static org.junit.Assert.*;

public class WarAndPeaceTest {
    WarAndPeace warAndPeace = new WarAndPeace();
    private static File dir;



    @Rule
    public TemporaryFolder folder= new TemporaryFolder();


    @Test
    public void testFileParser() throws IOException {
        File createdFile= folder.newFile("warAndPeaceOutput.txt");
        WarAndPeace warAndPeace1 = new WarAndPeace();
       Path path = Paths.get("src/main/resources/vim.txt");
        warAndPeace1.warAndPeaceFilterAndCount();
        try (FileWriter fileWriter = new FileWriter(createdFile)) {
            fileWriter.write("1.0 2.0 3.0 4.0");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }


    @Test
    public void warAndPeaceFilterAndCount() throws Exception{
    }




}
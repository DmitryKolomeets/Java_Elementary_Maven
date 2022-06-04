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

    @Test
    public void testFileParser() {
        String path = "src/main/resources/warAndPeaceOutput.txt";
        File file = new File(path);
        String absolutePath = file.getAbsolutePath();
        WarAndPeace warAndPeace = new WarAndPeace();
        warAndPeace.warAndPeaceFilterAndCount();
        assertTrue(file.exists());
    }

    @Test
    public void warAndPeaceFilterAndCount() throws Exception{
    }




}
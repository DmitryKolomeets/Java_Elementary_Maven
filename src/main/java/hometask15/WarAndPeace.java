package hometask15;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WarAndPeace {

    public void warAndPeaceFilterAndCount() {

        try (BufferedReader fileInput = new BufferedReader(new FileReader("src/main/resources/vim.txt"));
             BufferedWriter fileOutput = new BufferedWriter(new FileWriter("src/main/resources/warAndPeaceOutput.txt"))) {
            List<Map.Entry<String, Long>> list = fileInput.lines()
                    .flatMap(s -> Arrays.stream(s.split(" ")))
                    .filter(s -> s.length() > 3)
                    .map(s -> s
                            .toLowerCase()
                            .replace(".", "")
                            .replace(",", "")
                            .replace("!", "")
                            .replace("?", "")
                            .replace("<<", "")
                            .replace(">>", "")
                            .replace(";", "")
                            .replace(":", ""))
                    .filter(s -> !s.contains("русс"))
                    .filter(s -> !s.contains("россия"))
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                    .toList();

            fileOutput.write(String.valueOf(list) + '\n');

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {

        WarAndPeace warAndPeace = new WarAndPeace();
        warAndPeace.warAndPeaceFilterAndCount();
    }
}
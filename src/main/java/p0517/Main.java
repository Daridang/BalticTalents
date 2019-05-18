package p0517;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {
    //    ND 05.17
//            --------
//    Susikurkite failą su kažkokiu turiniu iš interneto wikipedijos ) ir
//    parašykite programą , kuri išveda žodžius panaudotus tame tekste ir
//    kiek kartų tas žodis buvo panaudotas žodžių panaudojimo mažėjimo
//    tvarka. Pastaba: didžiosios mažosios raidės laikomos tokiomis pat,
//    t.y . žodžiai Wikipedia ir wikipedia yra tas pats žodis.

    public static void main(String[] args) throws IOException {

        Path filePath = Paths.get("File.txt");
        List<String> list = Files.readAllLines(filePath);

        String[] s1 = new String[0];
        for (String s : list) {
            s1 = s.toLowerCase().replaceAll("[-.?!)(,:']", "").split(" ");
        }

        Map<String, Integer> counterMap = new HashMap<>();
        for (String s : s1) {
            counterMap.put(s, counterMap.getOrDefault(s, 0) + 1);
        }

        Set<Map.Entry<String, Integer>> entries = counterMap.entrySet();
        entries.stream().sorted((o1, o2) -> o2.getValue() - o1.getValue()).forEach(System.out::println);
    }
}

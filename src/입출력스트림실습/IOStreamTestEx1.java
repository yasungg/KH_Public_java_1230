package 입출력스트림실습;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class IOStreamTestEx1 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        TreeSet<Save> ts = new TreeSet<>();
        try {
            fis = new FileInputStream("IOStreamTestEx.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(fis);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] splitArr = line.split(" ");
            ts.add(new Save(splitArr[0],
                    Integer.parseInt(splitArr[1]),
                    Integer.parseInt(splitArr[2]),
                    Integer.parseInt(splitArr[3])));
        }
        for (Save o : ts) {
            System.out.println(o.getName() + " : " + o.getTotal());
        }
        try {
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

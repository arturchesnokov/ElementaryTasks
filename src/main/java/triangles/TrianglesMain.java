package triangles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import static triangles.TriangleService.parseStringtoArray;
import static triangles.TriangleService.stringInCorrectFormat;
import static triangles.TriangleService.valuesInCorrectTypes;

public class TrianglesMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Triangle> set = new TreeSet<Triangle>();

        while (true) {
            System.out.println("Please enter triangle in format:<Name>,<side №1>,<side №2>,<side №3>");

            String str = scanner.nextLine().replaceAll("\\s+", "");
            String[] params = parseStringtoArray(str);

            if (stringInCorrectFormat(str) && valuesInCorrectTypes(str)) {
                try {

                    set.add(new Triangle(params[0],
                            Double.parseDouble(params[1]),
                            Double.parseDouble(params[2]),
                            Double.parseDouble(params[3])));
                } catch (TriangleCantExist e) {
                    System.out.println(e.getMessage());
                }

            } else {
                continue;
            }
            System.out.println("Do you want to proceed? \"y\" or \"yes\'");
            str = scanner.nextLine();
            if (str.toLowerCase().equals("y") || str.toLowerCase().equals("yes")) {
                continue;
            } else {
                break;
            }
        }

        System.out.println("=========Triangles list=========");
        for (Triangle triangle : set) {
            System.out.println(triangle);
        }

    }
}

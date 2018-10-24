package triangles;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static triangles.TriangleService.parseStringtoArray;
import static triangles.TriangleService.correctStringFormat;
import static triangles.TriangleService.valuesCorrectTypes;

public class TrianglesMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Triangle> set = new TreeSet<Triangle>();

        while (true) {
            System.out.println("Please enter triangle in format:<Name>,<side №1>,<side №2>,<side №3>");

            String str = scanner.nextLine();
            String[] params = parseStringtoArray(str);

            if (correctStringFormat(params) && valuesCorrectTypes(params)) {
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

        printTriangles(set);

    }

    static void printTriangles(Set<Triangle> set) {
        System.out.println("=========Triangles list=========");
        for (Triangle triangle : set) {
            System.out.println(triangle);
        }
    }

}

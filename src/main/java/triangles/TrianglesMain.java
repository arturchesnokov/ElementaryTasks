package triangles;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import static triangles.TriangleService.correctStringFormat;
import static triangles.TriangleService.parseStringtoArray;
import static triangles.TriangleService.valuesCorrectTypes;


public class TrianglesMain {

    public static void main(String[] args) {
        String welcomeMsg = "Please enter triangle in format:<Name>,<side №1>,<side №2>,<side №3>";
        String repeatRequestMsg = "Do you want to proceed? \"y\" or \"yes\'";
        Scanner scanner = new Scanner(System.in);
        TreeSet<Triangle> set = new TreeSet<Triangle>();

        while (true) {
            System.out.println(welcomeMsg);
            String[] params = parseStringtoArray(scanner.nextLine());

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
            System.out.println(repeatRequestMsg);
            String str = scanner.nextLine();
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

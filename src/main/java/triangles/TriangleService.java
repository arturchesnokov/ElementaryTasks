package triangles;

public class TriangleService {

    static boolean stringInCorrectFormat(String inputString) {
        int params = parseStringtoArray(inputString).length;
        if (params != 4) {
            System.out.println("Please enter parameters in correct format\n");
            return false;
        } else {
            return true;
        }
    }

    static boolean valuesInCorrectTypes(String inputString) {
        String[] params = parseStringtoArray(inputString);
        String name = (String) params[0];
        try {
            double a = Double.parseDouble(params[1]);
            double b = Double.parseDouble(params[2]);
            double c = Double.parseDouble(params[3]);
            return true;

        } catch (NumberFormatException e) {
            System.out.println("Wrong numeric values, try one more time\n");
            return false;
        }
    }

    static String[] parseStringtoArray(String string) {
        return string.split(",");
    }
}

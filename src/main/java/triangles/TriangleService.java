package triangles;

public class TriangleService {

    static boolean correctStringFormat(String[] parameters) {
        int params = parameters.length;
        if (params != 4) {
            System.out.println("Please enter parameters in correct format\n");
            return false;
        } else {
            return true;
        }
    }

    static boolean valuesCorrectTypes(String[] parameters) {
        String name = (String) parameters[0];
        try {
            double a = Double.parseDouble(parameters[1]);
            double b = Double.parseDouble(parameters[2]);
            double c = Double.parseDouble(parameters[3]);
            return true;

        } catch (NumberFormatException e) {
            System.out.println("Wrong numeric values, try one more time\n");
            return false;
        }
    }

    static String[] parseStringtoArray(String string) {
        return trim(string).split(",");
    }

    private static String trim (String string){
        return string.replaceAll("\\s+", "");
    }
}

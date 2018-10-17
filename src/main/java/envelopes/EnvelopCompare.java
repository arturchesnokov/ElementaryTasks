package envelopes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EnvelopCompare {
  public static void main(String[] args) throws Exception {
    String repeatQuestion = "Do you want to compare another envelopes? Type \"y\" or \"yes\" to continue";

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String inputString = "";

    Envelope envA = new Envelope("A");
    Envelope envB = new Envelope("B");

    do {
      envA.initializeDimentions();
      envB.initializeDimentions();

      System.out.println(Envelope.compare(envA, envB));

      System.out.println(repeatQuestion);
      inputString = reader.readLine();

    } while ((inputString.toLowerCase().equals("y")) || (inputString.toLowerCase().equals("yes")));
    System.out.println("Bye");
  }


}

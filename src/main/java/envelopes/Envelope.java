package envelopes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Envelope {
  String name;
  double width;
  double height;

  public void setWidth(double width) {
    this.width = width;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Envelope() {
  }

  public Envelope(String name) {
    this(name, 0, 0);
  }

  public Envelope(String name, double with, double height) {
    this.name = name;
    this.width = with;
    this.height = height;
  }

  void initializeDimentions() throws Exception {
    System.out.println("Please enter Envelope " + name + " width");
    Double h = Envelope.envelopeSideCheck();
    this.setHeight(h);
    System.out.println("Please enter Envelope " + name + " height");
    Double w = Envelope.envelopeSideCheck();
    setWidth(w);
  }

  static String compare(Envelope a, Envelope b) {
    if (a.isLarger(b)) {
      return "\nEnvelop A larger\n";
    } else if (b.isLarger(a)) {
      return "\nEnvelop B larger\n";
    } else {
      return "\nImpossible to put an envelope in each other\n";
    }
  }

  private boolean isLarger(Envelope envelope) {
    if ((this.height > envelope.height && this.width > envelope.width) ||
            this.height > envelope.width && this.width > envelope.height) {
      return true;
    } else {
      return false;
    }
  }

  private static double envelopeSideCheck() throws Exception {
    double d = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (d <= 0) {
      try {
        d = Double.parseDouble(reader.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Incorrect value, enter correct numeric value");
        continue;
      }
      if (d <= 0) {
        System.out.println("The value can't be equal or less than 0");
      }
    }
    return d;
  }
}


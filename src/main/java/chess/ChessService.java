package chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessService {

  static int enterSideSize() {
    int d = 0;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (d <= 0) {
      try {
        d = Integer.parseInt(reader.readLine());
      } catch (NumberFormatException e) {
        System.out.println("Incorrect value, enter correct numeric value");
        continue;
      } catch (IOException e) {
        continue;
      }
      if (d <= 0) {
        System.out.println("The value can't be equal or less than 0");
      }
    }
    return d;
  }

  static String draw(ChessBoard board) {
    int w = board.getWidth();
    int h = board.getHeight();
    StringBuffer string = new StringBuffer();

    for (int i = 0; i < h; i++) {
      if (i % 2 == 0) {
        string.append(ChessService.drawOddLine(board)+"\n");
      } else {
        string.append(ChessService.drawEvenLine(board)+"\n");
      }
    }
    return string.toString();
  }

  private static String drawOddLine(ChessBoard board) {
    StringBuffer string = new StringBuffer();
    for (int i = 0; i < board.getWidth(); i++) {
      if (i % 2 == 0) {
        //string.append((char)219);
        string.append("* ");
      } else {
        string.append("  ");
      }
    }
    return string.toString();
  }

  private static String drawEvenLine(ChessBoard board) {
    StringBuffer string = new StringBuffer();
    for (int i = 0; i < board.getWidth(); i++) {
      if (i % 2 == 0) {
        string.append("  ");
      } else {
        string.append("* ");
      }
    }
    return string.toString();
  }

}

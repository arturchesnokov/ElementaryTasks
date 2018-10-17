package chess;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ChessServiceTest {
  ChessBoard board;


  @Test
  public void testDraw() {
    board = new ChessBoard(4,4);
    StringBuffer str = new StringBuffer();
    str.append("*   *   \n");
    str.append("  *   * \n");
    str.append("*   *   \n");
    str.append("  *   * \n");
    assertEquals(str.toString(),ChessService.draw(board));
  }
}
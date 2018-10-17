package chess;

public class ChessMain {

  public static void main(String[] args) {
    ChessBoard board = new ChessBoard();
    board.setWidth(ChessService.enterSideSize());
    board.setHeight(ChessService.enterSideSize());
//    board.setWidth(4);
//    board.setHeight(4);
    System.out.println(ChessService.draw(board));

  }
}



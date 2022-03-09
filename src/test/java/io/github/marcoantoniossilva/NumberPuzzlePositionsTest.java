package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;
import org.junit.Test;

public class NumberPuzzlePositionsTest {

  @Test
  public void check() {
    NumberPuzzle eightPuzzle = new NumberPuzzle(3);
    String[][] orderlyBoard = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", " "},
    };

    eightPuzzle.setBoard(orderlyBoard);

    Assert.assertEquals(0, eightPuzzle.findPositionPiece("1"));
    Assert.assertEquals(1, eightPuzzle.findPositionPiece("2"));
    Assert.assertEquals(2, eightPuzzle.findPositionPiece("3"));
    Assert.assertEquals(3, eightPuzzle.findPositionPiece("4"));
    Assert.assertEquals(4, eightPuzzle.findPositionPiece("5"));
    Assert.assertEquals(5, eightPuzzle.findPositionPiece("6"));
    Assert.assertEquals(6, eightPuzzle.findPositionPiece("7"));
    Assert.assertEquals(7, eightPuzzle.findPositionPiece("8"));
    Assert.assertEquals(8, eightPuzzle.findPositionPiece(" "));

  }

}

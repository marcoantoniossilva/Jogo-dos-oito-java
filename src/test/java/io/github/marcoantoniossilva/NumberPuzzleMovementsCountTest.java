package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;
import org.junit.Test;

public class NumberPuzzleMovementsCountTest {
  @Test
  public void check() {
    NumberPuzzle eightPuzzle = new NumberPuzzle(3);
    String[][] orderlyBoard = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", " "},
    };
    int expected = 8;

    eightPuzzle.setBoard(orderlyBoard);
    eightPuzzle.move("8");
    eightPuzzle.move("7");
    eightPuzzle.move("4");
    eightPuzzle.move("1");
    eightPuzzle.move("2");
    eightPuzzle.move("3");
    eightPuzzle.move("6");
    eightPuzzle.move("8");

    Assert.assertEquals(expected, eightPuzzle.getNumberOfMoves());

  }
}

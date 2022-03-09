package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;
import org.junit.Test;

public class NumberPuzzleMovementsTest {

  @Test
  public void check() {
    NumberPuzzle eightPuzzle = new NumberPuzzle(3);
    String[][] orderlyBoard = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", " "},
    };

    eightPuzzle.setBoard(orderlyBoard);

    Assert.assertFalse(eightPuzzle.move("1"));
    Assert.assertFalse(eightPuzzle.move("2"));
    Assert.assertFalse(eightPuzzle.move("3"));
    Assert.assertFalse(eightPuzzle.move("4"));
    Assert.assertFalse(eightPuzzle.move("5"));
    Assert.assertFalse(eightPuzzle.move("7"));

    Assert.assertTrue(eightPuzzle.move("8"));
  }

}

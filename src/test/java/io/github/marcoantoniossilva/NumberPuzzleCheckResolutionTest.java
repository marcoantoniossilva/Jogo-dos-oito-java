package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;
import org.junit.Test;

public class NumberPuzzleCheckResolutionTest {
  @Test
  public void check() {
    NumberPuzzle eightPuzzle = new NumberPuzzle(3);
    String[][] orderlyBoard = {
        {"1", "2", "3"},
        {"4", "5", "6"},
        {"7", "8", " "},
    };
    eightPuzzle.setBoard(orderlyBoard);
    Assert.assertTrue(eightPuzzle.checkResolution());

    String[][] disorderedBoard = {
        {"2", "5", "7"},
        {"6", " ", "8"},
        {"1", "4", "3"},
    };
    eightPuzzle.setBoard(disorderedBoard);
    Assert.assertFalse(eightPuzzle.checkResolution());

  }
}

package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;

public class NumberPuzzleMovementValidTest extends BaseTest {

  private boolean moved;

  // Arrange (Organização/Preparação)
  @Override
  protected void arrange() {
    eightPuzzle = new NumberPuzzle(3);
    eightPuzzle.setBoard(orderlyBoard);
  }

  @Override
  protected void act() {
    moved = eightPuzzle.move("8");
  }

  @Override
  public void assertTest() {
    Assert.assertTrue(moved);
  }
}

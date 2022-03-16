package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;

public class NumberPuzzleMovementInvalidTest extends BaseTest {

  private boolean moved;

  // Arrange (Organização/Preparação)
  @Override
  protected void arrange() {
    eightPuzzle = new NumberPuzzle(3);
    eightPuzzle.setBoard(orderlyBoard);
  }

  @Override
  protected void act() {
    moved = eightPuzzle.move("1");
  }

  @Override
  public void assertTest() {
    Assert.assertFalse(moved);
  }
}

package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;

public class NumberPuzzleMovementsCountTest extends BaseTest {

  final private int expected = 8;
  private int movesCount;

  // Arrange (Organização/Preparação)
  @Override
  protected void arrange() {
    eightPuzzle = new NumberPuzzle(3);
    eightPuzzle.setBoard(orderlyBoard);
  }

  // Act (Ação)
  @Override
  protected void act() {
    eightPuzzle.move("8");
    eightPuzzle.move("7");
    eightPuzzle.move("4");
    eightPuzzle.move("1");
    eightPuzzle.move("2");
    eightPuzzle.move("3");
    eightPuzzle.move("6");
    eightPuzzle.move("8");
    movesCount = eightPuzzle.getNumberOfMoves();
  }

  // Assert (Afirmação)
  @Override
  public void assertTest() {
    Assert.assertEquals(expected, movesCount);
  }
}

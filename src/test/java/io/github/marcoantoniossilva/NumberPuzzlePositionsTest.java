package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;

public class NumberPuzzlePositionsTest extends BaseTest {

  private int position0;
  private int position1;
  private int position2;
  private int position3;
  private int position4;
  private int position5;
  private int position6;
  private int position7;
  private int position8;

  // Arrange (Organização/Preparação)
  @Override
  protected void arrange() {
    eightPuzzle = new NumberPuzzle(3);
    eightPuzzle.setBoard(orderlyBoard);
  }

  @Override
  protected void act() {
    position0 = eightPuzzle.findPositionPiece("1");
    position1 = eightPuzzle.findPositionPiece("2");
    position2 = eightPuzzle.findPositionPiece("3");
    position3 = eightPuzzle.findPositionPiece("4");
    position4 = eightPuzzle.findPositionPiece("5");
    position5 = eightPuzzle.findPositionPiece("6");
    position6 = eightPuzzle.findPositionPiece("7");
    position7 = eightPuzzle.findPositionPiece("8");
    position8 = eightPuzzle.findPositionPiece(" ");
  }

  @Override
  public void assertTest() {
    Assert.assertEquals(0, position0);
    Assert.assertEquals(1, position1);
    Assert.assertEquals(2, position2);
    Assert.assertEquals(3, position3);
    Assert.assertEquals(4, position4);
    Assert.assertEquals(5, position5);
    Assert.assertEquals(6, position6);
    Assert.assertEquals(7, position7);
    Assert.assertEquals(8, position8);
  }
}

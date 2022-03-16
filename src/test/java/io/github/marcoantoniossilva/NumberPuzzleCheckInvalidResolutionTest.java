package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Assert;

// Testando com a metodologia triple-A explícito (Arrange, Act e Assert).
public class NumberPuzzleCheckInvalidResolutionTest extends BaseTest {

  private boolean isResolved;

  // Arrange (Organização/Preparação)
  @Override
  protected void arrange() {
    eightPuzzle = new NumberPuzzle(3);
    eightPuzzle.setBoard(disorderedBoard);
  }

  // Act (Ação)
  @Override
  protected void act() {
    isResolved = eightPuzzle.checkResolution();
  }

  // Assert (Afirmação)
  @Override
  public void assertTest() {
    Assert.assertFalse(isResolved);
  }

}

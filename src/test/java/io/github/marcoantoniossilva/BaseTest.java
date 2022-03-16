package io.github.marcoantoniossilva;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;
import org.junit.Before;
import org.junit.Test;

// Classe abstrata para implementação do teste triple-A explícito (Arrange, Act e Assert).
public abstract class BaseTest {

  final protected String[][] orderlyBoard = {
      {"1", "2", "3"},
      {"4", "5", "6"},
      {"7", "8", " "},
  };

  final protected String[][] disorderedBoard = {
      {"2", "5", "7"},
      {"6", " ", "8"},
      {"1", "4", "3"},
  };

  protected NumberPuzzle eightPuzzle;

  @Before
  public void initialize() {
    arrange();
    act();
  }

  // Arrange (Organização/Preparação) - Implementação obrigatória
  protected abstract void arrange();

  // Act (Ação) - Implementação obrigatória
  protected abstract void act();

  // Assert (Afirmação) - Implementação obrigatória
  @Test
  public abstract void assertTest();
}

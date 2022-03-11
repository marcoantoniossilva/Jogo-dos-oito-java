package io.github.marcoantoniossilva.application;

import io.github.marcoantoniossilva.puzzle.NumberPuzzle;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    // Cria um jogo de 3x3, no caso jogo dos oito (8-puzzle)
    NumberPuzzle eightPuzzle = new NumberPuzzle(3);

    do {
      eightPuzzle.print();
      System.out.println("Escolha um número para mover: ");
      String pieceNumber = keyboard.next();
      if (!eightPuzzle.move(pieceNumber)) {
        System.err.printf("O número %s não pode ser movido! Escolha outro: \n", pieceNumber);
      }
    } while (!eightPuzzle.checkResolution());
    eightPuzzle.print();
    System.out.printf("PARABÉNS!!! Jogo concluído com sucesso (%d jogadas)!\n", eightPuzzle.getNumberOfMoves());
  }
}

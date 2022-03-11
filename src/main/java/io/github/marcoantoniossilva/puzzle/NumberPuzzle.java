package io.github.marcoantoniossilva.puzzle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberPuzzle {
  private final int boardSize;
  private String[][] board;
  private int numberOfMoves = 0;

  public NumberPuzzle(int boardSize) {
    this.boardSize = boardSize;
    this.generate();
  }

  // Gera o tabuleiro com peças embaralhadas
  private void generate() {
    List<String> pieces = new ArrayList<>();
    board = new String[boardSize][boardSize];

    for (int i = 1; i <= boardSize * boardSize - 1; i++) {
      pieces.add(String.valueOf(i)); // Preenche o ArrayList pieces com números de 1 a boardSize * boardSize - 1
    }

    Collections.shuffle(pieces); // Embaralha os números
    pieces.add(" "); // Adiciona um espaço na última posição da lista

    int position = 0;
    for (int row = 0; row < boardSize; row++) {
      for (int column = 0; column < boardSize; column++) {
        if (position < boardSize * boardSize) {
          board[row][column] = pieces.get(position); // Preenche a matriz (tabuleiro) com os números embaralhados.
          position++;
        }
      }
    }
  }

  // Retorna a posição de uma peça no tabuleiro
  public int findPositionPiece(final String piece) {
    int position = 0;
    for (int row = 0; row < boardSize; row++) {
      for (int column = 0; column < boardSize; column++) {
        if (board[row][column].equals(piece)) {
          return position;
        }
        position++;
      }
    }
    return 0;
  }

  // Move uma peça
  public boolean move(final String piece) {
    if (canMove(piece)) {
      swap(piece);
      return true;
    }
    return false;
  }

  // Troca o espaço pela peça a ser movida
  private void swap(final String piece) {
    for (int row = 0; row < boardSize; row++) {
      for (int column = 0; column < boardSize; column++) {
        if (board[row][column].equals(piece)) { // Ao encontrar a peça a ser movida, substitui o conteúdo com um espaço
          board[row][column] = " ";
          continue;
        }
        if (board[row][column].equals(" ")) { // Ao encontrar o espaço, substitui o conteúdo com a peça a ser movida
          board[row][column] = piece;
        }
      }
    }
    this.numberOfMoves++;
  }

  // Retorna se uma peça pode ser movida ou não
  private boolean canMove(final String piece) {
    int blankPosition = findPositionPiece(" ");
    int piecePosition = findPositionPiece(piece);

    // Pode mover para cima
    if (blankPosition == piecePosition - boardSize) {
      return true;
    }
    // Pode mover para baixo
    if (blankPosition == piecePosition + boardSize) {
      return true;
    }
    // Pode mover para esquerda
    if (blankPosition == piecePosition - 1 && piecePosition % boardSize > 0) {
      return true;
    }
    // Pode mover para direita
    return blankPosition == piecePosition + 1 && piecePosition % boardSize < boardSize - 1;

  }

  // Verifica se o jogo foi completado
  public boolean checkResolution() {
    int sequence = 1;
    for (int row = 0; row < boardSize; row++) {
      for (int column = 0; column < boardSize; column++) {
        if (String.valueOf(sequence).equals(board[row][column])) { // Enquanto a peça em cada posição percorrida estiver na sequência, prossegue.
          sequence++;
        } else {
          /* Se não tiver na sequência mas se a sequência for equivalente a última posição da matriz e o conteúdo for um espaço
           * então o desafio foi resolvido (retorna true), se não, alguma peça está errada ou o espaço não está no final (retorna false)
           */
          return sequence == boardSize * boardSize && board[row][column].equals(" ");
        }
      }
    }
    return true;
  }

  // Imprime o tabuleiro
  public void print() {
    for (int row = 0; row < boardSize; row++) {
      for (int column = 0; column < boardSize; column++) {
        // Imprime com 3 caracteres, adicionando 1 ou 2 espaços (depende do tamanho da matriz) antes do número
        System.out.printf("%3s ", board[row][column]);
      }
      System.out.println();
    }
  }

  public void setBoard(String[][] board) {
    this.board = board;
  }

  // Retorna o número de jogadas feitas
  public int getNumberOfMoves() {
    return numberOfMoves;
  }

}

package io.github.marcoantoniossilva.puzzle;

import java.util.ArrayList;
import java.util.Collections;

public class NumberPuzzle {
  private final int boardSize;
  private String[][] board;
  private int numberOfMoves = 0;

  public NumberPuzzle(int boardSize) {
    this.boardSize = boardSize;
    this.generate();
  }

  private void generate() {
    ArrayList<String> pieces = new ArrayList<>();
    board = new String[boardSize][boardSize];

    for (int i = 1; i <= boardSize * boardSize - 1; i++) {
      pieces.add(String.valueOf(i));
    }

    Collections.shuffle(pieces);
    pieces.add(" ");

    int position = 0;
    for (int line = 0; line < boardSize; line++) {
      for (int column = 0; column < boardSize; column++) {
        if (position < boardSize * boardSize) {
          board[line][column] = pieces.get(position);
          position++;
        }
      }
    }
  }

  public int findPositionPiece(String pieceNumber) {
    int position = 0;
    for (int line = 0; line < boardSize; line++) {
      for (int column = 0; column < boardSize; column++) {
        if (board[line][column].equals(pieceNumber)) {
          return position;
        }
        position++;
      }
    }
    return 0;
  }

  public boolean move(String piece) {
    if (canMove(piece)) {
      swap(piece);
      return true;
    }
    return false;
  }

  private void swap(String piece) {
    for (int line = 0; line < boardSize; line++) {
      for (int column = 0; column < boardSize; column++) {
        if (board[line][column].equals(piece)) {
          board[line][column] = " ";
          continue;
        }
        if (board[line][column].equals(" ")) {
          board[line][column] = piece;
        }
      }
    }
    numberOfMoves++;
  }

  private boolean canMove(String piece) {
    int blankPosition = findPositionPiece(" ");
    int piecePosition = findPositionPiece(piece);
    if (blankPosition == piecePosition - boardSize) {
      return true;
    }
    if (blankPosition == piecePosition + boardSize) {
      return true;
    }
    if (blankPosition == piecePosition + 1 && piecePosition + 1 % boardSize > 1) {
      return true;
    }
    if (blankPosition == piecePosition - 1 && piecePosition + 1 % boardSize > 1) {
      return true;
    }
    if (blankPosition == piecePosition - 1 && piecePosition + 1 % boardSize == 0) {
      return true;
    }
    return blankPosition == piecePosition + 1 && piecePosition + 1 % boardSize == 1;
  }

  public boolean checkResolution() {
    int sequence = 1;
    for (int line = 0; line < boardSize; line++) {
      for (int column = 0; column < boardSize; column++) {
        if (String.valueOf(sequence).equals(board[line][column])) {
          sequence++;
        } else {
          return sequence == boardSize * boardSize && board[line][column].equals(" ");
        }
      }
    }
    return true;
  }

  public void print() {
    for (int line = 0; line < boardSize; line++) {
      for (int column = 0; column < boardSize; column++) {
        System.out.print(board[line][column] + " ");
      }
      System.out.println();
    }
  }

  public String[][] getBoard() {
    return board;
  }

  public void setBoard(String[][] board) {
    this.board = board;
  }

  public int getNumberOfMoves() {
    return numberOfMoves;
  }

}

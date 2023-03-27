package com.example.fifthteensquares;

import java.util.Random;

/*
    @Author Masato Tsujii
    GameModel has the main information for the game
 */
public class GameModel {
    public int maxRow = 9;
    public int maxCol = 9;

    int blankRow; int blankCol;

    int row; int col;

    Random ran = new Random();

    public GameModel() {
        blankCol = 0;
        blankRow = 0;
        row = 4;
        col = 4;
    }

    //sets the puzzles in random
    public void randomPuzzle () {
        blankRow = ran.nextInt(row);
        blankCol = ran.nextInt(col);
    }

    //getters & setters
    public int getBlankRow()
    {
        return blankRow;
    }
    public int getBlankCol()
    {
        return blankCol;
    }

    public void setBlankRow(int i){
        blankRow = i;}

    public void setBlankCol(int i){
        blankCol = i;}

    public int getRow() {
        return row;
    }
    public int getCol() {
        return col;
    }
    public void setRow(int i) {
        row = i;
    }
    public void setCol(int i) {
        col = i;
    }
}

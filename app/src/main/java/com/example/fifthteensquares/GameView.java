package com.example.fifthteensquares;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.Random;


/*
    @Author Masato Tsujii
    Displays what goes on the screen
 */

public class GameView {
    private Button[][] btns;
    private GameModel gameModel;
    private Button resetBtn;

    Random ran = new Random();
    public GameView(GameModel model) {
        gameModel = model;
        btns = new Button[9][9];
    }

    //adds the buttons to the board
    public void addBtns (int row, int col, Button b) {
        btns[row][col] = b;
    }

    //adds the rest button
    public void addResetButton(Button b){
        resetBtn = b;
    }

    //shuffles the board randomly
    public void shuffle() {
        gameModel.randomPuzzle();

        for (int i=0; i < gameModel.getRow(); i ++){
            for (int m = 0; m < gameModel.getCol();m++) {
                btns[i][m].setText("");
            }
        }

        ArrayList<Integer> track = new ArrayList<>();
        int m;
        for(int i = 0; i<gameModel.getRow();i++) {
            for(int j = 0; j < gameModel.getCol(); j++){
                if(!(gameModel.getBlankCol() == j && gameModel.getBlankRow() == i)) {
                    int num = (gameModel.getRow() * gameModel.getCol())-1;
                    //random num from 1-15
                    m = ran.nextInt(num)+1;

                    while(track.contains(m)) {
                        m = ran.nextInt(num) + 1;
                    }
                    track.add(m);
                    //sets the text on the location
                    btns[i][j].setText(Integer.toString(m));

                }
            }
        }
        //updates the board
        update();
    }

    public void update() {
        for(int i = 0; i < gameModel.getRow(); i++) {
            for (int j = 0; j < gameModel.getCol(); j++) {
                //sets the buttons so they are not clickable
                btns[i][j].setClickable(false);
            }
        }

        //checks for valid moves
        if(gameModel.blankRow - 1 != -1){
            btns[gameModel.blankRow-1][gameModel.blankCol].setClickable(true);
        }
        if(gameModel.blankCol - 1 != -1){
            btns[gameModel.blankRow][gameModel.blankCol-1].setClickable(true);
        }
        if(gameModel.blankRow + 1 != gameModel.getRow()){
            btns[gameModel.blankRow+1][gameModel.blankCol].setClickable(true);
        }
        if(gameModel.blankRow + 1 != gameModel.getCol()){
            btns[gameModel.blankRow][gameModel.blankCol + 1].setClickable(true);
        }

        int counter = 1;
        //checks if the button is in the right place
        for (int i = 0; i < gameModel.getRow(); i++) {
            for (int j = 0 ; j < gameModel.getCol(); j++) {
                if(btns[i][j].getText().equals(Integer.toString(counter))){
                    status(btns[i][j], true);
                }
                else {
                    status(btns[i][j], false) ;
                    counter++;
                }
            }
        }
    }

    //sets the button to green  and red if its false
    public void status (Button b, boolean bool) {
        if (bool) {
            b.setBackgroundColor(Color.GREEN);
        }
        else{
                b.setBackgroundColor(Color.GRAY);
            }
        }



    public void setOnClick(GameController game){
        for(int i = 0; i < gameModel.maxRow; i++)
        {
            for(int j = 0; j < gameModel.maxCol; j++)
            {
                btns[i][j].setOnClickListener(game);
            }
        }
        resetBtn.setOnClickListener(game);
    }

    /*
    checks the whole board to see if the button equals to "b" if it is equal it sets the
    row and col to the current row and col.
    Gets the text from the button that was clicked and stores it in a String variable called "s".
    */
    public void switchP (Button b) {
        int row =0;
        int col =0;
        for(int i = 0; i < gameModel.getRow(); i++)
        {
            for(int j = 0; j < gameModel.getCol(); j++)
            {
                if(btns[i][j].equals(b)){
                    row = i;
                    col = j;
                }
            }
        }
        String s = (String)btns[row][col].getText();
        btns[gameModel.blankRow][gameModel.blankCol].setText(s);
        btns[row][col].setText("");
        gameModel.setBlankRow(row);
        gameModel.setBlankCol(col);
        update();
    }

    //Allows us to modify the board size
    public void boardSize() {
        for(int i = 0; i < gameModel.maxRow; i++){
            for(int j = 0; j < gameModel.maxCol; j++) {
                //removes all the buttons
                btns[i][j].setVisibility(View.GONE);
            }
        }
        for(int i = 0; i < gameModel.getRow(); i++){
            for(int j = 0; j < gameModel.getCol(); j++){
                btns[i][j].setVisibility(View.VISIBLE);
            }
        }
        //shuffles the board
        shuffle();
    }
}




























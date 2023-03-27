package com.example.fifthteensquares;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

/*
    @Author Masato Tsujii
    The main class sets up the UI for the 15 puzzle game by creating a
    GameModel and GameView object and adding the buttons to the GameView object.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Create instances of GameModel and Game View
        GameModel gameModel = new GameModel();
        GameView gameView = new GameView(gameModel);

        //Add buttons from activity_main.xml to the gameView
        gameView.addBtns(0, 0, findViewById(R.id.button1));
        gameView.addBtns(0, 1, findViewById(R.id.button2));
        gameView.addBtns(0, 2, findViewById(R.id.button3));
        gameView.addBtns(0, 3, findViewById(R.id.button4));
        gameView.addBtns(1, 0, findViewById(R.id.button5));
        gameView.addBtns(1, 1, findViewById(R.id.button6));
        gameView.addBtns(1, 2, findViewById(R.id.button7));
        gameView.addBtns(1, 3, findViewById(R.id.button8));
        gameView.addBtns(2, 0, findViewById(R.id.button9));
        gameView.addBtns(2, 1, findViewById(R.id.button10));
        gameView.addBtns(2, 2, findViewById(R.id.button11));
        gameView.addBtns(2, 3, findViewById(R.id.button12));
        gameView.addBtns(3, 0, findViewById(R.id.button13));
        gameView.addBtns(3, 1, findViewById(R.id.button14));
        gameView.addBtns(3, 2, findViewById(R.id.button15));
        gameView.addBtns(3, 3, findViewById(R.id.button16));

        gameView.addBtns(0, 4, findViewById(R.id.button0_4));
        gameView.addBtns(0, 5, findViewById(R.id.button0_5));
        gameView.addBtns(0, 6, findViewById(R.id.button0_6));
        gameView.addBtns(0, 7, findViewById(R.id.button0_7));
        gameView.addBtns(0, 8, findViewById(R.id.button0_8));

        gameView.addBtns(1, 4, findViewById(R.id.button1_4));
        gameView.addBtns(1, 5, findViewById(R.id.button1_5));
        gameView.addBtns(1, 6, findViewById(R.id.button1_6));
        gameView.addBtns(1, 7, findViewById(R.id.button1_7));
        gameView.addBtns(1, 8, findViewById(R.id.button1_8));

        gameView.addBtns(2, 4, findViewById(R.id.button2_4));
        gameView.addBtns(2, 5, findViewById(R.id.button2_5));
        gameView.addBtns(2, 6, findViewById(R.id.button2_6));
        gameView.addBtns(2, 7, findViewById(R.id.button2_7));
        gameView.addBtns(2, 8, findViewById(R.id.button2_8));

        gameView.addBtns(3, 4, findViewById(R.id.button3_4));
        gameView.addBtns(3, 5, findViewById(R.id.button3_5));
        gameView.addBtns(3, 6, findViewById(R.id.button3_6));
        gameView.addBtns(3, 7, findViewById(R.id.button3_7));
        gameView.addBtns(3, 8, findViewById(R.id.button3_8));

        gameView.addBtns(4, 0, findViewById(R.id.button4_0));
        gameView.addBtns(4, 1, findViewById(R.id.button4_1));
        gameView.addBtns(4, 2, findViewById(R.id.button4_2));
        gameView.addBtns(4, 3, findViewById(R.id.button4_3));
        gameView.addBtns(4, 4, findViewById(R.id.button4_4));
        gameView.addBtns(4, 5, findViewById(R.id.button4_5));
        gameView.addBtns(4, 6, findViewById(R.id.button4_6));
        gameView.addBtns(4, 7, findViewById(R.id.button4_7));
        gameView.addBtns(4, 8, findViewById(R.id.button4_8));

        gameView.addBtns(5, 0, findViewById(R.id.button5_0));
        gameView.addBtns(5, 1, findViewById(R.id.button5_1));
        gameView.addBtns(5, 2, findViewById(R.id.button5_2));
        gameView.addBtns(5, 3, findViewById(R.id.button5_3));
        gameView.addBtns(5, 4, findViewById(R.id.button5_4));
        gameView.addBtns(5, 5, findViewById(R.id.button5_5));
        gameView.addBtns(5, 6, findViewById(R.id.button5_6));
        gameView.addBtns(5, 7, findViewById(R.id.button5_7));
        gameView.addBtns(5, 8, findViewById(R.id.button5_8));

        gameView.addBtns(6, 0, findViewById(R.id.button6_0));
        gameView.addBtns(6, 1, findViewById(R.id.button6_1));
        gameView.addBtns(6, 2, findViewById(R.id.button6_2));
        gameView.addBtns(6, 3, findViewById(R.id.button6_3));
        gameView.addBtns(6, 4, findViewById(R.id.button6_4));
        gameView.addBtns(6, 5, findViewById(R.id.button6_5));
        gameView.addBtns(6, 6, findViewById(R.id.button6_6));
        gameView.addBtns(6, 7, findViewById(R.id.button6_7));
        gameView.addBtns(6, 8, findViewById(R.id.button6_8));

        gameView.addBtns(7, 0, findViewById(R.id.button7_0));
        gameView.addBtns(7, 1, findViewById(R.id.button7_1));
        gameView.addBtns(7, 2, findViewById(R.id.button7_2));
        gameView.addBtns(7, 3, findViewById(R.id.button7_3));
        gameView.addBtns(7, 4, findViewById(R.id.button7_4));
        gameView.addBtns(7, 5, findViewById(R.id.button7_5));
        gameView.addBtns(7, 6, findViewById(R.id.button7_6));
        gameView.addBtns(7, 7, findViewById(R.id.button7_7));
        gameView.addBtns(7, 8, findViewById(R.id.button7_8));

        gameView.addBtns(8, 0, findViewById(R.id.button8_0));
        gameView.addBtns(8, 1, findViewById(R.id.button8_1));
        gameView.addBtns(8, 2, findViewById(R.id.button8_2));
        gameView.addBtns(8, 3, findViewById(R.id.button8_3));
        gameView.addBtns(8, 4, findViewById(R.id.button8_4));
        gameView.addBtns(8, 5, findViewById(R.id.button8_5));
        gameView.addBtns(8, 6, findViewById(R.id.button8_6));
        gameView.addBtns(8, 7, findViewById(R.id.button8_7));
        gameView.addBtns(8, 8, findViewById(R.id.button8_8));


        gameView.addResetButton(findViewById(R.id.button17));
        SeekBar s = findViewById(R.id.seekBar);

        GameController gameController = new GameController(gameModel, gameView);

        gameView.setOnClick(gameController);

        s.setOnSeekBarChangeListener(gameController);

        gameView.shuffle();
    }
}
package com.example.fifthteensquares;

import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

/*
    @Author Masato Tsujii
     controls the behavior of a game based on user interactions with the game view and seek bar.
 */
public class GameController implements View.OnClickListener, SeekBar.OnSeekBarChangeListener {

    GameView gameView; GameModel gameModel;


    public GameController(GameModel model, GameView view) {
        gameModel = model;
        gameView = view;
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        if ((btn.getText()).equals("reset")) {
            gameView.shuffle();
        } else {
            gameView.switchP((Button) view);
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean bool) {
            gameModel.setCol(i);
            gameModel.setRow(i);
            gameView.boardSize();
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}

package com.andreabonatti92.chessboard;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import androidx.annotation.NonNull;

/**
 * The main idea is to use the screen’s length to create the starting square.
 * The square represents the full board
 * The next step is divide the board in the different squares
 * The number of squares is based on a parameter called grid length
 * The final step will be capture the input of which square will be touch by human finger
 * I will change the color of the square properly
 */
public class ChessBoard extends View {
    public ChessBoard(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
    }
}

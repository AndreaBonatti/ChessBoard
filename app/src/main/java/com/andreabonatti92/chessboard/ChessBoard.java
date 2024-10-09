package com.andreabonatti92.chessboard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
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
    private int gridLength;
    private Paint grayPaint, blackPaint;

    public ChessBoard(Context context) {
        super(context);
        this.gridLength = 8; // TODO this will be a parameter of the class
        grayPaint = new Paint();
        grayPaint.setColor(Color.GRAY);
        blackPaint = new Paint();
        blackPaint.setColor(Color.BLACK);
    }

    @Override
    protected void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);

        int screenLength = getWidth();
        int squareSide = screenLength / gridLength;
        for (int i = 0; i < gridLength; i++) {
            if (isEven(i)) {
                canvas.drawRect(0f + i * squareSide, 0f, (i + 1) * squareSide, squareSide, grayPaint);
            } else {
                canvas.drawRect(0f + i * squareSide, 0f, (i + 1) * squareSide, squareSide, blackPaint);
            }
        }

    }

    private boolean isEven(int number) {
        return ((number % 2) == 0);
    }
}

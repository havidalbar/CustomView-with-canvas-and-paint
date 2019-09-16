package com.example.tugaspapb;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

public class CustomView extends View {

	private Paint warna1, warna2, warna3;

	public CustomView(Context context) {
		super(context);
	}

	public CustomView(Context context, @Nullable AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
	}


	protected void onDraw(Canvas canvas){
		warna1 = new Paint();
		warna2 = new Paint();
		warna3 = new Paint();
		warna1.setAntiAlias(true);
		warna2.setAntiAlias(true);
		warna3.setAntiAlias(true);
		warna1.setColor(Color.parseColor("#61ff69"));
		warna2.setColor(Color.parseColor("#fdf542"));
		warna3.setColor(Color.parseColor("#ff6961"));

		float radius = 210;
		float ordinat_x, ordinat_y;
		ordinat_x = getWidth()/2;
		ordinat_y = getHeight();

		canvas.drawCircle(ordinat_x,ordinat_y/1.35f ,radius,warna1);
		canvas.drawCircle(ordinat_x, ordinat_y/2 , radius, warna2);
		canvas.drawCircle(ordinat_x, ordinat_y/3.85f ,radius,warna3);




	}
}

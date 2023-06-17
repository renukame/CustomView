package com.example.testapplication.customview

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class CircleView(context: Context) : View(context) {
    var paint: Paint = Paint()
    val cx = 540f
    val cy = 540f
    val radius = 500f
    init {
        paint.color = Color.BLACK
        paint.strokeWidth = 40f
    }
    override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle(cx,cy,radius,paint)
        super.onDraw(canvas)
    }
}
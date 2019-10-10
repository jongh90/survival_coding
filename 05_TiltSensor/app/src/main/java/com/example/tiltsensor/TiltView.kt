package com.example.tiltsensor

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.hardware.SensorEvent
import android.view.View

class TiltView(context: Context?) : View(context) {
    private val greenPaint: Paint = Paint()
    private val blackPaint: Paint = Paint()
    private var cX: Float = 0f
    private var cY: Float = 0f
    private var xCord: Float = 0f
    private var yCord: Float = 0f

    init{
        greenPaint.color = Color.GREEN
        blackPaint.color = Color.BLACK
        blackPaint.style = Paint.Style.STROKE
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        cX = w / 2f
        cY = h / 2f
    }

    fun onSensorEvent(event: SensorEvent){
        yCord = event.values[0] * 20
        xCord = event.values[1] * 20
        invalidate()
    }

    override fun onDraw(canvas: Canvas?) {
        canvas?.drawCircle(cX, cY, 100f, blackPaint)
        canvas?.drawCircle(xCord + cX, yCord + cY, 100f, greenPaint)
        canvas?.drawLine(cX - 20, cY, cX + 20, cY, blackPaint)
        canvas?.drawLine(cX, cY - 20, cX, cY + 20, blackPaint)
    }
}
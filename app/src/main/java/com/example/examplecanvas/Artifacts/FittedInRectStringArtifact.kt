package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Rect
import android.graphics.Typeface
import android.text.TextPaint

open class FittedInRectStringArtifact(context: Context, val rect: Rect, val text: String, val typefaceFont: Typeface, val colorForText: Int) : DrawArtifact(context) {
    protected var textPaint: TextPaint = TextPaint()

    init
    {
        textPaint.apply {
            color = colorForText
            isAntiAlias = true
            typeface = typefaceFont
        }
        //for testing
        paint.apply {
            style = Paint.Style.STROKE
        }
    }

    protected fun setTextSizeForWidth(paint: Paint, rect: Rect, text: String) {
        val testTextSize = 48f
        paint.textSize = testTextSize
        var desiredTextSize = testTextSize * rect.width() / paint.measureText(text)
        paint.textSize = desiredTextSize

        while (getTextHeight(textPaint, text) > rect.height())
        {
            desiredTextSize -= 0.1f
            paint.textSize = desiredTextSize
        }
    }

    protected fun getTextHeight(paint: Paint, text: String): Int {
        val bounds = Rect()
        paint.getTextBounds(text, 0, text.length, bounds)
        return bounds.height()
    }

    protected open fun drawText()
    {
        setTextSizeForWidth(textPaint, rect, text)
        extraCanvas.drawText(text, rect.left.toFloat(),  rect.exactCenterY() + getTextHeight(textPaint, text)/2f, textPaint)
        extraCanvas.drawRect(rect, paint) //for testing
        extraCanvas.save()
        extraCanvas.restore()
    }

    override fun onDraw(canvas: Canvas) {
        drawText()
        super.onDraw(canvas)
    }
}
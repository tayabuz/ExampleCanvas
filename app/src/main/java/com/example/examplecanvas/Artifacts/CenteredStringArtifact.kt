package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.Typeface


class CenteredStringArtifact(context: Context, rect: Rect, text: String, typefaceFont: Typeface, colorForText: Int) : FittedInRectStringArtifact(context, rect, text, typefaceFont, colorForText) {

    override fun drawText()
    {
        setTextSizeForWidth(textPaint, rect, text)
        val bounds =  calculateBounds(textPaint, rect, text)

        extraCanvas.drawLine(rect.left.toFloat(), rect.exactCenterY(), rect.right.toFloat(), rect.exactCenterY(), paint) //for testing
        extraCanvas.drawLine(rect.exactCenterX(), rect.top.toFloat(), rect.exactCenterX(), rect.bottom.toFloat(), paint) //for testing

        extraCanvas.drawText(text, bounds.left, bounds.top - textPaint.ascent(), textPaint)
        extraCanvas.drawRect(rect, paint) //for testing
        extraCanvas.save()
        extraCanvas.restore()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}
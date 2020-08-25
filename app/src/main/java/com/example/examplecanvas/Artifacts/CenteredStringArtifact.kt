package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.Canvas
import android.graphics.Rect
import android.graphics.Typeface


class CenteredStringArtifact(context: Context, rect: Rect, text: String, typefaceFont: Typeface, colorForText: Int) : FittedInRectStringArtifact(context, rect, text, typefaceFont, colorForText) {

    override fun drawText(canvas: Canvas)
    {
        setTextSizeForWidth(textPaint, rect, text)
        val bounds =  calculateBounds(textPaint, rect, text)

        canvas.drawLine(rect.left.toFloat(), rect.exactCenterY(), rect.right.toFloat(), rect.exactCenterY(), paint) //for testing
        canvas.drawLine(rect.exactCenterX(), rect.top.toFloat(), rect.exactCenterX(), rect.bottom.toFloat(), paint) //for testing

        canvas.drawText(text, bounds.left, bounds.top - textPaint.ascent(), textPaint)
        canvas.drawRect(rect, paint) //for testing
        canvas.save()
        canvas.restore()
    }
}
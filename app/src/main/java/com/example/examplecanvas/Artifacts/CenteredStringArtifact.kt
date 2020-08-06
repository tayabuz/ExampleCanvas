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

        val bounds = RectF(rect)
        bounds.right = textPaint.measureText(text, 0, text.length)
        bounds.bottom = textPaint.descent() - textPaint.ascent()

        bounds.left += (rect.width() - bounds.right) / 2f
        bounds.top += (rect.height() - bounds.bottom) / 2f

        extraCanvas.drawText(text, bounds.left, bounds.top - textPaint.ascent(), textPaint)
        extraCanvas.drawRect(rect, paint) //for testing
        extraCanvas.save()
        extraCanvas.restore()
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
    }
}
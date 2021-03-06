package com.example.examplecanvas.Artifacts

import android.graphics.*
import android.text.TextPaint
import kotlin.math.ceil

open class FittedInRectStringArtifact(
    val rect: Rect,
    val text: String,
    val typefaceFont: Typeface,
    val colorForText: Int
) : DrawArtifact() {
    protected var textPaint: TextPaint = TextPaint()

    init {
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

        while (getTextHeight(textPaint) > rect.height()) {
            desiredTextSize -= 0.1f
            paint.textSize = desiredTextSize
        }
    }

    private fun getTextHeight(paint: Paint): Int {
        return ceil(paint.fontMetrics.descent - paint.fontMetrics.ascent).toInt()
    }

    protected fun calculateBounds(paint: Paint, rect: Rect, text: String): RectF {
        val bounds = RectF(rect)
        bounds.right = paint.measureText(text, 0, text.length)
        bounds.bottom = paint.descent() - paint.ascent()

        bounds.left += (rect.width() - bounds.right) / 2f
        bounds.top += (rect.height() - bounds.bottom) / 2f
        return bounds
    }

    protected open fun drawText(canvas: Canvas) {
        setTextSizeForWidth(textPaint, rect, text)
        val bounds = calculateBounds(textPaint, rect, text)

        canvas.drawText(text, rect.left.toFloat(), bounds.top - textPaint.ascent(), textPaint)

        canvas.drawLine(
            rect.left.toFloat(),
            rect.exactCenterY(),
            rect.right.toFloat(),
            rect.exactCenterY(),
            paint
        ) //for testing
        canvas.drawRect(rect, paint) //for testing

        canvas.save()
        canvas.restore()
    }

    override fun onDraw(canvas: Canvas) {
        drawText(canvas)
    }
}
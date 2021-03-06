package com.example.examplecanvas.Artifacts

import android.graphics.Canvas
import android.graphics.Point
import android.graphics.Typeface
import android.os.Build
import android.text.Layout
import android.text.StaticLayout
import android.text.TextPaint
import androidx.core.graphics.withTranslation


class StringArtifact(
    val point: Point,
    val text: String,
    val typefaceFont: Typeface,
    val colorForText: Int,
    val fontSize: Float
) : DrawArtifact() {

    private var textPaint: TextPaint = TextPaint()
    private lateinit var textLayout: StaticLayout

    init {
        textPaint.apply {
            color = colorForText
            isAntiAlias = true
            textSize = fontSize
            typeface = typefaceFont
        }
    }

    fun StaticLayout.draw(canvas: Canvas, x: Int, y: Int) {
        canvas.withTranslation(x.toFloat(), y.toFloat()) { draw(this) }
    }

    override fun onDraw(canvas: Canvas) {
        textLayout =
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) StaticLayout.Builder.obtain(
                text,
                0,
                text.length,
                textPaint,
                canvas.width - point.x
            ).build()
            else {
                StaticLayout(
                    text,
                    textPaint,
                    canvas.width - point.x,
                    Layout.Alignment.ALIGN_NORMAL,
                    1f,
                    0f,
                    false
                )
            }

        textLayout.draw(canvas, point.x, point.y)
        canvas.save()
        canvas.restore()
    }
}
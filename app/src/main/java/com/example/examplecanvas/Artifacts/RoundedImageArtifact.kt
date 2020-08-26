package com.example.examplecanvas.Artifacts

import android.content.Context
import android.graphics.*
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory
import androidx.core.graphics.drawable.toBitmap

class RoundedImageArtifact(
    private val context: Context,
    private val bitmap: Bitmap,
    private val rect: RectF,
    private val radius: Float
) : DrawArtifact() {

    constructor(context: Context, resourceID: Int, rect: RectF, radius: Float) : this(
        context,
        BitmapFactory.decodeResource(context.resources, resourceID),
        rect,
        radius
    )

    override fun onDraw(canvas: Canvas) {
        val roundBitmap = RoundedBitmapDrawableFactory.create(context.resources, bitmap)
        roundBitmap.cornerRadius = radius
        canvas.drawBitmap(
            roundBitmap.toBitmap(),
            null,
            rect,
            paint
        )
    }
}
package com.example.examplecanvas.Artifacts

import android.graphics.Bitmap
import android.graphics.Canvas

class ArtifactDrawer constructor() {
    constructor(artifacts: Array<DrawArtifact>) : this() {
        artifacts.toCollection(this.artifacts)
    }

    fun drawInBitmap(width: Int, height: Int): Bitmap {
        val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        for (artifact in artifacts) {
            artifact.onDraw(canvas)
        }
        return bitmap
    }

    private var artifacts: MutableList<DrawArtifact> = mutableListOf()

    fun add(artifact: DrawArtifact) {
        artifacts.add(artifact)
    }

    fun addAll(artifacts: Iterable<DrawArtifact>) {
        this.artifacts.addAll(artifacts)
    }
}
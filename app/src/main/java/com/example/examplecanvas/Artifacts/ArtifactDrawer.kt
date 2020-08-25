package com.example.examplecanvas.Artifacts

import android.graphics.Bitmap
import android.graphics.Canvas

class ArtifactDrawer constructor()
{
    constructor(artifacts: Array<DrawArtifact>) : this() {
        artifacts.toCollection(Artifacts)
    }

    fun drawInBitmap(width: Int, height: Int):Bitmap
    {
        val extraBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
        val extraCanvas = Canvas(extraBitmap)
        for (artifact in Artifacts){
            artifact.draw(extraCanvas)
        }
        return extraBitmap
    }

    var Artifacts: MutableList<DrawArtifact> = mutableListOf()
        get
        private set


    fun Add(artifact: DrawArtifact){
        Artifacts.add(artifact)
    }

    fun AddAll(artifacts: Iterable<DrawArtifact>){
        Artifacts.addAll(artifacts)
    }
}
package com.example.examplecanvas.Artifacts

class ArtifactDrawer constructor()
{
    constructor(artifacts: Array<DrawArtifact>) : this() {
        artifacts.toCollection(Artifacts)
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
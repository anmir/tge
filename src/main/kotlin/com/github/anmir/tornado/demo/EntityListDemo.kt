package com.github.anmir.tornado.demo

import com.github.anmir.tornado.views.MainView
import com.jfoenix.controls.JFXDecorator
import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import tornadofx.importStylesheet

class EntityListApp : Application() {
    override fun start(stage: Stage) {
        val content = MainView()
        val decorator = JFXDecorator(stage, content.root)
        decorator.isCustomMaximize = true
        val scene = Scene(decorator, 800.0, 850.0)
        stage.minWidth = 700.0
        stage.minHeight = 800.0
        stage.scene = scene
        stage.show()
    }
}

fun main(args: Array<String>) {
    importStylesheet("/css/jfoenix-components.css")
    importStylesheet("/css/jfoenix-main-demo.css")
    Application.launch(EntityListApp::class.java, *args)
}
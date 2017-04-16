package com.github.anmir.tornado.demo

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.web.WebView
import javafx.stage.Stage


class PolymerApp : Application() {
    override fun start(primaryStage: Stage) {
        val webView = WebView()
        webView.engine.load("http://www.polymer-project.org/0.5/components/paper-elements/demo.html")
        primaryStage.scene = Scene(webView)
        primaryStage.show()
    }
}

fun main(args: Array<String>) {
    Application.launch(PolymerApp::class.java, *args)
}

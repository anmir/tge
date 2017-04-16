package com.github.anmir.tornado.views

import tornadofx.View
import tornadofx.vbox

class MainView : View("Main") {

    override val root = vbox {
        this += EntityListView::class
    }
}
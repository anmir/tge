package com.github.anmir.tornado.controller

import com.github.anmir.tornado.model.Entity
import com.github.anmir.tornado.service.StubEntityService
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import tornadofx.Controller

class EntityController : Controller() {
    val entityService = StubEntityService()

    fun getEntities(): ObservableList<Entity> {
        return FXCollections.observableList(entityService.getAll())
    }


}
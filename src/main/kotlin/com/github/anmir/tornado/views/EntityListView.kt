package com.github.anmir.tornado.views


import com.github.anmir.tornado.controller.EntityController
import com.github.anmir.tornado.model.Constants.DISABLED_ENTITY
import com.github.anmir.tornado.model.Constants.ENABLED_ENTITY
import com.github.anmir.tornado.model.Entity
import tornadofx.*


class EntityListView : View() {
    val entityController: EntityController by inject()

    override val root = vbox(5.0) {
        label {
            text = "entities: "
        }

        tableview(entityController.getEntities()) {
            column("id", Entity::id)
            column("name", Entity::name)
            column("status", Entity::status).cellFormat {
                text = it
                style {
                    when (it) {
                        ENABLED_ENTITY -> backgroundColor += c("#66BB6A")
                        DISABLED_ENTITY -> backgroundColor += c("#F44336")
                        else -> throw IllegalStateException()
                    }
                }
            }
        }
    }

}
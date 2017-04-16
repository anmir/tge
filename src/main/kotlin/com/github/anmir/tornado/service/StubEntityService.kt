package com.github.anmir.tornado.service

import com.github.anmir.tornado.model.Constants.DISABLED_ENTITY
import com.github.anmir.tornado.model.Constants.ENABLED_ENTITY
import com.github.anmir.tornado.model.Entity

class StubEntityService : EntityService {

    override fun getAll(): List<Entity> {
        return listOf(
                Entity(1, "entity1", ENABLED_ENTITY),
                Entity(2, "entity2", DISABLED_ENTITY)
        )

    }
}
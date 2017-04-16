package com.github.anmir.tornado.service

import com.github.anmir.tornado.model.Entity

interface EntityService {

    fun getAll(): List<Entity>

}
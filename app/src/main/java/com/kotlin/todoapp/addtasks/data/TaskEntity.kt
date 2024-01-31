package com.kotlin.todoapp.addtasks.data

import androidx.room.PrimaryKey

data class TaskEntity(
    @PrimaryKey
    val id: Int,
    var task: String,
    var selected: Boolean = false
)
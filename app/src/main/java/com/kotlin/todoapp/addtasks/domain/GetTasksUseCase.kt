package com.kotlin.todoapp.addtasks.domain

import com.kotlin.todoapp.addtasks.data.TaskRepository
import com.kotlin.todoapp.addtasks.ui.model.TaskModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTasksUseCase @Inject constructor(private val taskRepository: TaskRepository) {
    operator fun invoke(): Flow<List<TaskModel>>{
        return taskRepository.tasks
    }
}
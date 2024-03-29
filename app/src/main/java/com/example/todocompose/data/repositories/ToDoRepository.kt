package com.example.todocompose.data.repositories

import com.example.todocompose.data.ToDoDao
import com.example.todocompose.data.model.ToDoTask
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@ViewModelScoped
class ToDoRepository @Inject constructor(private val toDoDao: ToDoDao) {
    val getAllTask: Flow<List<ToDoTask>> = toDoDao.getAllTasks()
    val sortByLowPriority: Flow<List<ToDoTask>> = toDoDao.sortByLowPriority()
    val sortByHighPriority: Flow<List<ToDoTask>> = toDoDao.sortByHighPriority()

    fun getSelectedTask(taskId: Int): Flow<ToDoTask> = toDoDao.getTask(taskId = taskId)

    suspend fun addTask(toDoTask: ToDoTask){
        toDoDao.addTask(toDoTask = toDoTask)
    }

    suspend fun updateTask(toDoTask: ToDoTask){
        toDoDao.updateTask(toDoTask = toDoTask)
    }

    suspend fun deleteTask(toDoTask: ToDoTask){
        toDoDao.deleteTask(toDoTask = toDoTask)
    }

    suspend fun deleteAllTask(){
        toDoDao.deleteAllTask()
    }

    fun searchDatabase(query: String): Flow<List<ToDoTask>>{
        return toDoDao.searchQuery(query = query)
    }
}
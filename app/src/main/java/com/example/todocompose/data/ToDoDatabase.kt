package com.example.todocompose.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.todocompose.data.model.ToDoTask

@Database(entities = [ToDoTask::class], version = 1, exportSchema = false)
abstract class ToDoDatabase: RoomDatabase() {
    abstract fun toDoDAO(): ToDoDao
}
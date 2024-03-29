package com.example.todocompose.navigation

import androidx.navigation.NavController
import com.example.todocompose.util.Action
import com.example.todocompose.util.Constants.LIST_SCREEN

class Screens(navController: NavController) {
    val list: (Action) -> Unit = {action ->
        navController.navigate("list/${action.name}") {
            popUpTo(LIST_SCREEN){inclusive = true}
        }
    }

    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}
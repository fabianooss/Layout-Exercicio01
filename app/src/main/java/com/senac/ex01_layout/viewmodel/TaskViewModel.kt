package com.senac.ex01_layout.viewmodel

import androidx.lifecycle.ViewModel
import com.senac.ex01_layout.model.Priority
import com.senac.ex01_layout.model.Status
import com.senac.ex01_layout.model.Task
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class TaskViewModel : ViewModel() {

    private val _state = MutableStateFlow(Task())

    val uiState = _state.asStateFlow()

    fun updateTitle(title: String) {
        _state.value = _state.value.copy(title = title)
    }

    fun updateStatus(status: Status) {
        _state.value = _state.value.copy(status = status)
    }

    fun updatePriority(priority: Priority) {
        _state.value = _state.value.copy(priority = priority)
    }

    // update date time

    fun cancel() {

    }

    fun reset() {

    }

    fun submit() {

    }

}
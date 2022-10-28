package com.oruam.a7minutesworkout

data class ExerciseModel (
    private var id: Int,
    private var name: String,
    private var image: Int,
    private var isCompleted: Boolean,
    private var isSelected: Boolean
)
package com.oruam.a7minutesworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oruam.a7minutesworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    var binding: ActivityExerciseBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbarExercise)

        // Generates de back button on the toolbar
        if(supportActionBar != null) {
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        // set that on click on the back button will return to the home view
        binding?.toolbarExercise?.setNavigationOnClickListener {
            onBackPressed()
        }
    }

    // necessary implements this methods to avoid memory leak, because of the view binding
    override fun onDestroy() {
        super.onDestroy()

        binding = null
    }
}
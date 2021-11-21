package com.nuresa.androidlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class SimpleActivity : AppCompatActivity() {
    private lateinit var nameInput: EditText
    private lateinit var outputText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple)
        nameInput = findViewById(R.id.input_name)
        outputText = findViewById(R.id.text_output)
    }

    fun handleSubmit(view: View) {
        var name : String = nameInput.toString()
        outputText.setText("Hello "+name)
    }
}
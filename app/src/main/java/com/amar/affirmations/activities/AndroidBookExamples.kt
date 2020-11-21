package com.amar.affirmations.activities

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.amar.affirmations.MainActivity
import com.amar.affirmations.databinding.ActivityAndroidBookExamplesBinding

class AndroidBookExamples : AppCompatActivity() {

    private lateinit var binding: ActivityAndroidBookExamplesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAndroidBookExamplesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.userNameEditText.setOnKeyListener { view, keyCode, _ ->
            handleKeyEvent(view, keyCode)
        }

        binding.enterButton.setOnClickListener { view ->
            hideKeyboard(view)
            val userName = binding.userNameEditText.text.toString()
            if (userName.isNotEmpty()) {
                val welcomeMsg =
                    "Welcome ${binding.userNameEditText.text.toString()}!"
                binding.welcomeText.text = welcomeMsg
                binding.userNameEditText.setText("")
                Toast.makeText(this@AndroidBookExamples, welcomeMsg, Toast.LENGTH_LONG).show()
                binding.userName.error = null
            } else {
                binding.welcomeText.text = ""
                binding.userName.error = "Please enter your name to enter"
            }
        }
    }

    private fun handleKeyEvent(view: View, keyCode: Int): Boolean {
        if (keyCode == KeyEvent.KEYCODE_ENTER) {
            hideKeyboard(view)
            return true
        }
        return false
    }

    private fun hideKeyboard(view: View) {
        (getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager).hideSoftInputFromWindow(
            view.windowToken,
            0
        )
    }

    fun openAffirmation(view: View) {
        startActivity(Intent(this@AndroidBookExamples, MainActivity::class.java))
    }

}
package com.example.zuriviewgroupstask

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
        val email = findViewById<TextInputEditText>(R.id.email_edit_text)
        val password = findViewById<TextInputEditText>(R.id.password_edit_text)
        val signInButton = findViewById<MaterialButton>(R.id.next_button)

        signInButton.setOnClickListener {
            if (email.toString().isEmpty() || password.toString().isEmpty()){
                Toast.makeText(this, "Email or Password is not provided", Toast.LENGTH_LONG).show()

            } else{
                if (email.toString() == "bluebun07@gmail.com" && password.toString() == "12345"){
                    val intent = Intent(this, viewActivity::class.java)
                    startActivity(intent)

                } else{
                    Toast.makeText(this, "Wrong Email or Password", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

//    private fun setupSimpleSpinner() {
//        val spinner = findViewById<Spinner>(R.id.simple_spinner)
//
//        val adapter = ArrayAdapter.createFromResource(this, R.array.Programming_languages, android.R.layout.simple_spinner_item)
//        spinner.adapter = adapter
//
//        spinner.onItemSelectedListener = object: AdapterView.OnItemSelectedListener{
//            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
//                val selectedItem = parent!!.getItemAtPosition(position)
//                Toast.makeText(this@MainActivity, "$selectedItem", Toast.LENGTH_LONG).show()
//            }
//
//            override fun onNothingSelected(parent: AdapterView<*>?) {
//                Toast.makeText(this@MainActivity, "No Item was selected", Toast.LENGTH_LONG).show()
//            }
//
//        }
//    }

}
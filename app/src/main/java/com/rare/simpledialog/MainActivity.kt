package com.rare.simpledialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var btndelete : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btndelete = findViewById(R.id.btndelete)
        val dialog = AlertDialog.Builder(this)

        btndelete.setOnClickListener{

            dialog.setTitle("Delete Alert!!")
            dialog.setMessage("Are you sure ")
            dialog.setPositiveButton("yes"){_,_ ->
                Toast.makeText(this, "Deleted", Toast.LENGTH_SHORT).show()

            }


            dialog.setNegativeButton("no"){ _,_ ->
                Toast.makeText(this, "operation cancel", Toast.LENGTH_SHORT).show()
            }
            dialog.setNeutralButton("Let"){_,_ ->
                Toast.makeText(this, "You have to think again", Toast.LENGTH_SHORT).show()

            }

            dialog.create().show()
        }


    }
}
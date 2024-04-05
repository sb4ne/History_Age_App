package com.example.historyageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//declare everything added onto the user interface
        val hsFigureBtn = findViewById<Button>(R.id.hsFigureBtn)
        val clearMeBtn = findViewById<Button>(R.id.clearMeBtn)
        val Heading = findViewById<TextView>(R.id.Heading)
        val editTextText = findViewById<EditText>(R.id.editTextText)
        val ViewText = findViewById<TextView>(R.id.ViewText)

//add code to make all buttons functional
         hsFigureBtn.setOnClickListener {
             ViewText.text = ""
         clearMeBtn.setOnClickListener {
             editTextText.text.clear()
               

//use if else statements to link users age to a historical figure
                val userAge = editTextText.text.toString().toIntOrNull()

                if (userAge == 21) {
                    ViewText.text =
                        "Catherine Howard, King Henry VIII's 5th wife, was beheaded at the age of 21"
                } else if (userAge == 22) {
                    ViewText.text =
                        "Robert Wadlow passed away at  the age of 22, due to the complications that came with being the tallest man in recorded history"
                } else if (userAge == 24) {
                    ViewText.text =
                        "Lee Harvey Oswald, the man responsible for the assasination of J.F. Kennedy, was assasinated on live TV at 24 years old. Ironic?"
                } else if (userAge == 27) {
                    ViewText.text =
                        "At only 27 years old, arguably the most influential rock guitarist, Jimi Hendrix passed away"
                } else if (userAge == 32) {
                    ViewText.text =
                        "Alexander The Great died at the age of 32, after becoming the youngest conqueror in history"
                } else if (userAge == 36) {
                    ViewText.text =
                        "Diana Spencer or Princess Diana, famously known for working to end the stigma against HIV/AIDS, perished at the young age of 36"
                } else if (userAge == 37) {
                    ViewText.text =
                        "The world renowned painter Vincent Van Gogh passed away at 37 years old......But you didn't HEAR that from me ;) Get it? "
                } else if (userAge == 40) {
                    ViewText.text =
                        " One of America's most celebrated writers, Edgar Allen Poe, died at the age of 40. (Some say he was the creepiest too)"
                } else if (userAge == 46) {
                    ViewText.text =
                        "John F. Kennedy, a former president of the USA was assassinated at 46 years old"
                } else if (userAge == 50) {
                    ViewText.text =
                        "Sir Humphry Davy passed away at 50 years old, after discovering various elements, such as sodium. Without him we wouldn't have Salt and Vinegar chips"
                } else if (userAge == 99) {
                    ViewText.text =
                        "Prince Phillip, husband of Queen Elizabeth II died at the age of 99 years old"
                }
            }
        }
    }
    }




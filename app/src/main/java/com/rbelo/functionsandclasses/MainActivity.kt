package com.rbelo.functionsandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

/*    fun helloWorld(view: View)
    {
    textViewString
    }*/

   fun makeSimpsons(view: View) {

       val simpson = Simpson(nameText.text.toString(), Integer.parseInt(ageText.text.toString()), textJob.text.toString())
       textViewString.text = "Name: " + simpson.name + "Age: " + simpson.age + "Job: " + simpson.job
    }

}
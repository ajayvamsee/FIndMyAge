package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text
import java.util.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etDOB:EditText=findViewById<EditText>(R.id.etDOB)
        var button:Button=findViewById<Button>(R.id.button)
        var textView:TextView=findViewById<TextView>(R.id.tvAge)




        

        button?.setOnClickListener(){
          var datebv=Integer.parseInt(etDOB.text.toString())
            var currentYear=Calendar.getInstance().get(Calendar.YEAR)

            var userAge=currentYear-datebv

            textView.text="The user is age is $userAge Years"

            // calucate


        }
    }
}
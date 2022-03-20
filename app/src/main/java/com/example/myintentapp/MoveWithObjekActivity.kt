package com.example.myintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MoveWithObjekActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_PERSON = "extra_person"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_objek)

        val tvObject: TextView = findViewById(R.id.tv_objek_received)
        val person = intent.getParcelableExtra<Person>(EXTRA_PERSON) as Person
        val text = "Name : ${person.Name.toString()}, \nEmail : ${person.Email}, \nAge : ${person.Age}, \nLocation : ${person.City}, \nHp : ${person.Hp}"
        tvObject.text = text
    }
}
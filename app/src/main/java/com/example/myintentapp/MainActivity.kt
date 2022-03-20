package com.example.myintentapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.lang.annotation.Native

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMoveActivity: Button = findViewById(R.id.btn_move_activity)
        btnMoveActivity.setOnClickListener(this)

        val btnMoveWithDataActivity: Button = findViewById(R.id.btn_activity_data)
        btnMoveWithDataActivity.setOnClickListener(this)

        val btnMoveWithObjek: Button = findViewById(R.id.btn_move_activity_objek)
        btnMoveWithObjek.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_move_activity -> {
                val moveIntent = Intent(this@MainActivity, MoveActivity::class.java)
                startActivity(moveIntent)

            }

            R.id.btn_activity_data -> {
                val moveWithDataIntent = Intent(this@MainActivity, MoveWithDataActivity::class.java)
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Native Programing")
                moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 20)
                startActivity(moveWithDataIntent)
            }

            R.id.btn_move_activity_objek -> {
                val person = Person(
                    "Native Mobile Programing",
                    20,
                    "native@gmail.com",
                    "Pekanbaru",
                    628715317
                )
                val moveWithObjekIntent = Intent(this@MainActivity, MoveWithObjekActivity::class.java)
                moveWithObjekIntent.putExtra(MoveWithObjekActivity.EXTRA_PERSON, person)
                startActivity(moveWithObjekIntent)
            }
        }
    }
}
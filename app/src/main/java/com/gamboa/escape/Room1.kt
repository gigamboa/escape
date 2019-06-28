package com.gamboa.escape

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_room1.*

object GlobalVariable {
    var keys = false
}

class Room1 : AppCompatActivity() {

    fun changeActivity(activity: Activity){
        val intent = Intent (this, activity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room1)

        btn_main.setOnClickListener {
            if ( GlobalVariable.keys == true){
                changeActivity(MainActivity())
            } else {
                Toast.makeText(this, "You don't have the keys to this room", Toast.LENGTH_SHORT).show()
            }
        }

        btn_room2.setOnClickListener {
             GlobalVariable.keys = true
            changeActivity(Room2())
        }

    }
}

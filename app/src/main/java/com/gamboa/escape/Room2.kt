package com.gamboa.escape

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_room2.*

class Room2 : AppCompatActivity() {

    fun changeActivity(activity: Activity){
        val intent = Intent (this, activity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room2)
        Toast.makeText(this, "You found some keys", Toast.LENGTH_SHORT).show()

        btn_room1.setOnClickListener {
            changeActivity(Room1())
        }
    }
}

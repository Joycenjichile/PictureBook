package dev.joy.PictureBook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic5Activity2 : AppCompatActivity() {
    lateinit var btnBack6:Button
    lateinit var btnNext6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic52)
        btnBack6=findViewById(R.id.btnBack6)
        btnBack6.setOnClickListener {
            val intent= Intent(this,pic4Activity2::class.java)
            startActivity(intent)
        }
        btnNext6=findViewById(R.id.btnNext6)
        btnNext6.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }

        }


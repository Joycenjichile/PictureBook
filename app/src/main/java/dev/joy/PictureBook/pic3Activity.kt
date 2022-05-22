package dev.joy.PictureBook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic3Activity : AppCompatActivity() {
    lateinit var btnBack4:Button
    lateinit var btnNext4:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic3)
        btnBack4=findViewById(R.id.btnBack4)
        btnBack4.setOnClickListener {
            val intent= Intent(this,pic2Activity::class.java)
            startActivity(intent)
        }
        btnNext4=findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent= Intent(this,pic4Activity2::class.java)
            startActivity(intent)
        }

    }
    }

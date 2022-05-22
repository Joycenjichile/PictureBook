package dev.joy.PictureBook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pic4Activity2 : AppCompatActivity() {
    lateinit var btnBack5:Button
    lateinit var btnNext5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pic42)
        btnBack5=findViewById(R.id.btnBack5)
        btnBack5.setOnClickListener {
            val intent= Intent(this,pic3Activity::class.java)
            startActivity(intent)
        }
        btnNext5=findViewById(R.id.btnNext5)
        btnNext5.setOnClickListener {
            val intent= Intent(this,pic5Activity2::class.java)
            startActivity(intent)
        }

    }
}



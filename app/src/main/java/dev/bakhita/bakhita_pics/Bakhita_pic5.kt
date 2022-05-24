package dev.bakhita.bakhita_pics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bakhita_pic5 : AppCompatActivity() {
    lateinit var btnPrevHouse:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakhita_pic5)
        btnPrevHouse=findViewById(R.id.btnPrevHouse)
        btnPrevHouse.setOnClickListener {
            val intent = Intent(this,Bakhita_pic4::class.java)
            startActivity(intent)
        }
    }
}
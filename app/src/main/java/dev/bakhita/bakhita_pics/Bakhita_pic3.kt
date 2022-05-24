package dev.bakhita.bakhita_pics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bakhita_pic3 : AppCompatActivity() {
    lateinit var btnPrevTrev:Button
    lateinit var btnTrevor:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakhita_pic3)
        btnPrevTrev=findViewById(R.id.btnPrevTrev)
        btnPrevTrev.setOnClickListener {
            val intent=Intent(this,Bakhita_pics2::class.java)
            startActivity(intent)
        }

        btnTrevor=findViewById(R.id.btnTrevor)
        btnTrevor.setOnClickListener {
            val intent=Intent(this,Bakhita_pic4::class.java)
            startActivity(intent)
        }
    }
}
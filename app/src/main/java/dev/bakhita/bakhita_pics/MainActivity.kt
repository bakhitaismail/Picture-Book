package dev.bakhita.bakhita_pics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnMakeup:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMakeup=findViewById(R.id.btnMakeup)
        btnMakeup.setOnClickListener {
            val intent=Intent(this,Bakhita_pics2::class.java)
            startActivity(intent)
        }
    }
}
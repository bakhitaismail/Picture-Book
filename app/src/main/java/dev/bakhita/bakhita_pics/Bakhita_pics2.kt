package dev.bakhita.bakhita_pics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bakhita_pics2 : AppCompatActivity() {
    lateinit var btnPrevRash:Button
    lateinit var btnRashford:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakhita_pics2)
        btnPrevRash=findViewById(R.id.btnPrevRash)
        btnPrevRash.setOnClickListener {
            val intent =Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        btnRashford=findViewById(R.id.btnRashford)
        btnRashford.setOnClickListener {
            val intent = Intent(this, Bakhita_pic3::class.java)
            startActivity(intent)
        }





    }
}
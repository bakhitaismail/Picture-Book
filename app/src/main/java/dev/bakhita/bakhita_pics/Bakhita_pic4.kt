package dev.bakhita.bakhita_pics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Bakhita_pic4 : AppCompatActivity() {
    lateinit var btnPrevJeep:Button
    lateinit var btnJeep:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakhita_pic4)
        btnPrevJeep=findViewById(R.id.btnPrevJeep)
        btnPrevJeep.setOnClickListener {
            val intent = Intent(this,Bakhita_pic3::class.java)
            startActivity(intent)
        }
        btnJeep=findViewById(R.id.btnJeep)
        btnJeep.setOnClickListener {
            val intent =Intent(this,Bakhita_pic5::class.java)
            startActivity(intent)
        }
    }
}
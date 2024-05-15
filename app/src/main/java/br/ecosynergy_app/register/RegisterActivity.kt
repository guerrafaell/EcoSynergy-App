package br.ecosynergy_app.register

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.ecosynergy_app.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnregister: Button = findViewById(R.id.btnregister)

        btnregister.setOnClickListener(){
            val intent = Intent(this, RegisterActivity2::class.java)
            startActivity(intent)
        }
    }
}
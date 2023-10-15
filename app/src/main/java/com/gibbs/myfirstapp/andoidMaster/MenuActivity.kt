package com.gibbs.myfirstapp.andoidMaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.gibbs.myfirstapp.R
import com.gibbs.myfirstapp.andoidMaster.firstApp.FirstAppActivity
import com.gibbs.myfirstapp.andoidMaster.imcCalulator.ImcCalculatorActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludarAPP = findViewById<Button>(R.id.btnSaludoApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        btnSaludarAPP.setOnClickListener{navigateToSaludarApp() }
        btnIMCApp.setOnClickListener{ navigateToIMCApp()}

    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludarApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
}
package com.gibbs.myfirstapp.andoidMaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gibbs.myfirstapp.R
import com.gibbs.myfirstapp.andoidMaster.firstApp.FirstAppActivity
import com.gibbs.myfirstapp.andoidMaster.imcCalulator.ImcCalculatorActivity
import com.gibbs.myfirstapp.andoidMaster.superheroapp.SuperHeroListActivity
import com.gibbs.myfirstapp.andoidMaster.todoApp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnSaludarAPP = findViewById<Button>(R.id.btnSaludoApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnSuperHero = findViewById<Button>(R.id.btnSuperHero)


        btnSaludarAPP.setOnClickListener{navigateToSaludarApp() }
        btnIMCApp.setOnClickListener{ navigateToIMCApp()}
        btnTODO.setOnClickListener { navigateToTODOAPP() }
        btnSuperHero.setOnClickListener { navigateToSuperHeroApp() }

    }


    private fun navigateToTODOAPP() {
        val intent = Intent(this, TodoActivity::class.java )
        startActivity(intent)
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludarApp(){
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }
    private fun navigateToSuperHeroApp() {
        val intent = Intent(this, SuperHeroListActivity::class.java)
        startActivity(intent)
    }
}

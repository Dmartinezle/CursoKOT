package com.dmartinez.holamundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dmartinez.holamundo.others.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Variables().showcases()
        Nulleable()
        Operadores().ShowCases()
        controlFlow().showCases()
        accsMod().showcases()
    }
}


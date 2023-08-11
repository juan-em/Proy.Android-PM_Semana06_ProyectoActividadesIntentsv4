package com.miempresa.proyectoactividadesintentsv4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lblestado.setText("Estas en el metodo onCreate")
        Toast.makeText(this, "Estas en el metodo onCreate", Toast.LENGTH_SHORT).show()
    }
    override fun onStart() {
        super.onStart()
        lblestado.setText("Estas en el metodo onStart")
        Toast.makeText(this, "Estas en en el metodo onStart", Toast.LENGTH_SHORT).show()
    }
    override fun onResume() {
        super.onResume()
        lblestado.setText("Estas en el metodo onResume")
        Toast.makeText(this, "Estas en en el metodo onResume", Toast.LENGTH_SHORT).show()
    }
    override fun onPause() {
        super.onPause()
        lblestado.setText("Estas en el metodo onpause")
        Toast.makeText(this, "Estas en en el metodo on Pause", Toast.LENGTH_SHORT).show()
    }
    override fun onStop() {
        super.onStop()
        lblestado.setText("Estas en el metodo onStop")
        Toast.makeText(this, "Estas en en el metodo onStop", Toast.LENGTH_SHORT).show()
    }
    override fun onRestart() {
        super.onRestart()
        lblestado.setText("Estas en el metodo onRestart")
        Toast.makeText(this, "Estas en en el metodo onRestart", Toast.LENGTH_SHORT).show()
    }
    override fun onDestroy() {
        super.onDestroy()
        lblestado.setText("Estas en el metodo onDestroy")
        Toast.makeText(this, "Estas en en el metodo onDestroy", Toast.LENGTH_SHORT).show()
    }
}
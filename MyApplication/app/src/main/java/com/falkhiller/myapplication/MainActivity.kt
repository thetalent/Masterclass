package com.falkhiller.myapplication

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.browse

class MainActivity : AppCompatActivity() {

    fun mybrowse(b: View){
        when(b.id) {
            R.id.button -> browse("https://abfahrten.hvv.de/65c9c830-1d06-448d-9011-16e598439141")
            R.id.button2 ->browse ("https://abfahrten.hvv.de/2d4c8d1a-c626-4c7f-9c43-32bd1ff93157")
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
           }

}

package com.example.dortislem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
   fun toplam(view: View){
       var x= sayi1.text.toString().toIntOrNull()
       var y= sayi2.text.toString().toIntOrNull()
       if(x==null || y==null)
       {
           sonucText.text= "Sayi Giriniz"
       }
       else
       {
           var sonuc = x+y
           sonucText.text="Sonuç:${sonuc}"
       }

    }
   fun carpmafonk(view: View){
       var x= sayi1.text.toString().toIntOrNull()
       var y= sayi2.text.toString().toIntOrNull()
       if(x==null || y==null)
       {
           sonucText.text= "Sayi Giriniz"
       }
       else
       {
           var sonuc = x*y
           sonucText.text="Sonuç:${sonuc}"
       }

    }
    fun cikarmafonk(view: View)
    {
        var x= sayi1.text.toString().toIntOrNull()
        var y= sayi2.text.toString().toIntOrNull()
        if(x==null || y==null)
        {
            sonucText.text= "Sayi Giriniz"
        }
        else
        {
            var sonuc = x-y
            sonucText.text="Sonuç:${sonuc}"
        }

    }
    fun bolmefonk(view: View){
        var x= sayi1.text.toString().toDoubleOrNull()
        var y= sayi2.text.toString().toDoubleOrNull()
        if(x==null || y==null)
        {
            sonucText.text= "Sayi Giriniz"
        }
        else
        {
            var sonuc = x/y
            sonucText.text="Sonuç:${sonuc}"
        }
    }

}
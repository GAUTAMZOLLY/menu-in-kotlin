 package com.example.navigationdrawer

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.navigationdrawer.databinding.ActivityMainBinding

 class MainActivity : AppCompatActivity() {
      private  lateinit var   binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding  =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

     override fun onCreateOptionsMenu(menu: Menu?): Boolean {
           menuInflater.inflate(R.menu.items , menu)
          return  true
     }

     override fun onOptionsItemSelected(item: MenuItem): Boolean {
           when(item.itemId)  {
                 R.id.setting_Id   ->  {
                       Toast.makeText(this ,  "Setting Button is Working" , Toast.LENGTH_SHORT).show()
                 }

               R.id.help_Id ->  {
                   Toast.makeText(this  ,  "Help  Button  is Working" , Toast.LENGTH_SHORT).show()
               }

               R.id.about_Id  ->  {
                   Toast.makeText(this ,  "About button  is Working" , Toast.LENGTH_SHORT).show()
               }


           }

         return   true
     }
}

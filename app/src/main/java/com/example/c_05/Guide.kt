package com.example.c_05

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class Guide : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide)
//        nav_view.setNavigationItemSelectedListener(this)
    }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//
//        when(item.itemId){
//            R.id.c_1 -> Toast.makeText(this, "Id cat_1", Toast.LENGTH_SHORT).show()
//            R.id.c_2 -> Toast.makeText(this, "Id cat_2", Toast.LENGTH_SHORT).show()
//            R.id.c_3 -> Toast.makeText(this, "Id cat_3", Toast.LENGTH_SHORT).show()
//            R.id.c_4 -> Toast.makeText(this, "Id cat_4", Toast.LENGTH_SHORT).show()
//        }
//
//        return true
//    }
}
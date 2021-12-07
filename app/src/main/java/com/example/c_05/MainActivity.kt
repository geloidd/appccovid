package com.example.c_05

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.c_1 -> Toast.makeText(this, "Id cat_1", Toast.LENGTH_SHORT).show()
                R.id.c_2 -> Toast.makeText(this, "Id cat_2", Toast.LENGTH_SHORT).show()
//                R.id.c_2 -> startActivity(Intent(this, WeekViewActivity::class.java))
                R.id.c_3 -> Toast.makeText(this, "Id cat_3", Toast.LENGTH_SHORT).show()
                R.id.c_4 -> finish()

            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}
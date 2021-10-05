package com.example.appbar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.app_bar_menu, menu)
        return true
    }
    //this function trigger alert dialog for appbar icons
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val filterDialog = AlertDialog.Builder(this)
//            .setTitle(getString(R.string.text_filter_title))
            .setPositiveButton("確定") { _, _ -> Toast.makeText(this, "篩選成功", Toast.LENGTH_SHORT).show() }
            .setNegativeButton("取消") { _, _ -> Toast.makeText(this, "已取消篩選", Toast.LENGTH_SHORT).show() }
            .setView(R.layout.filter_dialog)
            .create()
        when (item.itemId) {
            R.id.miFilter -> filterDialog.show()

        }
        return true
    }

}


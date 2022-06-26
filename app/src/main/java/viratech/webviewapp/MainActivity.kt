package viratech.webviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun klik(view: View) {


        val intent = Intent(this,HalamanWeb::class.java)
        startActivity(intent)



    }

    fun klik2(view: View) {
        val intent2 = Intent(this,HalamanYasinOfline::class.java)
        startActivity(intent2)

    }
    fun klik3(view: View) {
        val intent3 = Intent(this,HalamanAbout ::class.java)
        startActivity(intent3)


    }


}
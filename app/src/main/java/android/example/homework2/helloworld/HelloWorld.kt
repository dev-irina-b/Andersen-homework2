package android.example.homework2.helloworld

import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HelloWorld : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        Log.d("MainActivity", "Hello World")

        //Coding challenge
        try {
            throw Exception()
        } catch (e: Exception) {
            Log.e("MainActivity", "Test Exception", e)
        }

        //Homework
        Log.v("MainActivity", "Verbose")
        Log.d("MainActivity", "Debug")
        Log.i("MainActivity", "Info")
        Log.w("MainActivity", "Warning")
        Log.e("MainActivity", "Error")
    }
}
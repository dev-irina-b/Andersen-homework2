package android.example.homework2.twoactivities

import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeworkSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homewok_second)
        val count = intent.getStringExtra(HomeWorkActivity.EXTRA_COUNT)
        val textView = findViewById<TextView>(R.id.count)
        textView.text = count

    }

}
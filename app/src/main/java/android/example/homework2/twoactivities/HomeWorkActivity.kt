package android.example.homework2.twoactivities

import android.content.Intent
import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class HomeWorkActivity : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null

    companion object {
        const val EXTRA_COUNT = "com.example.android.twoactivities.extra.MESSAGE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_work)
        mShowCount = findViewById(R.id.show_count)
    }

    fun countUp(view: View) {
        ++mCount
        mShowCount?.text = mCount.toString()
    }

    fun launchSecondActivity(view: View) {
        val intent = Intent(this, HomeworkSecondActivity::class.java)
        intent.putExtra(EXTRA_COUNT, mCount.toString())
        startActivity(intent)
    }
}
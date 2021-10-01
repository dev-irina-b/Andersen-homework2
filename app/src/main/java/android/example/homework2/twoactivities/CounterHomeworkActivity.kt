package android.example.homework2.twoactivities

import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class CounterHomeworkActivity : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_counter_homework)
        mShowCount = findViewById(R.id.countTextView)

        if (savedInstanceState != null) {
            mShowCount?.text = savedInstanceState.getString("counter")
        }
    }

    fun countUpNumber(view: View) {
        ++mCount
        mShowCount?.text = mCount.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("counter", mShowCount?.text.toString())
    }
}
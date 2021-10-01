package android.example.homework2.hellotoast

import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class HelloToastLinearLayout : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_toast_linear_layout)
        mShowCount = findViewById(R.id.show_count)
    }

    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {
        ++mCount
        mShowCount?.text = mCount.toString()
    }
}
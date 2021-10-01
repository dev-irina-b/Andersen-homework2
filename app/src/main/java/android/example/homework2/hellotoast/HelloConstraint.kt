package android.example.homework2.hellotoast

import android.example.homework2.R
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class HelloConstraint : AppCompatActivity() {
    private var mCount = 0
    private var mShowCount: TextView? = null
    private var zeroButton: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_constraint)
        mShowCount = findViewById(R.id.show_count)
        zeroButton = findViewById(R.id.button_zero)
    }
    fun showToast(view: View) {
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show()
    }
    fun countUp(view: View) {
        ++mCount
        mShowCount?.text = mCount.toString()
        zeroButton!!.setBackgroundColor(Color.GREEN)
        if(mCount %2 == 0) {
            view.setBackgroundColor(Color.BLUE)
        } else {
            view.setBackgroundColor(Color.RED)
        }
    }

    fun setToZero(view: View) {
        mCount = 0
        mShowCount?.text = mCount.toString()
        view.setBackgroundColor(Color.GRAY)
    }
}
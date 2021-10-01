package android.example.homework2.twoactivities

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.content.Intent
import android.example.homework2.R
import android.util.Log
import android.view.View
import android.widget.EditText


class SecondActivity : AppCompatActivity() {
    private var mReply: EditText? = null

    companion object {
        const val EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.text_message)
        textView.text = message
        mReply = findViewById(R.id.editText_second)
    }

    fun returnReply(view: View?) {
        val reply: String = mReply?.text.toString()
        val replyIntent = Intent()
        replyIntent.putExtra(EXTRA_REPLY, reply)
        setResult(RESULT_OK, replyIntent)
        finish()
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity.LOG_TAG, "onStart")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity.LOG_TAG, "onPause")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity.LOG_TAG, "onRestart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(MainActivity.LOG_TAG, "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity.LOG_TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity.LOG_TAG, "onDestroy")
    }
}
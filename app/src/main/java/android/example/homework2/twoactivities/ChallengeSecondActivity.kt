package android.example.homework2.twoactivities

import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ChallengeSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge_second)
        val textView = findViewById<TextView>(R.id.scrollText)

        when (intent.getStringExtra(ChallengeActivity.EXTRA_TEXT)) {
            "first" -> textView.setText(R.string.second_large_text)
            "second" -> textView.setText(R.string.article_text)
            "third" -> textView.setText(R.string.large_text)
        }
    }
}
package android.example.homework2.twoactivities

import android.example.homework2.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent




class ChallengeActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TEXT = "com.example.android.twoactivities.extra.MESSAGE"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)
    }

    fun launchFirst (view: View) {
        intent = Intent(this, ChallengeSecondActivity::class.java)
        intent.putExtra(EXTRA_TEXT, "first")
        startActivity(intent)
    }

    fun launchSecond (view: View) {
        intent = Intent(this, ChallengeSecondActivity::class.java)
        intent.putExtra(EXTRA_TEXT, "second")
        startActivity(intent)
    }

    fun launchThird (view: View) {
        intent = Intent(this, ChallengeSecondActivity::class.java)
        intent.putExtra(EXTRA_TEXT, "third")
        startActivity(intent)
    }
}
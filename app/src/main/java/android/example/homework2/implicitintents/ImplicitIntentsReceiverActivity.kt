package android.example.homework2.implicitintents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.net.Uri


class ImplicitIntentsReceiverActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(android.example.homework2.R.layout.activity_implicit_intents_receiver)
        val uri: Uri? = intent.data
        if (uri != null) {
            val uriString = (getString(android.example.homework2.R.string.uri_label) + uri.toString())
            val textView = findViewById<TextView>(android.example.homework2.R.id.text_uri_message)
            textView.text = uriString
        }
    }
}
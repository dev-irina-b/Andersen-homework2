package android.example.homework2.implicitintents

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.content.Intent
import android.example.homework2.R
import android.util.Log
import androidx.core.app.ShareCompat
import android.provider.MediaStore





class ImplicitIntentsActivity : AppCompatActivity() {
    private var mWebsiteEditText: EditText? = null
    private var mLocationEditText: EditText? = null
    private var mShareTextEditText: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intents)
        mWebsiteEditText = findViewById(R.id.website_edittext)
        mLocationEditText = findViewById(R.id.location_edittext)
        mShareTextEditText = findViewById(R.id.share_edittext)
    }

    fun openWebsite(view: View) {
        val url = mWebsiteEditText!!.text.toString()
        val webpage: Uri = Uri.parse(url)
        val intent = Intent(Intent.ACTION_VIEW, webpage)
        if(intent.resolveActivity(packageManager) != null ) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this!")
        }
    }

    fun openLocation(view: View) {
        val loc = mLocationEditText!!.text.toString()
        val addressUri = Uri.parse("geo:0,0?q=$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)
        if(intent.resolveActivity(packageManager) != null ) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent")
        }
    }

    fun shareText(view: View) {
        val txt = mShareTextEditText!!.text.toString()
        val mimeType = "text/plain"
        ShareCompat.IntentBuilder
            .from(this)
            .setType(mimeType)
            .setChooserTitle(R.string.share_text_with)
            .setText(txt)
            .startChooser()
    }

    fun takePicture(view: View) {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if(intent.resolveActivity(packageManager) != null ) {
            startActivity(intent)
        }
    }
}
package android.example.homework2.shoppingapp

import android.content.Intent
import android.example.homework2.R
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class ShoppingAppActivity : AppCompatActivity() {
    private val list = mutableListOf<TextView>()
    private var locationEditText: EditText? = null
    companion object {
        const val ITEM_REQUEST = 1
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_app)

        list.addAll(listOf(findViewById(R.id.textView0), findViewById(R.id.textView1), findViewById(R.id.textView2),
            findViewById(R.id.textView3), findViewById(R.id.textView4), findViewById(R.id.textView5),
            findViewById(R.id.textView6), findViewById(R.id.textView7), findViewById(R.id.textView8),
            findViewById(R.id.textView9)))

        if(savedInstanceState != null) {
            list.forEachIndexed { index, textView ->
                textView.text = savedInstanceState.getString("$index")
            }
        }
        locationEditText = findViewById(R.id.store_name_edittext)
    }

    fun openStoreLocation(view: View) {
        val loc = locationEditText!!.text.toString()
        val addressUri = Uri.parse("geo:0,0?q=$loc")
        val intent = Intent(Intent.ACTION_VIEW, addressUri)
        if(intent.resolveActivity(packageManager) != null ) {
            startActivity(intent)
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent")
        }
    }

    fun addItem (view: View) {
        val intent = Intent(this, ShoppingAppSecondActivity::class.java)
        startActivityForResult(intent, ITEM_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == ITEM_REQUEST) {
            if (resultCode == RESULT_OK) {
                val item: String? = data?.getStringExtra(ShoppingAppSecondActivity.EXTRA_REPLY_ITEM)
                list.first {
                    it.text.isEmpty()
                }.text = item
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        list.forEachIndexed { index, textView ->
            outState.putString("$index", textView.text.toString())
        }
    }
}
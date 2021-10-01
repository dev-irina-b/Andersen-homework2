package android.example.homework2.shoppingapp

import android.content.Intent
import android.example.homework2.R
import android.example.homework2.twoactivities.SecondActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ShoppingAppSecondActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_REPLY_ITEM = "com.example.android.twoactivities.extra.REPLYITEM"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_app_second)
    }

    fun addMilk(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_milk))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addRice(view: View?) {
        val intent =intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_rice))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addApples(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_apples))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addCheese(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_cheese))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addBread(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_bread))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addPotato(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_potato))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addCarrot(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_carrot))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addOnion(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_onion))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addTomato(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_tomato))
        setResult(RESULT_OK, intent)
        finish()
    }
    fun addBananas(view: View?) {
        val intent = intent.putExtra(EXTRA_REPLY_ITEM, resources.getString(R.string.button_bananas))
        setResult(RESULT_OK, intent)
        finish()
    }
}
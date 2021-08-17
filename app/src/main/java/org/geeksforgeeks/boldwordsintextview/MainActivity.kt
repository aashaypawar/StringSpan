package org.geeksforgeeks.boldwordsintextview

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.StyleSpan
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view)
        val mString = "GeeksforGeeks is a Computer Science portal for Geeks"
        val mSpannableString = SpannableString(mString)
        val mBoldSpan = StyleSpan(Typeface.BOLD)
        val mItalicSpan = StyleSpan(Typeface.ITALIC)
        val mBoldItalicSpan = StyleSpan(Typeface.BOLD_ITALIC)

        mSpannableString.setSpan(mBoldSpan, 0, 13, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mSpannableString.setSpan(mItalicSpan, 19, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)
        mSpannableString.setSpan(mBoldItalicSpan, 47, 52, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE)

        mTextView.text = mSpannableString
    }
}
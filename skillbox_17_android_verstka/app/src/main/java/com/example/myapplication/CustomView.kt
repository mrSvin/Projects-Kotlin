package com.example.myapplication

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.myapplication.databinding.CustomBinding


class CustomView
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {
    val bining = CustomBinding.inflate(LayoutInflater.from(context))
    val lp = ConstraintLayout.LayoutParams(
        ConstraintLayout.LayoutParams.MATCH_PARENT,
        ConstraintLayout.LayoutParams.MATCH_PARENT
    )

    init {
        addView(bining.root, lp)
    }

    fun setText(upText : String, downText: String) {
        bining.textUp.text = upText
        bining.textDown.text = downText
    }

}

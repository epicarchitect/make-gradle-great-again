package epicarchitect.makegradlegreatagain.hi

import android.content.Context
import android.widget.Toast
import epicarchitect.makegradlegreatagain.R

class Hello(private val context: Context) {
    fun hello() {
        Toast.makeText(context, R.string.super_text, Toast.LENGTH_SHORT).show()
    }
}

package epicarchitect.makegradlegreatagain

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import epicarchitect.makegradlegreatagain.hi.Hello

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Hello(this).hello()
    }
}
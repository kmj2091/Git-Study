package km.project.gitstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    var text = ""
    var textOrder = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        text= "test"
        textOrder ="OrderNum"
    }
}
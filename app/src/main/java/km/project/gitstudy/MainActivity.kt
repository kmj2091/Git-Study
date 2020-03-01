package km.project.gitstudy

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text= "test"
    }

    companion object {
        fun startActivity(activity : Activity){
            activity.startActivity(Intent(activity,MainActivity::class.java))
        }
    }
}

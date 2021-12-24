package BaseData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.loginactivity.R
import fragment.CanceledFragment

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //for replace fragment
    public fun replaceFragmentMethod(fragment:Fragment)
    {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }
}
package profileActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginactivity.HomeActivity
import com.example.loginactivity.R
import com.example.loginactivity.databinding.ActivityVerifyBinding

class VerifyActivity : AppCompatActivity() {
    private lateinit var binding:ActivityVerifyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityVerifyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnVerifyVerify.setOnClickListener(View.OnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
            Toast.makeText(this,"Thanks",Toast.LENGTH_SHORT).show()
        })
    }
}
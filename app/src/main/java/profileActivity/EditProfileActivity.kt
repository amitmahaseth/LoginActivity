package profileActivity

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginactivity.HomeActivity
import com.example.loginactivity.R
import com.example.loginactivity.databinding.ActivityEditProfileBinding

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEditProfileSubmit.setOnClickListener(View.OnClickListener {
            val intent=Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        })
    }
}
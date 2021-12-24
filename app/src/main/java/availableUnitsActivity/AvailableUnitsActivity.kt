package availableUnitsActivity;

import model.ClickListener
import adapter.HomeAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.loginactivity.HomeActivity
import com.example.loginactivity.databinding.ActivityAvailableUnitsBinding


 class AvailableUnitsActivity : AppCompatActivity(), ClickListener {
  private lateinit var  binding: ActivityAvailableUnitsBinding
  private val  items:ArrayList<String>? = null
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityAvailableUnitsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager=LinearLayoutManager(this)
        val adapter=HomeAdapter(items,this)
        binding.recycler.adapter=adapter

        binding.imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        })

    }

     override fun onClickListener() {
         val intent=Intent(this,AvailableUnitsDetail::class.java)
         startActivity(intent)
         finish()
         Toast.makeText(this, "OKay Guys!", Toast.LENGTH_SHORT).show()

     }

 }
package fragment

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.loginactivity.R
import com.example.loginactivity.databinding.FragmentCanceledBinding

class CanceledFragment : Fragment() {

    private lateinit var binding: FragmentCanceledBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)


    }

    private fun selectableChat() {
        binding.btnCancelRequest.setBackgroundColor(Color.WHITE)
        binding.btnChat.setBackgroundResource(R.drawable.btn_blue_back)
        binding.btnChat.setTextColor(Color.WHITE)
        binding.btnCancelRequest.setTextColor(Color.BLACK)
        binding.btnCancelRequest.setBackgroundResource(R.drawable.btn_round_eng)
    }

    private fun selectableCancelRequest() {
        binding.btnChat.setBackgroundColor(Color.WHITE)
        binding.btnCancelRequest.setBackgroundResource(R.drawable.btn_blue_back)
        binding.btnCancelRequest.setTextColor(Color.WHITE)
        binding.btnChat.setTextColor(Color.BLACK)
        binding.btnChat.setBackgroundResource(R.drawable.btn_round_eng)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding= FragmentCanceledBinding.inflate(layoutInflater)
        selectableChat()
        binding.btnChat.setOnClickListener(View.OnClickListener {
            selectableChat()

        })
        binding.btnCancelRequest.setOnClickListener(View.OnClickListener {
            selectableCancelRequest()
        })
        return binding.root
    }


    }

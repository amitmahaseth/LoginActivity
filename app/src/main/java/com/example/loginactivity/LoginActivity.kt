package com.example.loginactivity;

import com.example.loginactivity.BaseData.BaseActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast

import com.example.loginactivity.databinding.ActivityLoginBinding;
import com.google.firebase.auth.FirebaseAuth

class LoginActivity:BaseActivity() {
    private lateinit var  binding:ActivityLoginBinding
    private lateinit var firebaseAuth: FirebaseAuth
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding= ActivityLoginBinding.inflate(layoutInflater)
         setContentView(binding.root)
         firebaseAuth=FirebaseAuth.getInstance()

        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
                startActivity(intent)
                finish()
        }

         binding.linearTop.setOnClickListener {
             closeKeyBoard()
         }

        binding.btnLogin.setOnClickListener {
                if ( login()){
                    showProgressDialog()
                    closeKeyBoard()
                    firebaseAuth.signInWithEmailAndPassword(binding.etEmailPhone.text.toString().trim(),
                            binding.etPass.text.toString().trim())
                    .addOnCompleteListener {
                        hideProgressDialog()
                        if (it.isSuccessful){
                            val  intent= Intent(this,PaymentsActivity::class.java)
                            startActivity(intent)
                            finish()
                            Toast.makeText(this,"Thanks For Login",Toast.LENGTH_SHORT).show()

                        }
                        else{
                            Toast.makeText(this,"Email and Password Can't be Created", Toast.LENGTH_SHORT).show()
                        }
                }

            }

        }
    }
    private fun login():Boolean{
        val email:String=binding.etEmailPhone.text.toString().trim()
        val password:String=binding.etPass.text.toString().trim()

         if (email.isBlank() || password.isBlank()){
            Toast.makeText(this,"Email and Password Can't be Blank",Toast.LENGTH_SHORT).show()
            return false
        }else{
          return true
        }
    }


}
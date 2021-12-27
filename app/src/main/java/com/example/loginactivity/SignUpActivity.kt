package com.example.loginactivity;
import BaseData.BaseActivity
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast
import com.example.loginactivity.databinding.ActivitySignUpBinding;
import com.google.firebase.auth.FirebaseAuth


class SignUpActivity : BaseActivity() {

    private lateinit var binding: ActivitySignUpBinding
    private lateinit var firebaseAuth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        firebaseAuth = FirebaseAuth.getInstance()

        binding.btnNext.setOnClickListener(View.OnClickListener() {

            if (SignUpUser()) {
                showProgressDialog()
                firebaseAuth.createUserWithEmailAndPassword(binding.edtEmail.text.toString().trim(), binding.edtPass.text.toString().trim()).addOnCompleteListener {
                    hideProgressDialog()
                    closeKeyBoard()
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Successful SignUp", Toast.LENGTH_SHORT).show()
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this, "Email and Password Can't be Blank", Toast.LENGTH_SHORT).show()

                    }

                }
            }

        })
        binding.tvLogin.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        })

        binding.constraintsTop.setOnClickListener {
            closeKeyBoard()
        }
    }

    private fun SignUpUser(): Boolean {
        val email: String = binding.edtEmail.text.toString().trim()
        val password: String = binding.edtPass.text.toString().trim()
        val firstName:String=binding.edtFirst.text.toString().trim()
        val lastName:String=binding.edtLast.text.toString().trim()
        val phoneNumber:String=binding.edtPhone.text.toString().trim()


        if (firstName.isBlank()){
            binding.edtFirst.error="Enter Your First Name"
            return false
        }else
            if (lastName.isBlank()){
                binding.edtLast.error="Enter Your Last Name"
                return false
            }else
        if (email.isBlank()) {
            Toast.makeText(this, "Enter your mail", Toast.LENGTH_SHORT).show()
            return false
        } else
            if (!(isEmailValid(email))) {
                Toast.makeText(this,"Your Email is Not Valid",Toast.LENGTH_SHORT).show()
               return false
            } else

                if (phoneNumber.isBlank()){
                    binding.edtPhone.error="Enter your Phone Number"
                    return false
                }else

                if (password.isBlank()) {
                    Toast.makeText(this, "Enter your Password", Toast.LENGTH_SHORT).show()
                    return false
                } else
                    if (binding.edtPass.text.toString().trim().length < 6) {
                        binding.edtPass.error = "password minimum contain 6 character"
                        binding.edtPass.requestFocus()
                        return false
                    } else {
                        return true
                    }
    }
    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }
}
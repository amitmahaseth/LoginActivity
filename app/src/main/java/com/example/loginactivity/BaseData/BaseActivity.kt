package com.example.loginactivity.BaseData

import android.app.ProgressDialog
import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import android.view.inputmethod.InputMethodManager
import androidx.fragment.app.Fragment
import com.example.loginactivity.R

open class BaseActivity : AppCompatActivity() {
    private lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    //for replace com.example.loginactivity.fragment
    public fun replaceFragmentMethod(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout, fragment).commit()
    }

    fun showProgressDialog() {
         progressDialog = ProgressDialog(this)
        progressDialog.setTitle("Please Wait")
        progressDialog.setMessage("Application is loading")
        progressDialog.show()
    }
    fun hideProgressDialog()
    {
        if(progressDialog!=null)
        {
            progressDialog.dismiss()
        }
    }

    fun closeKeyBoard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

   fun isLoggedIn(): Boolean {
       var preferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)
        //The false represents the default value, if the variable is not stored
        return preferences.getBoolean("isLoggedIn", false)
    }

    fun saveLoggedIn(value: Boolean) {
        var preferences = getSharedPreferences("loginPrefs", Context.MODE_PRIVATE)
        var editor = preferences.edit()
        editor.putBoolean("isLoggedIn", value)
        editor.commit()

}}
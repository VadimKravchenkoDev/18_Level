package com.zmei.a18_level

import Constants.constansMain
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.zmei.a18_level.databinding.ActivitySecondNewBinding

class SecondActivityNew : AppCompatActivity() {
    lateinit var binding: ActivitySecondNewBinding
    private var signState = "empty"
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondNewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        signState = intent.getStringExtra(constansMain.SIGN_STATE)!!
        if (signState == constansMain.SIGN_IN_STATE){
            binding.buttonAva.visibility = View.INVISIBLE
            binding.edName.visibility = View.GONE
            binding.edName2.visibility = View.GONE
            binding.edName3.visibility = View.GONE
        }}

    fun onClickDone (view: View){
        if (signState == constansMain.SIGN_IN_STATE){

        }}

    fun onClickAvatar (view: View) {
        binding.imageView.visibility = View.VISIBLE

    }
}
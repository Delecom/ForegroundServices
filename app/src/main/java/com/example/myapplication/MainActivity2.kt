package com.example.myapplication

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.databinding.ActivityMain2Binding
import com.google.flatbuffers.Constants

class MainActivity2 : AppCompatActivity(), View.OnClickListener  {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        actionBar?.hide()

        binding.startServices.setOnClickListener(this)
        binding.stopServices.setOnClickListener(this)

    }
 override fun onClick(v: View?) {

        if (v == binding.startServices){
            startService(Intent(this,ForegroundService::class.java))
        }else if (v == binding.stopServices){

            stopService(Intent(this,ForegroundService::class.java))
        }
    }






}

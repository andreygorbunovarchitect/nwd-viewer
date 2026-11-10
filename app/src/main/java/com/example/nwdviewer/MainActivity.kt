package com.example.nwdviewer

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        // Принудительно открываем ссылку в системном браузере (Chrome / Яндекс и т.д.)
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://viewer.autodesk.com/"))
        startActivity(intent)
        
        // Закрываем пустую активность приложения, чтобы не висел черный/белый экран
        finish()
    }
}

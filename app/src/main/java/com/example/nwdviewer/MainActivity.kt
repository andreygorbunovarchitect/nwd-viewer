package com.example.nwdviewer

import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val webView = WebView(this)
        setContentView(webView)

        // Открываем страницы прямо внутри приложения
        webView.webViewClient = WebViewClient()
        
        // Настройки для корректной загрузки Autodesk Viewer и кэша
        val settings = webView.settings
        settings.javaScriptEnabled = true
        settings.cacheMode = WebSettings.LOAD_DEFAULT
        settings.domStorageEnabled = true

        // Загрузка сайта
        webView.loadUrl("https://viewer.autodesk.com/")
    }
}

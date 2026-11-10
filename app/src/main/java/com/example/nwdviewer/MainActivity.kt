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

        // Оставляем стандартный клиент, чтобы WebView сам корректно обрабатывал все запросы и кэш
        webView.webViewClient = WebViewClient()
        
        // Включаем настройки для корректной работы Autodesk Viewer
        val settings = webView.settings
        settings.javaScriptEnabled = true
        settings.domStorageEnabled = true
        settings.cacheMode = WebSettings.LOAD_DEFAULT // Используем стандартный кэш
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        settings.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW

        // Загружаем сайт
        webView.loadUrl("https://viewer.autodesk.com/")
    }
}

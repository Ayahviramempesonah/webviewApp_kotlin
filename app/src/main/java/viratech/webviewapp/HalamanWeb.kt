package viratech.webviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import android.webkit.WebViewClient


class HalamanWeb : AppCompatActivity() {

    private val webView: WebView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_halaman_web)

     val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://alquran.cloud/surah/36")

        webView.settings.javaScriptEnabled = true



    }
}
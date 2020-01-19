package com.dev.hotspot

import android.content.Context
import android.util.Log
import android.webkit.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancelChildren
import java.util.concurrent.CyclicBarrier
import kotlin.coroutines.CoroutineContext


class WebViewHelper :CoroutineScope {
    private val job= SupervisorJob()
    override val coroutineContext: CoroutineContext
        get() = Dispatchers.Main+job
    lateinit var mWebView:WebView
    var result:String=""
    var countDownLatch: CyclicBarrier = CyclicBarrier(2)
    fun injectContext(context: Context){
        mWebView= WebView(context).apply {
            settings.javaScriptEnabled=true
        }


    }
    @Synchronized
    fun resetWebView(){
        mWebView.destroy()
    }
    @Synchronized
    fun execute(url:String,script:String="""
        (function(){
                var result='<html>'+document.getElementsByTagName('html')[0].innerHTML+'</html>';
                helper.returnResult(result);
        })()
    """.trimIndent()):String{

        mWebView.addJavascriptInterface(this,"helper")
             mWebView.webChromeClient=object :WebChromeClient(){
                 override fun onProgressChanged(view: WebView?, newProgress: Int) {
                     super.onProgressChanged(view, newProgress)
                     System.out.println(newProgress)
                     if (newProgress==100){
                         view?.evaluateJavascript(
                             script,
                             ValueCallback<String?> { html ->
                                 Log.d("HTML", html)
                                 // code here
                             })
                     }
                 }
             }
            mWebView.webViewClient=object:WebViewClient(){
                override fun onReceivedError(
                    view: WebView?,
                    request: WebResourceRequest?,
                    error: WebResourceError?
                ) {

                    super.onReceivedError(view, request, error)

                }
                override fun onPageFinished(view: WebView?, url: String?) {
                    super.onPageFinished(view, url)
                    view?.evaluateJavascript(
                        script,
                        ValueCallback<String?> { html ->
                            Log.d("HTML", html)
                            // code here
                        })
                }
            }
            mWebView.loadUrl(url)


        return result
    }
    @JavascriptInterface
    fun returnResult(result:String){
        this.result=result
        println(result)
    }

    fun  clear(){
        coroutineContext.cancelChildren()
    }
}


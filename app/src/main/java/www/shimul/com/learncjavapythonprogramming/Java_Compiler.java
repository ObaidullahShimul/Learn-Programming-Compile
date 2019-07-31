package www.shimul.com.learncjavapythonprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import static www.shimul.com.learncjavapythonprogramming.Java_MainActivity.webValue;

public class Java_Compiler extends AppCompatActivity {

    private WebView javaWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java__compiler);

        javaWebView = (WebView) findViewById(R.id.javaWebviewId);


        if (webValue==1) {


            setTitle("Java Compiler");
            //-------website load code start---------

            WebSettings webSettings = javaWebView.getSettings();
            // for website javascript enabed ar jonne
            webSettings.setJavaScriptEnabled(true);
            // --- browser a open na howr jonnee---
            javaWebView.setWebViewClient(new WebViewClient());
            //webView.loadUrl("https://www.tutorialspoint.com/compile_c_online.php");
            //webView.loadUrl("https://rextester.com/l/c_online_compiler_gcc");
            javaWebView.loadUrl("https://www.tutorialspoint.com/compile_java_online.php");

        }

        if (webValue==2) {

            setTitle("Python Compiler");
            //-------website load code start---------
            javaWebView = (WebView) findViewById(R.id.javaWebviewId);
            WebSettings webSettings = javaWebView.getSettings();
            // for website javascript enabed ar jonne
            webSettings.setJavaScriptEnabled(true);
            // --- browser a open na howr jonnee---
            javaWebView.setWebViewClient(new WebViewClient());
            //webView.loadUrl("https://www.tutorialspoint.com/compile_c_online.php");
            //webView.loadUrl("https://rextester.com/l/c_online_compiler_gcc");
            javaWebView.loadUrl("https://www.tutorialspoint.com/execute_python_online.php");


        }


        if (webValue==3) {

            setTitle("C  Compiler");
            //-------website load code start---------
            javaWebView = (WebView) findViewById(R.id.javaWebviewId);
            WebSettings webSettings = javaWebView.getSettings();
            // for website javascript enabed ar jonne
            webSettings.setJavaScriptEnabled(true);
            // --- browser a open na howr jonnee---
            javaWebView.setWebViewClient(new WebViewClient());
            //webView.loadUrl("https://www.tutorialspoint.com/compile_c_online.php");
            //webView.loadUrl("https://rextester.com/l/c_online_compiler_gcc");
            javaWebView.loadUrl("https://www.tutorialspoint.com/compile_c_online.php");

        }

        javaWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
                super.onReceivedError(view, request, error);
                javaWebView.loadUrl("file:///android_asset/nointernet.html");
            }
        });

        //-------back button
        //setSupportActionBar(toolbarInterviewq);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }

    //----back button--------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}

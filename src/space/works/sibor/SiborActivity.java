package space.works.sibor;


import com.appbrain.AppBrain;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class SiborActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		
		AppBrain.initApp(this);
	      
		final WebView w1 = (WebView) findViewById(R.id.webView1);
		w1.loadUrl("http://www.spacedotworks.com/sibor/index.html");
		final WebView w2 = (WebView) findViewById(R.id.webView2);
		w2.setWebViewClient(new WebViewClient());
		w2.loadUrl("http://www.spacedotworks.com/sibor/list.html");
		
		
		Button button1 = (Button) findViewById(R.id.button1);
	    button1.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	w1.loadUrl("http://www.spacedotworks.com/sibor/index.html");
	          
	            w2.loadUrl("http://www.spacedotworks.com/sibor/list.html");
	    		
	        }
	       
	    });
	    
	}
	  public void onBackPressed(){
	    	AppBrain.getAds().showInterstitial(this);
	        finish();
	    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sibor, menu);
		return true;
	}

}

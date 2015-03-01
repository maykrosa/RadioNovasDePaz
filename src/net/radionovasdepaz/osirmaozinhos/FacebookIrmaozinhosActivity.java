package net.radionovasdepaz.osirmaozinhos;

import net.radionovasdepaz.R;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class FacebookIrmaozinhosActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_facebook_osirmaozinhos);
		WebView wv = (WebView)findViewById(R.id.webView_facebook_irmaozinhos);
		WebSettings ws = wv.getSettings();
		ws.setJavaScriptEnabled(true);
		ws.setSupportZoom(false);
		wv.loadUrl("https://m.facebook.com/osirmaozinhosnp");
		
		
	}
	
	@Override
	public void onPause(){
		super.onPause();
		Log.v("LogMayk", "pause");
	}
	
	@Override
	public void onDestroy(){
		super.onDestroy();
		Log.v("LogMayk", "destruido");
	}

}

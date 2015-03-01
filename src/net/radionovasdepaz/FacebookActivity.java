package net.radionovasdepaz;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class FacebookActivity extends FragmentActivity{	
	
	@Override
	public void onCreate(Bundle savedIstate){
		super.onCreate(savedIstate);
		setContentView(R.layout.activity_facebook);
		WebView wv = (WebView)findViewById(R.id.webView1);
		WebSettings ws = wv.getSettings();
		ws.setJavaScriptEnabled(true);
		ws.setSupportZoom(false);
		wv.loadUrl("https://m.facebook.com/osirmaozinhosnp");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		
		switch (item.getItemId()) {
		case R.id.action_settings:
			Toast.makeText(this	, "so um teste e nada mais", Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}
}

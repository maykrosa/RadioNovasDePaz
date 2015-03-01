package net.radionovasdepaz.osirmaozinhos;

import net.radionovasdepaz.R;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;

public class IrmaozinhosActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_irmaozinhos);
		
	}

	
	//onCliks
	public void click_twitter_irmaozinhos(View view) {
		Intent i = new Intent(IrmaozinhosActivity.this, TwitterIrmaozinhosActivity.class);
		startActivity(i);
	}
	public void click_youtube_irmaozinhos(View view) {
		Intent i = new Intent(IrmaozinhosActivity.this, YoutubeIrmaozinhosActivity.class);
		startActivity(i);
	}
	public void click_facebook_irmaozinhos(View view) {
		Intent i = new Intent(IrmaozinhosActivity.this, FacebookIrmaozinhosActivity.class);
		startActivity(i);
	}
}

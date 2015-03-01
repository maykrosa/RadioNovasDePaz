package net.radionovasdepaz.osirmaozinhos;

import com.google.android.youtube.player.YouTubeIntents;

import net.radionovasdepaz.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;


public class YoutubeIrmaozinhosActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_youtube_osirmaozinhos);
		
		if(YouTubeIntents.canResolveOpenPlaylistIntent(this)){
			Intent i = YouTubeIntents.createOpenPlaylistIntent(this, "PLBA57K2L2RIJwTnx23uoNLFb_kXdnOMUN");
			startActivity(i);
		}else{
			Log.v("LogMayk","errrrrrrro");
		}

	}
	

}
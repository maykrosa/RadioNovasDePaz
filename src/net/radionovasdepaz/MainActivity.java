package net.radionovasdepaz;

import net.radionovasdepaz.osirmaozinhos.IrmaozinhosActivity;
import android.app.ActionBar;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends FragmentActivity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
		setContentView(R.layout.activity_main);
		ActionBar ab = getActionBar();
		ab.setDisplayHomeAsUpEnabled(true);
		ab.setTitle("");	
		
	
	}
	
	//onClicks
	
	public void linkRadio(View view){
		Toast.makeText(this,"link textView",Toast.LENGTH_SHORT).show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {		
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			Toast.makeText(this,"star",Toast.LENGTH_SHORT).show();
			Intent i = new Intent(MainActivity.this, FacebookActivity.class);
			startActivity(i);
		}
		if (id == R.id.radio) {
			Toast.makeText(this,"irmaozinho",Toast.LENGTH_SHORT).show();
			Intent i = new Intent(MainActivity.this, IrmaozinhosActivity.class);
			startActivity(i);
		}
		return super.onOptionsItemSelected(item);
	}
}

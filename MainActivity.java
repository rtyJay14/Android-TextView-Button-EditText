package com.example.encapsulationexercise;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

	Account ac = new Account();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final TextView tv = (TextView) findViewById(R.id.textView1);
		final EditText et = (EditText) findViewById(R.id.editText1);
		Button b = (Button) findViewById(R.id.button1);
		
		b.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
//				tv.setText(et.getText());
				
				Account acc = new Account();
				acc.setBalance(et.getText().toString());
				tv.setText(acc.getBalance());
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

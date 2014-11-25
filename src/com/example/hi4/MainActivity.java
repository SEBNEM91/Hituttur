package com.example.hi4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.hi4.Male;
import com.example.hi4.Person;

public class MainActivity extends Activity {
	
	private EditText namet, gendert;
	private TextView text;
	String str = "hi'";
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	namet = (EditText)findViewById(R.id.editText1);
	gendert = (EditText)findViewById(R.id.editText2);
	text = (TextView) findViewById(R.id.textView1);
	
	Button buton = (Button)findViewById(R.id.button1); 
			
	buton.setOnClickListener (new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			getPerson(namet.getText().toString(), gendert.getText().toString());		
		}
	}); 
	
	}	
		public Person getPerson(String name, String gender) {
			
			if (gender.equals("M"))
			return new Male(name, gender);
			
			else if(gender.equals("F"))
				return new Female(name, gender);
			
			else
			return null;
		}
}

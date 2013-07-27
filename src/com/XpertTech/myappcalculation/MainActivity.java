package com.XpertTech.myappcalculation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class MainActivity extends Activity {
	TextView txtResultView;
	Button  addButton;
	Button  multiplicationButton;
	Button subButton;
	Button divisionButton;
	EditText editValue1, editValue2;
	@Override
	protected void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		txtResultView = (TextView)findViewById(R.id.txtResult);
		//gets numbers from user
		editValue1 = (EditText)findViewById(R.id.editValue1);
		editValue2 = (EditText)findViewById(R.id.editValue2);
		addButton = (Button)findViewById(R.id.btnAdd);
		addButton.setOnClickListener(addListener);
		
		multiplicationButton = (Button)findViewById(R.id.btnMultiplication);
		multiplicationButton.setOnClickListener(multiplicationListener);
		
		subButton = (Button)findViewById(R.id.btnSubstraction);
		subButton.setOnClickListener(substractListener);
		
		divisionButton = (Button)findViewById(R.id.btnDivision);
		divisionButton.setOnClickListener(divisionListener);
	}

	private OnClickListener multiplicationListener = new OnClickListener()
	{
		public void onClick(View v)
		{                        
			int int1 = Integer.parseInt(editValue1.getText().toString());
			int int2 = Integer.parseInt(editValue2.getText().toString());
            int multiplication = int1 * int2;
			txtResultView.setText(String.valueOf(multiplication));
		}
	};
	
	private OnClickListener addListener = new OnClickListener()
	{
		public void onClick(View v)
		{                        
			int int1 = Integer.parseInt(editValue1.getText().toString());
			int int2 = Integer.parseInt(editValue2.getText().toString());
			int sum = int1 + int2;
			txtResultView.setText(String.valueOf(sum));
		}
	};
	
	private OnClickListener substractListener = new OnClickListener()
	{
		public void onClick(View v)
		{                        
			int int1 = Integer.parseInt(editValue1.getText().toString());
			int int2 = Integer.parseInt(editValue2.getText().toString());
			int sub = int1 - int2;
			txtResultView.setText(String.valueOf(sub));
		}
	};
	
	private OnClickListener divisionListener = new OnClickListener()
	{
		public void onClick(View v)
		{                        
			int int1 = Integer.parseInt(editValue1.getText().toString());
			int int2 = Integer.parseInt(editValue2.getText().toString());
			int div = int1 / int2;
			txtResultView.setText(String.valueOf(div));
		}
	};
};
		/*  @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }*/

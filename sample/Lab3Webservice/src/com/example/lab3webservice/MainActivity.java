package com.example.lab3webservice;

import com.example.lab3webservice.R.string;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	String url;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		   Button btn_create = (Button) findViewById(R.id.btncreate);
	       Button btn_insert = (Button) findViewById(R.id.btninsert);
	       Button btn_retrieve = (Button) findViewById(R.id.btnretrieve);
	       Button btn_delete = (Button) findViewById(R.id.btndelete);


	       btn_create.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		EditText insert_tablename = (EditText) findViewById(R.id.editText1);
        	   		EditText insert_column = (EditText) findViewById(R.id.editText2);
        	   		String tablename = insert_tablename.getText().toString();
        	   		String column_families = insert_column.getText().toString();
	        		url = "http://10.0.2.2:8080/HbaseWS/jaxrs/generic/hbaseCreate/"+tablename+"/"+column_families;
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });

	       btn_insert.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText insert_tablename = (EditText) findViewById(R.id.editText1);
	        	   		EditText insert_column = (EditText) findViewById(R.id.editText2);
	        	   		String tablename = insert_tablename.getText().toString();
	        	   		String column_families = insert_column.getText().toString();
	        		url = "http://10.0.2.2:8080/HbaseWS/jaxrs/generic/hbaseInsert/"+tablename+"/C:-Users-chaitanya-Desktop-sensorchai.txt/"+column_families;
	        	   		//url="http://10.0.2.2:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/chaiTable";
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });

	       btn_retrieve.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText retrieve = (EditText) findViewById(R.id.editText3);	        	   		
	        	   		String tablename = retrieve.getText().toString();
	        		url = "http://10.0.2.2:8080/HbaseWS/jaxrs/generic/hbaseRetrieveAll/"+tablename;
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });

	       btn_delete.setOnClickListener(new View.OnClickListener() {

	        	@Override
	            public void onClick(View v) {

	        		  EditText delete = (EditText) findViewById(R.id.editText3);	        	   		
	        	   		String tablename = delete.getText().toString();	        	   		
	        		url = "http://10.0.2.2:8080/HbaseWS/jaxrs/generic/hbasedeletel/"+tablename;	            	
	            	Intent intent = new Intent(Intent.ACTION_VIEW); 
	       			     intent.setData(Uri.parse(url));
	       			startActivity(intent);

	            }
	        });
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {		
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	

}

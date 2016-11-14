package com.example.listviewpractise;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ListView;

public class MainActivity extends Activity {

	private List<Furniture> furnitureList =new ArrayList<Furniture>();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initFurniture();
		furnitureAdapter adpter_1=new furnitureAdapter(MainActivity.this, R.layout.listview_1,furnitureList);
		ListView listView_1=(ListView) findViewById(R.id.listView_1);
		listView_1.setAdapter(adpter_1);
	}

	private void initFurniture() {
		Furniture sofa_1=new Furniture("PNI.ZJ81099-1", R.drawable.pic_1);
		furnitureList.add(sofa_1);
		Furniture sofa_2=new Furniture("PNI.ZJ81500",R.drawable.pic_2);
		furnitureList.add(sofa_2);
		Furniture sofa_3=new Furniture("PNI.ZJ81164 ",R.drawable.pic_3);
		furnitureList.add(sofa_3);
		Furniture sofa_4=new Furniture("4",R.drawable.pic_4);
		furnitureList.add(sofa_4);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

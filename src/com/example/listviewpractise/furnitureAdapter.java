package com.example.listviewpractise;

import java.util.List;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class furnitureAdapter extends ArrayAdapter<Furniture> {

	private int resourceId;
	
	public furnitureAdapter(Context context, int textViewResourceId, List<Furniture> objects){
		super(context, textViewResourceId, objects);
		resourceId=textViewResourceId;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent){
		Furniture furniture=getItem(position);
		View view;
		ViewHolder viewHolder;
		if(convertView==null){
			view=LayoutInflater.from(getContext()).inflate(resourceId, null);
			viewHolder=new ViewHolder();
			viewHolder.furnitureImage=(ImageView) view.findViewById(R.id.furniture_1);
			viewHolder.furnitureName=(TextView) view.findViewById(R.id.name_1);
			view.setTag(viewHolder);
		}else {
			view=convertView;
			viewHolder=(ViewHolder) view.getTag();
		}
		viewHolder.furnitureImage.setImageResource(furniture.getId());
		viewHolder.furnitureName.setText(furniture.getName());
		return view;
	}
	
	class ViewHolder{
		
		ImageView furnitureImage;
		
		TextView furnitureName;
	}
	
}

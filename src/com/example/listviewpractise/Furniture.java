package com.example.listviewpractise;

public class Furniture {
	
	private String name;
	
	private int ImageId;
	
	public Furniture(String name, int imageId){
		this.name=name;
		
		this.ImageId=imageId;
	}
	
	public String getName(){
		
		return name;
	}
	
	public int getId(){
		return ImageId;
	}
}

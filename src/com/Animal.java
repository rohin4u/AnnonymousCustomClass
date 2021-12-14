package com;

public class Animal {
	
	Dog g;
	
	Animal(Dog g)
	{
		this.g=g;
	}
	
	public void speak()
	{
		
		g.sound();
	}

}

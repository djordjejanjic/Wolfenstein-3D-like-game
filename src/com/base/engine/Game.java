package com.base.engine;

public class Game 
{
	Bitmap level;
	
	public Game()
	{
		level = new Bitmap("level1.png");
		
		//Uzimanje pixela i ucitavanje nivoa
		for(int i = 0; i < level.getWidth(); i++) {
			for(int j = 0; j < level.getHeight(); j++) {
				System.out.print(level.getPixel(i, j));
			}
			System.out.println();
		}
	}
	
	public void input()
	{

	}
	
	public void update()
	{

	}
	
	public void render()
	{
;
	}

}

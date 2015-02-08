package main;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class GameCanvas extends Canvas {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5559091200466822213L;
	
	public GameCanvas(){
		setIgnoreRepaint(true);
		setBackground(Color.BLACK);
	}
	
	public void paint(Graphics g){
		Graphics graphics = this.getBufferStrategy().getDrawGraphics();
		graphics.clearRect(0, 0, getWidth(), getHeight());
		Gui.getScreen(Gui.getCurentScreenId()).render(graphics);
		while(this.getBufferStrategy().contentsLost()){
			graphics.clearRect(0, 0, getWidth(), getHeight());
			Gui.getScreen(Gui.getCurentScreenId()).render(graphics);
			System.out.println("contents lost");
		}
		this.getBufferStrategy().show();
		graphics.dispose();
	}
}

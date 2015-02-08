package main;

import java.awt.Graphics;

public interface Screen {

	public void update();
	public void render(Graphics g);
	public void doEvents(Event e);
}

package firstScreen;

import java.awt.Color;
import java.awt.Graphics;

import main.Event;
import main.Screen;

public class FirstScreen implements Screen {

	public void update() {
		// TODO Auto-generated method stub
		System.out.println("the screen works");
	}

	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.CYAN);
		g.fillRect(69, 80, 100, 40);

	}

	public void doEvents(Event e) {
		// TODO Auto-generated method stub
		
	}

}

package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyL implements KeyListener {


	
	public KeyL(Gui Gui){
		Gui.addKeyListener(this);
	}

	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		String[] args = new String[1];
		int code = e.getKeyCode();
		args[0] = String.valueOf(code);
		Gui.getScreen(Gui.getCurentScreenId()).doEvents(new Event("KeyPressed",args));
	}


	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		String[] args = new String[1];
		int code = e.getKeyCode();
		args[0] = Integer.toString(code);
		Gui.getScreen(Gui.getCurentScreenId()).doEvents(new Event("KeyReleased",args));
	}


	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		String[] args = new String[1];
		int code = e.getKeyCode();
		args[0] = Integer.toString(code);
		Gui.getScreen(Gui.getCurentScreenId()).doEvents(new Event("KeyTyped",args));
	}
	
	
}

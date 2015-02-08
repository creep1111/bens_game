package main;

import java.util.ArrayList;

import javax.swing.JFrame;

import firstScreen.FirstScreen;

public class Gui extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private static ArrayList<Screen> screens = new ArrayList<Screen>();
	private static int CurentScreen = 0;
	private static GameCanvas Canvas;
	public static int FirstScreenID = 0;

	public Gui(int width, int height){
		super("Ben's Game");
		setSize(width, height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		Canvas = new GameCanvas();
		add(Canvas);
		screens.add(new FirstScreen());
		setVisible(true);
		Canvas.createBufferStrategy(2);
	}
	
	public static GameCanvas GetGameCanvas(){
		return Canvas;
	}
	
	public static void setCurentScreen(int id){
		if(id >= 0 && id < screens.size()){
			getScreen(getCurentScreenId()).doEvents(new Event("UnInitalized", null));
			CurentScreen = id;
			getScreen(getCurentScreenId()).doEvents(new Event("Initialized", null));
		
		}else{
			throw new IllegalArgumentException("The screen ID can only be between 0 and "+ (screens.size() - 1));
		}
	}
	
	public static int getCurentScreenId(){
		return CurentScreen;
	}
	
	public static Screen getScreen(int id){
		if(id >= 0 && id < screens.size()){
			return screens.get(id);
		}else{
			throw new IllegalArgumentException("The screen ID can only be between 0 and "+ screens.size());
		}
		
	}
	
}

package main;

public class Main implements Runnable  {
	

	private static final int WIDTH = 1366;
	private static final int HIEGHT = 768;
	private static final int FRAME_RATE = 60;
	private int Ticks = 0;
	private static Gui GuiObject;
	private static KeyL KeyObject;
	
	private static boolean Running = false;
	private static Thread Game;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GuiObject = new Gui(WIDTH, HIEGHT);
		KeyObject = new KeyL(GuiObject);
		Game = new Thread(new Main());
		start();
	}

	public void run() {
		// TODO Auto-generated method stub
		try{
			while(Running){
				Tick();
				Render();
				try{
					Thread.sleep(1000 / FRAME_RATE);
				}catch(Exception e){
					e.printStackTrace();
				}
			}
		}catch(Exception e){
			System.out.println("something failed");
			e.printStackTrace();
			stop();
		}
	}

	private void Render() {
		Gui.GetGameCanvas().paint(Gui.GetGameCanvas().getGraphics());
	}
	
	
	private void Tick() {
		 //TODO Auto-generated method stub
		 Gui.getScreen(Gui.getCurentScreenId()).update();
	}

	public synchronized static void start(){
		Running = true;
		Game.start();
	}
	
	public synchronized static void stop(){
		Running = false;
	}
	
	
}



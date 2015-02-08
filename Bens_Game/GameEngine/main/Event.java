package main;

public class Event {

	private String type;
	private String[] args;
	
	public Event(String type, String[] args){
		this.type = type;
		this.args = args;
	}
	
	public String getType(){
		return type;
	}
	
	public String[] getArgs(){
		return args;
	}
	
}

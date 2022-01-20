package act_objCreation;

public class Race {

	String name;
	int lane;
	char batch;
	String difficulty;
	
	Race(String name, int lane, char batch, String difficulty){
		this.name = name;
		this.lane = lane;
		this.batch = batch;
		this.difficulty = difficulty;
	}
}

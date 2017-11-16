package zizixin.JavaPractice.designPattern.statePattern;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		context.setState(this);
	}

		
	@Override
	public String toString() {
		return "startState";
	}
}

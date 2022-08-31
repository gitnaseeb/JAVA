package workout;

public class VariableScope {

	public static void main(String[] args) {
		TrainingRoom HR = new TrainingRoom();
		TrainingRoom Assist = new TrainingRoom();
		System.out.println(HR.sanyo+""+Assist.sanyo);
		System.out.println(HR.sulab+""+Assist.sulab);
		System.out.println(TrainingRoom.sulab+""+TrainingRoom.sulab);
	}

}
class TrainingRoom{
	projector sanyo =new projector();
	static Toilet sulab = new Toilet();
	
}
class projector{
	
}
class Toilet{
	
}
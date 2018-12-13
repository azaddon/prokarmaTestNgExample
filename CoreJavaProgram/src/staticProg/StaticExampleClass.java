package staticProg;

public class StaticExampleClass {

	private String make;
	private static int instanceNum=0;
	
	public StaticExampleClass(String make) {
		this.make=make;
		instanceNum++;
	}
	public String getMake() {
		return make;
	}
	public static int getInsanceNum() {
		return instanceNum;
	}
}

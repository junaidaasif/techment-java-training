package TechmentTrainingDay5;


class CarModel{
	String name;
	int model;
	Engine engine;
	public CarModel(String name, int model, Engine engine) {
		super();
		this.name = name;
		this.model = model;
		this.engine = engine;
	}
	void displaying() {
		System.out.println("name "+ name);
		System.out.println("model "+ model);
		System.out.println("engine id "+ engine.engineId);
		System.out.println("engine type "+ engine.engieType);
	}
}

class Engine{
	int engineId;
	int engieType;
	public Engine(int engineId, int engieType) {
		super();
		this.engineId = engineId;
		this.engieType = engieType;
	}
	
}

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Engine engine = new Engine(23, 3);
		CarModel carmodel = new CarModel("audi", 2020, engine);
		carmodel.displaying();
	}

}

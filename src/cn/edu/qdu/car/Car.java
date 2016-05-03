package cn.edu.qdu.car;

public class Car extends Moto {

	private String type;// ±¦Âí¡¢±¼³Û

	public Car(String MotoNo) {
		super(MotoNo);
	}

	@Override
	public double rentFee(int day) {
		// ÈÕ×â½ð £º day & type
		if (type.equals("bmw")) {
			setFee(500);
		} else if (type.equals("benc")) {
			setFee(600);
		} else {
			setFee(400);
		}
		// return day * getFee();
		return super.rentFee(day);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}

package cn.edu.qdu.car;

public abstract class Moto {
	private String MotoNo;// ���ƺ�
	private double fee;// �����

	public Moto(String MotoNo) {
		this.MotoNo = MotoNo;
	}

	public double rentFee(int day) {
		return fee * day;
	}

	public String getMotoNo() {
		return MotoNo;
	}

	public void setMotoNo(String motoNo) {
		MotoNo = motoNo;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

}

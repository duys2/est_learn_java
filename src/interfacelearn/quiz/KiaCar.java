package interfacelearn.quiz;

public class KiaCar implements Car {
	@Override
	public String showEngine() {
		return "기아 자동차 엔진";
	}

	@Override
	public int amountNavi() {
		return 1000000;
	}

	@Override
	public String getTier() {
		return "기아 자동차 타이어";
	}
}
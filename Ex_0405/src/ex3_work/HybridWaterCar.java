package ex3_work;

public class HybridWaterCar extends HybridCar{

	int waterGauge;
	
	public HybridWaterCar(int gasGauge, int electricGauge, int waterGauge) {
		super(gasGauge, electricGauge);
		this.waterGauge = waterGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		// TODO Auto-generated method stub
		super.showCurrentGauge();
		System.out.println("물의 양 " + waterGauge);
	}
}

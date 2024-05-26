package ex2_enum;

public enum Trasportation {
	BUS(100){
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance * fare;
		}
	},
	TRAIN(150){
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance * fare;
		}
	},
	SHIP(200){
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance * fare;
		}
	},
	AIRPLALNE(250){
		@Override
		int totalFare(int distance) {
			// TODO Auto-generated method stub
			return distance * fare;
		}
	};
	
	protected final int fare;
	
	private Trasportation(int fare) {
		this.fare = fare;
	}
	
	
	//추상메서드 추가 
	abstract int totalFare(int distance);
	
}

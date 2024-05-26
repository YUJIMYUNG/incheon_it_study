package ex2_Thread;

class SynchronizedEx implements Runnable{
	private long money = 10000;//잔액 
	
	@Override
	public void run() {
		//해당 클래스에 대한 정보 
		//synchronized키워드를 사용하면 해당 키워드가 명시되어 있는 영역이 마무리 될 때까지
		//다른 스레드에서 접근하지 못하게 된다. 
		synchronized (SynchronizedEx.class) {
			for(int i = 0 ; i < 10 ; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				if(getMoney() <= 0)break;
				
				outMoney(1000);
				
			}
		}
		
	}
	
	
	public long getMoney() {
		return money;
	}
	
	public void setMoney(long money) {
		this.money = money;
	}
	
	public void outMoney(long howMuch) {
		String threadName = Thread.currentThread().getName();
		if(getMoney() > 0) {//잔액이 0 이상일 때 출금 가
			money -= howMuch;//잔액에서 출금액을 차감
			System.out.println(threadName + " - 잔액 : " + getMoney());
			
		}else {
			System.out.println(threadName + " - 잔액이 없습니다. ");
		}
	}
}




public class Ex5_Thread {
	public static void main(String[] args) {
		SynchronizedEx atm = new SynchronizedEx();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		
		son.setPriority(1);
		
		mom.start();
		son.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

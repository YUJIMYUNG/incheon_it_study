package ex2_enum;

 enum Item {
	 START("시작 ","s"), STOP("멈춤","p"), EXIT("종료","e");
	 
	 protected String itemStr;
	 protected String symbol;
	 
	 //열거형의 생성자는 외부에서 호출할 수 없다.  public>>오류 
	 Item(String itemStr, String symbol) {
		 this.itemStr = itemStr;
		 this.symbol = symbol;
	 }
	 
	 public String getItemStr() {
		return itemStr;
	}
	 
	 public String getSymbol() {
		return symbol;
	}
}
 
 

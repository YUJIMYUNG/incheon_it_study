package util;

public class Page {
	
	//nowPage : 현재페이지
	//rowTotal :전체 데이터의 개수 
	//blockList : 한페이지당 게시물 수 
	//blockPage : 한 화면에 나타날 페이지 메뉴 수 <- 1 2 3 ->
	
	public static String getPaging(String pageURL, int nowPage,int rowTotal, int blockList, int blockPage) {
		int totalPage; //전체 페이지수 
		int startPage; //시작 페이지 번호 
		int endPage; 
		
		boolean isPrevPage, isNextPage;
		StringBuffer sb;
		
		isPrevPage=isNextPage=false;
		
		totalPage = rowTotal/blockList;
		
		if(rowTotal%blockList != 0)totalPage++;
		
		//만약 잘못된 연산과 움짐익으로 인하여 현재 페이지수가 전체 페이지 수를 넘었을 경우 현재페이지 값을 전체 페이지 값으로 변경 
		if(nowPage > totalPage)nowPage = totalPage;
		
		//시작페이지와 마지막 페이지를 구한다. 
		startPage = ((nowPage-1)/blockPage)*blockPage+1;
		endPage = startPage + blockPage -1;
		
		//마지막 페이지 수가 전체페이지 수보다 크면 마지막페이지 값을 변경 
		if(endPage > totalPage) endPage = totalPage;
		
		//마지막 페이지가 전체페이지보다 작을경우 다음 페이징이 적용될 수 있도록 boolean형 값을 변경 
		if(endPage < totalPage)isNextPage = true;
		
		//시작페이지의 값이 1보다 크면 이전페이징이 적용될 수 있도록 값 설정 
		if(startPage > 1) isPrevPage = true;
		
		sb = new StringBuffer();
		
		//그룹페이지처리(이전버튼)---------------------------------------------
		if(isPrevPage) {
			sb.append("<a hrdef = '"+pageURL+"?page=");
			sb.append(startPage-1);
			sb.append("'><img src='img/btn_prev.gif'></a>");
		} else {
			sb.append("<img src='img/btn_prev.gif'>");
		}
		
		//--------------------페이지 목록 출력-------------------------------
		sb.append(" ");
		for(int i = startPage; i<=endPage; i++) {
			if(i > totalPage) break;
			if(i == nowPage) { //현재 있는 페이지 색깔 바꾸기 
				sb.append("&nbsp;<b><font color='#ff0000'>");
				sb.append(i);
				sb.append("</font></b>");
			}else {
				sb.append("&nbsp;<a href='"+pageURL+"?page=");
				sb.append(i);
				sb.append("'>");
				sb.append("</a>");
			}
		}//for
		
		sb.append("&nbsp;");
		
		//그룹페이지 처리 다음------------------------------------------- 
		if(isNextPage) {
			sb.append("<a hrdef = '"+pageURL+"?page=");
			sb.append(endPage+1);
			sb.append("'><img src='img/btn_next.gif'></a>");
		} else {
			sb.append("<img src='img/btn_next.gif'>");
		}
		
		return sb.toString();
	}
}

package Project;

public class incheon extends confirmedInfor{

	public incheon(String area) {
		super(area);
	}
	
	public int confirmedCases = 29097;
	public int deaths = 181;
			
	@Override
	public void information() {
		System.out.println("인천의 코로나19 발생동향");
		System.out.println("인천의 코로나19 누적 확진자 수 : " + confirmedCases
				+ "명");
		System.out.println("인천의 코로나19로 인한 사망자 수 : " + deaths
				 + "명");
	}
	
}

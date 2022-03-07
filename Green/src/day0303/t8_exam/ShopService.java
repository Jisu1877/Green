package day0303.t8_exam;
// 싱글톤
public class ShopService {
	private static ShopService shopService = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {		//리턴타입이 자기 클래스타입.
		return shopService;
	}
}

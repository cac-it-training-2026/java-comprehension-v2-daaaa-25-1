package q02_advanced.question01;

import java.util.ArrayList;
import java.util.List;

public class SystemMain01 {

	public static void main(String[] args) {

		System.out.println("===会員情報を表示します===");
		//TODO ここから実装する
		List<Coupon> coupons = new ArrayList<>();

		Coupon coupon1 = new Coupon(1, 0.5, "最初の特典");
		Coupon coupon2 = new Coupon(2, 0.25, "今月の特典");

		coupons.add(coupon1);
		coupons.add(coupon2);

		Member member1 = new Member(1, "Passw0rd", "Miura Manabu", 28, 2, coupons);

		member1.showMember();

		Member member2 = new Member(2, "aaaAAA", "Sato Kensuke", 43, 1, coupons);

		member2.showMember();
	}

}

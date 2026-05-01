package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {

	public static void main(String[] args) {

		// 19.1 
		ConsoleReader reader = new ConsoleReader();

		// 19.2
		Member member1 = Member.getInstance(1, "Passw0rd", "Miura Manabu", 28, 2);
		Member member2 = Member.getInstance(2, "aaaAAA", "Sato Kensuke", 43, 1);

		List<Member> members = new ArrayList<>();
		members.add(member1);
		members.add(member2);
		System.out.println("===現在の会員情報===");
		MemberManager.showAllMembers(members);

		int id;
		String password;

		try {

			System.out.print("変更する会員IDを入力してください > ");
			id = ConsoleReader.inputNumber();

			System.out.print("新しいパスワードを入力してください > ");
			password = ConsoleReader.inputString();

		} catch (Exception e) {
			e.printStackTrace();
			return;
		}

		MemberManager.updatePassword(members, id, password);

		System.out.println("===更新後の会員情報===");
		MemberManager.showAllMembers(members);
	}
}
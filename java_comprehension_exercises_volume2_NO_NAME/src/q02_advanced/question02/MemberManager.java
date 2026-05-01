package q02_advanced.question02;

import java.util.List;

public class MemberManager {

	//コンストラクタを作る引数ナシ
	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {
		for (Member member : members) {
			member.showMember();
			//拡張for文でメンバーを1個ずつ

		}
	}

	public static void updatePassword(List<Member> members, int id, String password) {

		boolean found = false;

		for (Member member : members) {

			if (member.getId() == id) {
				member.setPassword(password);
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("該当者はいませんでした。");
		}
	}
}

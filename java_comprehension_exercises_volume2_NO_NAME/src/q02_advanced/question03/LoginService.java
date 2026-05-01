package q02_advanced.question03;

import java.util.List;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */
public class LoginService {

	private List<Member> memberStorage;

	public LoginService(MemberStorage memberStorage) {
		this.memberStorage = memberStorage.getMembers();

	}

	/**
	 * memberStorage Memberクラスのリスト一覧
	 */

	//TODO ここから処理を記述
	public Member doLogin(int id, String password) {

		for (Member member : memberStorage) {

			if (member.getId() == id && member.getPassword().equals(password)) {
				return member; // 見つかった
			}
		}

		return null; // 見つからなかった
	}
}

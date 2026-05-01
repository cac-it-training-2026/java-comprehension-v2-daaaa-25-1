package q02_advanced.question03;

public class SystemMain03 {

	public static void main(String[] args) {
		ConsoleReader consoleReader = new ConsoleReader();
		MemberStorage memberStorage = new MemberStorage();

		LoginService loginService = new LoginService(memberStorage);
		System.out.println("ログイン情報を入力してください");
		Member loginUser = null;

		while (loginUser == null) {

			try {

				System.out.print("会員ID：");
				int id = consoleReader.inputNumber();

				System.out.print("パスワード：");
				String password = consoleReader.inputString();

				loginUser = loginService.doLogin(id, password);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {

					System.out.println("ログインに成功しました");
				}

			} catch (NumberFormatException e) {

				System.out.println("IDは数字で入力してください。");
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		System.out.println(loginUser);
	}

	//TODO ここから実装する

}

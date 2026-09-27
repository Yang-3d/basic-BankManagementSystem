import java.util.Scanner;

public class InsertInformation extends UsersManage {
    // static：所有功能类共享同一份用户列表和计数（否则各对象各有一份，数据互不相通）
    public static UsersManage[] users = new UsersManage[100];
    public static int count = 0;

    public void insert(Scanner scanner) {
        while (true) {
            if (count >= users.length) {
                System.out.println("用户数量已满！");
                break;
            }

            System.out.println("Enter username (输入 1 结束录入):");
            String username = scanner.nextLine();
            if (username.equals("1")) {
                System.out.println("结束录入");
                break;
            }

            System.out.println("Enter user password:");
            String password = scanner.nextLine();
            System.out.println("Enter bank account:");
            String bankAccount = scanner.nextLine();

            users[count] = new UsersManage();
            users[count].setUsername(username);
            users[count].setUserPassword(password);
            users[count].setBankAccount(bankAccount);
            System.out.println("User added successfully!");
            count++;
        }
    }
}

import java.util.Scanner;

public class Text extends UsersManage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 插入用户（循环录入，用户名输入 1 结束）
        InsertInformation i = new InsertInformation();
        i.insert(scanner);

        // 查询
        QueryInformation q = new QueryInformation();
        System.out.println("输入查询的银行卡号：");
        q.queryInformation(scanner.nextLine());

        // 存钱
        SaveMoney s = new SaveMoney();
        System.out.println("输入要存钱的银行卡号：");
        String saveAccount = scanner.nextLine();
        System.out.println("输入存钱金额：");
        double saveMoney = scanner.nextDouble();
        scanner.nextLine(); // 吃掉 nextDouble 留下的回车
        s.save(saveAccount, saveMoney);

        // 取钱
        WithDrawMoney w = new WithDrawMoney();
        System.out.println("输入要取钱的银行卡号：");
        String withAccount = scanner.nextLine();
        System.out.println("输入取钱金额：");
        double withMoney = scanner.nextDouble();
        scanner.nextLine(); // 吃掉 nextDouble 留下的回车
        w.withDrawMoney(withAccount, withMoney);

        // 修改密码
        ChangePassword cp = new ChangePassword();
        System.out.println("输入要改密码的银行卡号：");
        String acc = scanner.nextLine();
        System.out.println("输入原密码：");
        String old = scanner.nextLine();
        System.out.println("输入新密码：");
        String nw = scanner.nextLine();
        cp.changePassword(acc, old, nw);

        scanner.close();
    }
}

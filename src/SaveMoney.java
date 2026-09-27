public class SaveMoney extends InsertInformation {
    // 查询到正确的使用者才能存钱
    public void save(String bankAccount, double money) {
        if (money <= 0) {
            System.out.println("存钱失败！金额必须大于 0");
            return;
        }

        for (int i = 0; i < count; i++) {
            if (users[i].getBankAccount().equals(bankAccount)) {
                users[i].setMoney(users[i].getMoney() + money);
                System.out.println("存钱成功！");
                return;
            }
        }
        System.out.println("用户不存在！");
    }
}

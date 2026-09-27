public class WithDrawMoney extends InsertInformation {
    // 通过银行卡号判断用户，再判断余额是否足够取钱
    public void withDrawMoney(String bankAccount, double money) {
        for (int i = 0; i < count; i++) {
            if (users[i].getBankAccount().equals(bankAccount)) {
                if (money > 0 && money <= users[i].getMoney()) {
                    users[i].setMoney(users[i].getMoney() - money);
                    System.out.println("取钱成功！" + money);
                    System.out.println("剩余余额：" + users[i].getMoney());
                } else {
                    System.out.println("取钱失败！余额不足");
                }
                return;
            }
        }
        System.out.println("取钱失败！用户不存在");
    }
}

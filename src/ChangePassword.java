public class ChangePassword extends InsertInformation {
    public void changePassword(String bankAccount, String oldPassword, String newPassword) {
        for (int i = 0; i < count; i++) {
            if (users[i].getBankAccount().equals(bankAccount)) {
                if (users[i].getUserPassword().equals(oldPassword)) {
                    users[i].setUserPassword(newPassword);
                    System.out.println("密码修改成功！");
                } else {
                    System.out.println("原密码错误");
                }
                return;
            }
        }
        System.out.println("用户不存在");
    }
}

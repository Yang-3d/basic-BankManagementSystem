public class UsersManage {
    private String Username;
    private String UserPassword;
    private String BankAccount;
    private double money = 0;   // 每个用户自己的余额

    public String getUsername() {
        return Username;
    }
    public void setUsername(String username) {
        Username = username;
    }
    public String getUserPassword() {
        return UserPassword;
    }
    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }
    public String getBankAccount() {
        return BankAccount;
    }
    public void setBankAccount(String bankAccount) {
        BankAccount = bankAccount;
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        this.money = money;
    }
}

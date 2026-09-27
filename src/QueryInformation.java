import java.util.Scanner;

public class QueryInformation extends InsertInformation {
    // 查询银行卡号所对应使用者信息

    public void findByName(String username) {
        boolean found = false;
        for(int i = 0; i < count; i++){
            if(username.equals(users[i].getUsername())){
                System.out.println(users[i].getBankAccount());
                System.out.println(users[i].getMoney());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found.");
        }
    }
    public void queryInformation(String bankAccount) {
        System.out.println("Querying Bank Account Information...");

        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (users[i].getBankAccount().equals(bankAccount)) {
                System.out.println("User: " + users[i].getUsername());
                System.out.println("User Password: " + users[i].getUserPassword());
                System.out.println("Bank Account: " + users[i].getBankAccount());
                System.out.println("余额: " + users[i].getMoney());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Bank Account not found.");
        }
        System.out.println("Information query completed.");
    }

    public void findFirstPoor(){
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (users[i].getMoney() == 0) {
                System.out.println("User: " + users[i].getUsername());
                System.out.println("Bank Account: " + users[i].getBankAccount());
                System.out.println("Balance: " + users[i].getMoney());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("everyone has money");
        }
    }
    public void findRichest(){
      if(count == 0 ){
          System.out.println("No users found.");
          return;
      }
      int maxIndex = 0;
        for (int i = 0; i < count; i++) {
            if (users[i].getMoney() > users[maxIndex].getMoney()) {
                maxIndex = i;
            }
        }
        System.out.println("Richest User: " + users[maxIndex].getUsername() + " with $" + users[maxIndex].getMoney());
    }
}

package Bank;

import java.util.ArrayList;

public class BankApplication {
    private String name;
    private ArrayList<Account> accounts = new ArrayList<>();

    public BankApplication() {
    }

    public BankApplication(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account a){
        accounts.add(a);
    }

    public void removeAccount(int i){
        accounts.remove(i);
    }

    public Account getMaxAccount(){
        double max = -32000;
        int maxIndex = 0;
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getBalance() > max){
                max = accounts.get(i).getBalance();
                maxIndex = i;
            }
        }
        return accounts.get(maxIndex);
    }

    public double totalBalance(){
        double sum = 0;
        for(int i=0;i<accounts.size();i++){
            sum+=accounts.get(i).getBalance();
        }
        return sum;///AVERAGE SUM OF ACCOUNTS
    }
    public double getAverageBalance(){
        return totalBalance()/accounts.size();///AVERAGE SUM OF ACCOUNTS
    }

    public int totalAccounts(){
        return accounts.size();
    }


    public void sortByBalance(){
        for(int i=0;i<accounts.size();i++){
            for(int j=0;j<accounts.size()-1;j++){
                if(accounts.get(j).getBalance() < accounts.get(j+1).getBalance()){
                    Account temp = accounts.get(j);
                    accounts.set(j, accounts.get(j+1));
                    accounts.set(j+1, temp);

                    /*
                    Account temp = accounts[j];
                    accounts[j] = accounts[j+1];
                    accounts[j+1] = temp;
                     */
                }
            }
        }
    }

    public String getBankData(){
        sortByBalance();
        String s = name+"\n";
        for(int i=0;i<accounts.size();i++){
            s += accounts.get(i)+"\n";
        }
        s+="---------------------------------------- \n";
        s+="User with max balance: "+getMaxAccount()+" \n";
        s+="Average balance: "+getAverageBalance()+"\n";
        s+="***TOTAL BALANCE***: "+totalBalance();
        return s;
    }




}


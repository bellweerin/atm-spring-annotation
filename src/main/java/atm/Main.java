package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);
//        atmUI.run();
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        ATM atm = context.getBean(ATM.class);
        Bank bank = context.getBean(Bank.class);
        String name = atm.validateCustomer(2,2345);
        System.out.println(name+" "+atm.getBalance());
        System.out.println(bank.getName());
    }
}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);

		   Bank bank = new Bank();

        System.out.print("Πόσους λογαριασμούς θέλεις να δημιουργήσεις; ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("\nΔιάλεξε τύπο λογαριασμού:");
            System.out.println("1. Απλός");
            System.out.println("2. Checking");
            System.out.println("3. Savings");
            System.out.print("Επιλογή: ");
            int choice = in.nextInt();

            System.out.print("Δώσε αρχικό ποσό: ");
            double amount = in.nextDouble();

            BankAccount account = null;

            switch (choice) {
                case 1:
                    account = new BankAccount(amount);
                    break;

                case 2:
                    account = new CheckingAccount(amount);
                    break;

                case 3:
                    System.out.print("Δώσε επιτόκιο (π.χ. 0,02): ");
                    double rate = in.nextDouble();
                    account = new SavingsAccount(amount, rate);
                    break;

                default:
                    System.out.println("Λάθος επιλογή!");
                    i--;
                    continue;
            }
			if (choice==1 || choice==2) {
			System.out.print("Θες να κάνεις deposit?(1:Ναι/2¨Οχι):");
					int answer=in.nextInt();
					while (answer==1) {
						System.out.println("Deposit:");
						double deposit=in.nextDouble();
						account.deposit(deposit);
						System.out.print("Θες να κάνεις κι άλλο deposit?(1:Ναι/2¨Οχι):");
						answer=in.nextInt();
					}
				}

            bank.addAccount(account);
            System.out.println(" Ο λογαριασμός δημιουργήθηκε");
			System.out.println("\n ΣΤΟΙΧΕΙΑ ΤΡΑΠΕΖΑΣ");
		bank.addInterestToSavings();
        bank.printAllData();
        }

		in.close();
	}
}

public class Main {
//<<<<<<< HEAD
//    static int[] amounts = new int[100];
//    static String[] borrowers = new String[100];
//    static boolean[] isPaid = new boolean[100];
//    static double[] interestRates = new double[100];
//    static String[] contactNumbers = new String[100];
//    static int loansCount = 0;
//    static Loan loans[] = new Loan[100];
//
//    public static void addLoan(String borrower, int amount, double interestRate){
//        borrowers[loansCount] = borrower;
//        amounts[loansCount] = amount;
//        interestRates[loansCount] = interestRate;
//        loansCount++;
//    }
//
//    public static void setAsPaid(String borrower){
//        for (int i=0; i< loansCount; i++){
//            if (loans[i].getBorrower().equals(borrower)){
//                loans[i].setAsPaid();
//            }
//        }
//    }
//
//    public static void listLoans() {
//        for (int i = 0; i < loansCount; i++) {
//            Loan loan = loans[i];
//            if (!loan.isPaid()){
//                System.out.println(borrowers[i] + ": " + amounts[i]);
//            }
//        }
//    }
//
//    public static double calculateProfitEarned(){
//        double profit = 0;
//        for (int i=0; i< loansCount; i++){
//            // if the loan was repaid, add the interest to profit
//            if (isPaid[i]){
//                profit = profit + (amounts[i] * interestRates[i]);
//            }
//        }
//        return profit;
//    }
//=======
//>>>>>>> 316dc0f18b45f26f81a3e0115cdb8ee807ad2d04

    public static void main(String[] args) {
        LoanManager m1 = new LoanManager();
        m1.addLoan("Alice Betsy", 10, 0.1);
        m1.addLoan("Ben Chee", 20, 0.2);
        m1.addLoan("Chris Davis", 30, 0.3);
        m1.setAsPaid("Ben Chee");
        m1.listLoans();
        System.out.println("profit from m1: " + m1.calculateProfitEarned());

        LoanManager m2 = new LoanManager();
        m2.addLoan("Alice Betsy", 500, 0.05);
        m2.addLoan("Emily Hee", 25, 0.15);
        m2.setAsPaid("Alice Betsy");
        m2.listLoans();
        System.out.println("profit from m2: " + m2.calculateProfitEarned());
    }
}

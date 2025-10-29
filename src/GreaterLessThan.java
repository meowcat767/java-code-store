public class GreaterLessThan {
    public static void main(String[] args) {
        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        boolean toGrad = creditsEarned > creditsToGraduate;
        System.out.println(toGrad);
        double creditsAfterSeminar = creditsOfSeminar + creditsEarned;
        boolean amountTrueToGrad = creditsToGraduate < creditsAfterSeminar;
        System.out.println(amountTrueToGrad);
    }
}
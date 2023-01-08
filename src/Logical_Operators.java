public class Logical_Operators {
    public static void main(String[] args) {
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isElidgible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;

    }
}

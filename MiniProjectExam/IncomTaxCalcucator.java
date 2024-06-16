package MiniProjectExam;
// tax deduction details
// Income < 5L => 0% tax
// Income < 5L-10L => 20% tax
// Income >10L => 30% tax

class IncomeTaxCalcucator{
    public static float tax(int income){
        if(income<500000) {
            System.out.println("Tax Rate is 0%, Beacuse its income less then 5L.");
            return income*0f;
        }else if(income<1000000){
            System.out.println("Tax Rate is 20%, Beacuse its income between 5L to 10L.");
            return income*0.2f;
        }else{
            System.out.println("Tax Rate is 30%, Beacuse its income above 10L.");
        return income*0.3f;
        }

    }
    public static void main(String[] args) {
        int income = 499999;
        float tax = tax(income);
        System.out.println("Income "+income+", tax "+tax);
        System.out.println("Total after deduct  Tax "+(income - tax));
    }
}

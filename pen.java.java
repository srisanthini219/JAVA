public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = sc.nextInt();
        int pens = sc.nextInt();
        int groupsOfFive = pens / 5;
        int remainingPens = pens % 5;
        int pensToPay = groupsOfFive * 3 + remainingPens;
        int totalCost = pensToPay * price;
        System.out.println(+ pensToPay);
        System.out.println( + totalCost);
}
}
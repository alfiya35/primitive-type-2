public class Main {
    public static void main(String[] args) {

        int replenishment = 1200;
        int check = 250;

        int bonus;
        if (replenishment >= 1000) {
            bonus = 10;
        } else {
            bonus = 0;
        }
        int sum = bonus * replenishment / 1000;

        System.out.println("Ваш бонус составит " + sum);

        int total = sum + check + replenishment;
        System.out.println("Ваш итоговый счет составит " +total);
    }



}

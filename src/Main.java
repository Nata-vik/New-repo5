
public class Main {
    public static void main(String[] args) {

        int price = 20568;          // цена билета
        int sum = 20;               // кол-во рублей, за которые начисляют 1 милю
        int count = price / sum;    // кол-во начисленных миль
        System.out.println("Количество начисленных миль: " + count);
    }
}

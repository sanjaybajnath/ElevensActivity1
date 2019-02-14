/**
 * Created by Teacher on 1/7/2019.
 */
public class CardTester {
    public static void main(String[] args){
        Card one = new Card("nine","clubs",9);
        Card two = new Card("nine","spades",9);
        Card three = new Card("nine","spades",9);

        System.out.println(one.matches(two));
        System.out.println(one.matches(three));
        System.out.println(three.matches(two));

        System.out.println(one);
    }
}

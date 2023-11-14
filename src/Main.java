// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);

        }
        sayHello("everybody");

        if(checK(7) == true){
            System.out.println(7+ "la so nguyen to");
        }


    }

    static void sayHello(String msg){
        System.out.println("Hello world!" + msg);
    }

    static boolean checK(int n){
        if (n<2) return false;
        if (n<4) return true;

        for (int i=2; i <= Math.sqrt(n); i++ ){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
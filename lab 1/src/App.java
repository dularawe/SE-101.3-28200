public class App {
    public static void main(String[] args) throws Exception {
        display();
        display_tak1();
        forloop();
        con();
        display_switch();
        erro_fix();

    }

    public static void display() {
        System.out.println("Hello WORLD");
    }

    public static void display_tak1() {
        System.out.println("My name is Dulara ");
        System.out.println("My dgree is Software Engnnweing mohe 22.2");
        // first i open cv and go to this project directory using dir / cd after that
        // javac app.java after that type on cmd " java app.java"
    }

    public static void forloop() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Executing loop " + i);
        }
    }

    public static void con() {
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.println(x);
            System.out.println("\n");

        }
        System.out.println("im out of the loop now ");
        // break using for break fully program , but countine use for skip one time
    }

    public static void display_switch() {

        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }

        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'B') {
            System.out.println("You passed");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("You passed");
        }

        System.out.println("Your grade is " + grade);

    }

public static void erro_fix(){

     
        int[] numbers = { 10, 20, 30, 40, 50 };
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");

        String[] names = { "james", "Larry", "Tom", "Lacy" };
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
        }

    

}
}
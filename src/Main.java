public class Main {
    public static void main(String[] args) {
        // Задание №4
        System.out.println("Задание №5");

        for (int i=1    ;i<=30;i++){

            double a = i % 3;
            double b = i % 5;

            if (a == 0 && b == 0){
                System.out.println(i + ": ping pong");
            }
            else if (b == 0){
                System.out.println(i + ": pong");
            }
            else if (a == 0){
                System.out.println(i + ": ping");
            }
        }

        // Задание №5

        System.out.println(" ");
        System.out.println("Задание №5");

        int m = 0;
        int n = 1;

        System.out.print(m + " " + n + " ");

        for (int f=1;f<=8;f++){
            int z = m + n;
            m = n;
            n = z;
            System.out.print(z + " ");
        }
    }
}
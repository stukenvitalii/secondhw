import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);

        int grads, wind;
        String isRain = new String();

        System.out.println("Введите сколько граудсов на улице: ");
        grads = s.nextInt();

        System.out.println("Введите скорость ветра на улице в м/c: ");
        wind = s.nextInt();
        s.nextLine();

        System.out.println("На улице идет дождь?(Yes/No)");
        isRain = s.nextLine();

        if ((isRain.equals("Yes")) && (grads < 30)) {
            System.out.println("Думаю, лучше посидеть дома)");
        }
        else if ((isRain.equals("No")) && (grads < 0) && (wind < 6)){
            System.out.println("Если тепло оденетесь, то можно идти)");
        }
        else if ((isRain.equals("No")) && (grads >= 0) && (wind < 9)){
            System.out.println("На улице хорошая погода, советую прогуляться!");
        }
        else if ((isRain.equals("No")) && (grads >= 15) && (wind < 9)) {
            System.out.println("На улице прекрасная погода, быстрее на улицу!");
        }
        else if ((isRain.equals("Yes")) && (grads >= 30) && (wind < 10)) {
            System.out.println("На улице дождь, но в такую жару я думаю это только хорошо! Быстрее на улицу!");
        }
        else {
            System.out.println("Наверное, лучше посидеть дома)");
        }
        System.out.printf("%d %d %s",grads,wind,isRain);
    }   
}

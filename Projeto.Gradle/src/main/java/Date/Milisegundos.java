package Date;
import java.util.Date;

public class Milisegundos {
    public static void main(String[] args) {
        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);
        System.out.println(novaData);
    }
}

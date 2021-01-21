package Date;
import java.time.LocalDate;

public class LocalData {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        LocalDate ontem = hoje.minusDays(1);
        System.out.println(hoje);
        System.out.println(ontem);
    }
}

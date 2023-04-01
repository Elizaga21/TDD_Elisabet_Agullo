import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCoche {
    @Test

    public void test_crear_coche_su_velocidad_es_cero() {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
    public void test_acelerar_un_coche_su_velocidad_aumenta() {
        Coche nuevoCoche = new Coche();
        Assertions.assertEquals(0,nuevoCoche.velocidad);
    }
}

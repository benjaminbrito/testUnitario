import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SumaTest {
  
  @Test
  public void testSuma() {
    int a = 2;
    int b = 3;
    int resultado = Suma.sumar(a, b);
    Assertions.assertEquals(5, resultado);
  }
  
}
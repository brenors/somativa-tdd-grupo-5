import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstoqueSorveteriaTest {
    private EstoqueSorveteria estoque;

    @BeforeEach
    public void setUp() {
        estoque = new EstoqueSorveteria();
    }

    @Test
    public void testAdicionarItem() {
        estoque.AdicionarItem("Sorvete de Chocolate", 10);
        Assertions.assertEquals(10, estoque.ConsultarQuantidade("Sorvete de Chocolate"));
    }

    @Test
    public void testRemoverItem() {
        estoque.AdicionarItem("Sorvete de Morango", 5);
        estoque.RemoverItem("Sorvete de Morango");
        Assertions.assertEquals(0, estoque.ConsultarQuantidade("Sorvete de Morango"));
    }

    @Test
    public void testConsultarQuantidade() {
        estoque.AdicionarItem("Sorvete de Baunilha", 8);
        Assertions.assertEquals(8, estoque.ConsultarQuantidade("Sorvete de Baunilha"));
    }
}

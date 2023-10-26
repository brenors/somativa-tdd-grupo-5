import java.util.HashMap;
import java.util.Map;

public class EstoqueSorveteria {
    private Map<String, Integer> estoque;

    public EstoqueSorveteria() {
        estoque = new HashMap<>();
    }

    public void AdicionarItem(String item, int quantidade) {
        estoque.put(item, quantidade);
    }

    public void RemoverItem(String item) {
        estoque.remove(item);
    }

    public int ConsultarQuantidade(String item) {
        return estoque.getOrDefault(item, 0);
    }
}

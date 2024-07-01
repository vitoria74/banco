import java.util.List;
import lombok.Data;

@Data

/**
 * Classe que recebe as informações sobre o banco
 */

public class Banco {
    
    private String nome;
    private List<Conta> contas;
}

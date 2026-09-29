package Class;
import Enums.NivelDificuldadeEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "exercicio_fisico")
public class ExercicoFisico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String grupoMuscular;
    private String imagem;
    private String descricao;
    private int numeroSeries;
    private int numeroRepeticoes;
    private double cargaSugerida;

    @Enumerated(EnumType.STRING)
    private NivelDificuldadeEnum nivelDificuldade;





}

import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario extends Pessoa{
    public BigDecimal salario;
    public String funcao;

    public Funcionario(BigDecimal salario, String funcao, String nome, LocalDate dataDeNascimento) {
        this.salario = salario;
        this.funcao = funcao;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", funcao='" + funcao + '\'' +
                ", nome='" + nome + '\'' +
                ", dataDeNascimento=" + dataDeNascimento +
                '}';
    }
}

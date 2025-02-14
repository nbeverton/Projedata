import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void removerFuncionario(Map<String, Funcionario> funcionarios, String nome){
        funcionarios.remove(nome);
    }

    public static void imprimirTodosFuncionarios(Map<String, Funcionario> funcionarios){
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        NumberFormat formaSaalrio = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
        formaSaalrio.setMinimumFractionDigits(2);
        formaSaalrio.setMaximumFractionDigits(2);

        for (Funcionario f : funcionarios.values()){
            String dataFormatada = f.getDataDeNascimento().format(formatoData);
            String salarioFormatado = formaSaalrio.format(f.getSalario());

            System.out.println(f.getNome());
            System.out.println(salarioFormatado);
            System.out.println(f.getFuncao());
            System.out.println(dataFormatada);
            System.out.println("");
        }
    }

    public static void aumentoSalario(Map<String, Funcionario> funcionarios, BigDecimal valorAcrescido){
        for (Funcionario f : funcionarios.values()){
            BigDecimal novoSalario = f.getSalario().multiply(BigDecimal.ONE.add(valorAcrescido));
            f.setSalario(novoSalario);
        }
    }


    public static void main(String[] args) {
        Dados dados = new Dados();
/*
* 3.1 – Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
* Criei um Map para mapear minha lista pelo nome dos funcionários com todas as informações da tabela dada.
* Importei as onfirmações da classe Dados para não poluir este ambiente
* */
        Map<String, Funcionario> funcionarios = new HashMap<>();
        funcionarios.put("Maria", dados.funcionario1);
        funcionarios.put("João", dados.funcionario2);
        funcionarios.put("Caio", dados.funcionario3);
        funcionarios.put("Miguel", dados.funcionario4);
        funcionarios.put("Alice", dados.funcionario5);
        funcionarios.put("Heitor", dados.funcionario6);
        funcionarios.put("Arthur", dados.funcionario7);
        funcionarios.put("Laura", dados.funcionario8);
        funcionarios.put("Heloisa", dados.funcionario9);
        funcionarios.put("Helena", dados.funcionario10);


//        3.2 – Remover o funcionário “João” da lista.
        removerFuncionario(funcionarios, "João");

//       3.3 – Imprimir todos os funcionários com todas suas informações, sendo que:
//• informação de data deve ser exibido no formato dd/mm/aaaa;
//• informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
        imprimirTodosFuncionarios(funcionarios);

//        3.4 – Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
        aumentoSalario(funcionarios, new BigDecimal("0.10"));
        imprimirTodosFuncionarios(funcionarios);

//        3.5 – Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
//        Map<String, List<Funcionario>> agruparFuncionarioPorCargo;


//        3.6 – Imprimir os funcionários, agrupados por função.
//        3.8 – Imprimir os funcionários que fazem aniversário no mês 10 e 12.
//        3.9 – Imprimir o funcionário com a maior idade, exibir os atributos: nome e idade.
//        3.10 – Imprimir a lista de funcionários por ordem alfabética.
        
//        3.11 – Imprimir o total dos salários dos funcionários.
//        3.12 – Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00.

    }
}

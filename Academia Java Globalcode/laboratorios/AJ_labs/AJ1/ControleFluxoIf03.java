/*
 * Vamos utilizar o condicional if para atender as seguintes especificacoes:
 * - Quando o sexo for masculino (M) imprimir:
 *    O Senhor <nome da pessoa>  e portador do rg... 
 * - Quando o sexo for feminino (F) imprimir:
 *    A Senhora <nome da pessoa> e portadora do rg ..
 * - Quando o sexo for invalsido (diferente de F ou M) imprimir:
 *    O Senhor(a) <nome da pessoa> e portador(a)
 * - Quando a pessoa for CLT imprimir:
 *    esta registrado com o salario de R$ <salario>
 * - Quando a pessoa for Autonoma imprimir:
 *    foi contratado pelo valor de R$ <salario>
 */
class ControleFluxoIf03 {

    public static void main(String[] args) {
        // Declaracao das variaveis
        String nome;
        String dataNascimento;
        String rg;
        char sexo; // UTILIZE 'M' para MASCULINO e 'F' para FEMININO
        double salario;
        boolean clt;
        // Inicializacao
        nome = "Manuel da Silva";
        dataNascimento = "22/04/1980";
        rg = "29345432";
        sexo = 'M';
        salario = 2500.00;
        clt = true;
        // Impressao do texto
        String textNome = "O Senhor(a) " + nome + ", ";
        String textRg = "portador(a)do rg de numero " + rg + ", \n";
        String textNasc = "nascido em " + dataNascimento + ", ";
        String textSexo = " do sexo " + sexo + ", ";
        String text$ = " esta registrado com o salario de R$ " + salario;
        System.out.println(textNome + textRg + textNasc + textSexo + text$);
    }
}

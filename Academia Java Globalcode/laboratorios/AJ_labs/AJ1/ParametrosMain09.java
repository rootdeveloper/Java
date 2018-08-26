/*
 * Altere a seguinte classe fazendo com que as variaveis sejam criadas e 
 * inicializadas com valores recebidos do parametro do metodo main.
 * Caso algum dos argumentos nao seja passado, interromper o programa
 * indicando a maneira correta de executar a classe: 
 * <nome> <data nascimento> <rg> <sexo> <salario> <clt>
 * 
 * Dicas:
 * Para fazer a conversao de uma String para um int, double ou float utilize:
 * int    numeroI = Integer.parseInt("12");
 * double numeroD = Double.parseDouble("12");
 * float  numeroF = Float.parseFloat("23");
 * 
 */
class ParametrosMain09 {

    public static void main(String[] args) {
        String nome;
        String dataNascimento;
        String rg;
        char sexo; // UTILIZE 'M' para MASCULINO e 'F' para FEMININO
        double salario;
        boolean clt; // Para profissionais autonomos utilize false
        
        // inicialização das variáveis...
        
        // lógica de negócios
        String txtPortador;
        String txtSenhor;
        String txtVinculo;
        switch (sexo) {
        case 'F':
            txtPortador = "portadora ";
            txtSenhor = "A Senhora ";
            break;
        case 'M':
            txtPortador = "portador ";
            txtSenhor = "O Senhor ";
            break;
        default:
            txtPortador = "portador(a) ";
            txtSenhor = "O Senhor(a) ";
            break;
        } // Posteriormente, estaremos atribuindo os valores, conforme podemos
        // observar no switch
        if (clt == true) {
            txtVinculo = "esta registrado com o salario de R$ ";
        } else {
            txtVinculo = "foi contratado pelo valor de R$ ";
        }
        String textNome = txtSenhor + nome + ", ";
        String textRg = txtPortador + "do rg de numero " + rg + ", \n";
        String textNasc = "nascido em " + dataNascimento + ", ";
        String textSexo = "do sexo " + sexo + ", ";
        String text$ = txtVinculo + salario;
        System.out.println(textNome + textRg + textNasc + textSexo + text$);
    }
}

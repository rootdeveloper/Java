/*
 * 
 * 1) Trocar a estrutura de if else utilizada para tratamento de masculino e feminino por um switch
 * 
 */
class ControleFluxoSwitch04 {

    public static void main(String[] args) {
        String nome;
        String dataNascimento;
        String rg;
        char sexo; // UTILIZE 'M' para MASCULINO e 'F' para FEMININO
        double salario;
        boolean clt; // Para autonomos utilize false
        nome = "Manuel da Silva";
        dataNascimento = "22/04/1980";
        rg = "29345432";
        sexo = 'M';
        salario = 2500.00;
        clt = false;
        String txtPortador = "portador(a) ";
        String txtSenhor = "O Senhor(a) ";
        String txtVinculo = "";
        if (sexo == 'F') {
            txtPortador = "portadora ";
            txtSenhor = "A Senhora ";
        } else if (sexo == 'M') {
            txtPortador = "portador ";
            txtSenhor = "O Senhor ";
        }
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

package desafios.POO;

public class pessoa {
   public int cpf;
    public String nome;
   public char sexo;

   public void imprimiNome() {
        System.out.println("nome: " + nome);
       System.out.println("CPF: " + cpf);
       System.out.println("sexo: " + sexo);
    }

   public boolean validarCPF(int cpf) {
        boolean retorno = false;
        if (cpf != 0) {
            retorno = true;
        } else {
            retorno = false;
        }
        return retorno;
    }}
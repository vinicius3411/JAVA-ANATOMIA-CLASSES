public class MinhaClasse {
  public static void main(String[] args) {

    // String para a identificação dos objetos

    String primeiroNome = "Vinicius";
    String segundoNome = "Rosa";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
  }

  // método para a junção dos nomes

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
  }
}

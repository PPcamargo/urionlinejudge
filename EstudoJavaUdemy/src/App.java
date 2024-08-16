import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
       int idade = 25;
       String nome = "Pedro Paulo Camargo";
       char sexo =  'M';
       System.out.println("Ola, seu nome é: " + nome);
       System.out.println("Seu sexo é: " + sexo);
       System.out.println("E por fim sua idade é: " + idade);
       Locale.setDefault(Locale.US);
    }
}

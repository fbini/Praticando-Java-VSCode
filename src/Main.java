public class Main {
    public static void main(String[] args) {
        System.out.println("Olá VSCODEEEEEEE"); 

        String nome = "Maria";
        int idade = 25;
        double altura = 1.68;
        boolean estudante = true;

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("É estudante: " + estudante);
        System.out.println("----------------------------");

        double valorDouble = 19.8;
        int valorInt = (int) valorDouble;
        System.out.println("O valor inteiro do produto é: " + valorInt);
  
        System.out.println("-----------------------------");
        double nota1 = 10;
        double nota2 = 10;
        double nota3 = 10;

        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média é de: " + media);

        System.out.println("----------------------------");

        int celcius = 10;
        double converteFahren = (celcius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit: " + converteFahren);
        System.out.println("-------------------------------");

        String titulo = "Pequeno príncipe";
        String autor = "Ingrid B";
        int numeroDePaginas = 50;
        double precoDoLivro = 19.99;
        char categoria = 'F';

        String categoriaDescricao;
        
        if (categoria == 'F' ) {
            categoriaDescricao = "Ficção"; 
        } else if(categoria == 'N') {
            categoriaDescricao = "Não-ficção";
        } else if(categoria == 'T'){
            categoriaDescricao = "Tecnologia"; 
        } else if (categoria == 'H') {
            categoriaDescricao = "História";
        } else {
            System.out.println("Não válido");
        }

        System.out.println("Livro cadastrado: " + titulo + ", de " + autor + ". Ele possui " + numeroDePaginas + ", custa R$" + precoDoLivro + " e pertence á categoria " + categoriaDescricao + ",");


    }
}
package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salario;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if(salario == null){
            return;
        }

        for (double valor : this.salario)
            System.out.print(valor + " ");
    }

    public void calculaMedia(){
        if (salario == null){
            return;
        }

        int soma = 0;

        for (double valor : this.salario){
            soma += valor;
        }

        System.out.println("\nMédia: "+soma/this.salario.length);
    }
}

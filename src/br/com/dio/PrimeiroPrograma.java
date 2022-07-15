package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);

        System.out.println(livro1);

       /* int a = 5;
        int b = 3;
        System.out.println("Hello World " + (a + b));*/
    }

}

class Livro {
    private String nome;
    private Integer numpaginas;

    public Livro(String nome, Integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(Integer numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpaginas=" + numpaginas +
                '}';
    }
}

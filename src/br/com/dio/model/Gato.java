package br.com.dio.model;

import java.util.Objects;

public class Gato {
    private String no;
    private String cor;
    private Integer idade;

    public Gato() { }

    public Gato(String no, String cor, Integer idade) {
        this.no = no;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNo() {
        return no;
    }

    public String getCor() {
        return cor;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(no, gato.no) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "no='" + no + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}

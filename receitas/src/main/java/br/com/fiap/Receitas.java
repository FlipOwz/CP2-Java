package br.com.fiap;


public class Receitas implements Comparable<Receitas> {

    private String titulo;
    private String ingredientes;
    private String modo;
    private double custo;
    private String categoria;

    public Receitas(String titulo, String ingredientes, String modo, double custo, String categoria) {
        this.titulo = titulo;
        this.ingredientes = ingredientes;
        this.modo = modo;
        this.custo = custo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Título da receita:" + titulo + "\nIngredientes:" + ingredientes + "\nModo de preparo:" + modo + "\nR$" + custo + "\nCategoria:" + categoria;
    }

}

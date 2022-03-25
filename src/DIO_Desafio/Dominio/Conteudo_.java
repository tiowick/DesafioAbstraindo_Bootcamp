package DIO_Desafio.Dominio;

public  abstract class Conteudo_ { // com o metodo abstract a class tbm tem que ser abstract
    // Mentoria e cursos são conteúdos
    // XP_PADRAO vai ser filho de conteudo, pq ta "Protected"
    protected static final double XP_PADRAO = 10d; // uma constante que quando criada vai ser sempre 10

    private String titulo;
    private String descricao;
    // class conteudo foi criada para que possa implementar os atributos e o metodo calcular xp, nas classes filhas
    // metodo calcular_xp, (classes que se extenderem de conteudo) serão obrigadas a implementar uma logica nesse metodo

    public abstract  double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

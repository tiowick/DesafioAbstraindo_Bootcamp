package DIO_Desafio.Dominio;

public class Curso extends Conteudo_ { // extendendo de conteudo
    // modificador de acesso

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }



    // crie um construtor vazio

    public Curso() {
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    // vamos usar o toString() para imprimir
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' + // usa o get pra chamar o titulo
                ", descricao='" + getDescricao() + '\'' + // usa o get pra chamar a dscrição
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }


}

package DIO_Desafio.Dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo_ { //mentoria filha de conteudo usa-se extends Conteudo

    private LocalDate data;

    // quando criar mentoria e calcular o metodo xp, vai ser o xp padrao + 20
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
    // crie um construtor vazio

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    // vamos usar o toString() para imprimir

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' + // usa o get pra chamar o titulo
                ", descricao='" + getDescricao() + '\'' +  // usa o get pra chamar a dscrição
                ", data=" + data +
                '}';
    }


}

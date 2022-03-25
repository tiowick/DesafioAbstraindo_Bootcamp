package DIO_Desafio.Dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class BootCamp {

   private String nome;
   private String descrição;
   private final LocalDate dataInicial = LocalDate.now();
   private final LocalDate dataFinal = dataInicial.plusDays(45);
   private Set<Dev> devsInscritos = new HashSet<>();
   private Set<Conteudo_> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<Conteudo_> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo_> conteudos) {
        this.conteudos = conteudos;
    }

    // como ta usansdo o HashSet<>(); e o  LinkedHashSet<>(); (usa-se o equals and HashConde()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BootCamp bootCamp = (BootCamp) o;
        return Objects.equals(nome, bootCamp.nome) && Objects.equals(descrição, bootCamp.descrição) && Objects.equals(dataInicial, bootCamp.dataInicial) && Objects.equals(dataFinal, bootCamp.dataFinal) && Objects.equals(devsInscritos, bootCamp.devsInscritos) && Objects.equals(conteudos, bootCamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descrição, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}

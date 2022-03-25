package DIO_Desafio.Dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo_> ConteudosInscritos = new LinkedHashSet<>(); // elementos unicos
    private Set<Conteudo_> ConteudosComcluidos = new LinkedHashSet<>(); // elementos unicos

    public void inscreverBootcamp(BootCamp bootCamp){ // adicionado todos os conteudos do bootcamp ao se increver
        this.ConteudosInscritos.addAll(bootCamp.getConteudos());
        bootCamp.getDevsInscritos().add(this); // adicionado esse Dev
    }

    public void proguedir (){
        Optional<Conteudo_> conteudo = this.ConteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) { // se estiver presente, vai ser colocado em comteudos comcluidos
            this.ConteudosComcluidos.add(conteudo.get());
            this.ConteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!!");
        }
    }

    public double calcularTotalXp(){
         return this.ConteudosComcluidos.stream().mapToDouble(Conteudo_::calcularXp).sum();
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo_> getConteudosInscritos() {
        return ConteudosInscritos;
    }

    public void setConteudosInscritos(Set<Conteudo_> conteudosInscritos) {
        ConteudosInscritos = conteudosInscritos;
    }

    public Set<Conteudo_> getConteudosComcluidos() {
        return ConteudosComcluidos;
    }

    public void setConteudosComcluidos(Set<Conteudo_> conteudosComcluidos) {
        ConteudosComcluidos = conteudosComcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(ConteudosInscritos, dev.ConteudosInscritos) && Objects.equals(ConteudosComcluidos, dev.ConteudosComcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, ConteudosInscritos, ConteudosComcluidos);
    }
}

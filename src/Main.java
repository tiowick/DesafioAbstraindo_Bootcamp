import DIO_Desafio.Dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso(); // instanciando o objeto
        //criando os objetos
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("Descrição curso");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java ");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.setData(LocalDate.now()); // passe o LocalDate(), não uma string ou numero!!!

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp java Developer");
        bootcamp.setDescrição("Descrição BootCamp java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devjeferson = new Dev();
        devjeferson.setNome("jeferson");
        devjeferson.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos jeferson: " + devjeferson.getConteudosInscritos());

        devjeferson.proguedir();
        devjeferson.proguedir();
        System.out.println("_");

        System.out.println("conteudos inscritos jeferson: " + devjeferson.getConteudosInscritos());
        System.out.println("conteudos comcluidos jeferson: " + devjeferson.getConteudosComcluidos());
        System.out.println("XP: " + devjeferson.calcularTotalXp());

        System.out.println("*************");

        Dev devCaio = new Dev();
        devCaio.setNome("caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("conteudos inscritos caio: " + devCaio.getConteudosInscritos());

        devCaio.proguedir();
        //devCaio.proguedir();
        //devCaio.proguedir();
        System.out.println("_");

        System.out.println("conteudos inscritos caio: " + devCaio.getConteudosInscritos());
        System.out.println("conteudos comcluidos caio: " + devCaio.getConteudosComcluidos());
        System.out.println("XP: " + devCaio.calcularTotalXp());


    }
}

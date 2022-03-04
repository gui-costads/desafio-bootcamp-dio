import com.dio.desafio.dominio.Bootcamp;
import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Dev;
import com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("curso Java");
        curso.setDescricao("Descricao: curso de java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso SQL");
        curso2.setDescricao("Curso de banco de dados");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria sobre java");
        mentoria.setDataMentoria(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp dio java");
        bootcamp.setDescricao("Java Bootcamp");
        bootcamp.getConteudosBootcamp().add(curso);
        bootcamp.getConteudosBootcamp().add(curso2);
        bootcamp.getConteudosBootcamp().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Morant");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("~Conteudos inscritos de morant" + dev1.getConteudoInscritos());
        dev1.pogredir();
        System.out.println("/Conteudos concluidos  de morant" + dev1.getConteudosConcluidos());
        dev1.pogredir();
        System.out.println("---Conteudos concluidos  de morant" + dev1.getConteudosConcluidos());
        System.out.println("XP acumulada: " +dev1.calcularTotalXp());
        System.out.println(" ");

        Dev dev2 = new Dev();
        dev2.setNome("Jason");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("~Conteudos inscritos de jason" + dev2.getConteudoInscritos());
        dev2.pogredir();
        System.out.println("/Conteudos concluidos de jason" + dev2.getConteudosConcluidos());
        dev2.pogredir();
        System.out.println("---Conteudos concluidos de jason" + dev2.getConteudosConcluidos());
        dev2.pogredir();
        System.out.println("Conteudos concluidos de jason" + dev2.getConteudosConcluidos());
        System.out.println("XP acumulada: " +dev2.calcularTotalXp());

    }
}

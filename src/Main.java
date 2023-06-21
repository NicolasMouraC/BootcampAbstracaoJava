import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

import org.dio.desafio.*;



public class Main {
    public static void main(String[] args) {
        Conteudo mentoria = new Mentoria(LocalDate.now(), "Mentoria", "Mentoria");
        Conteudo curso = new Curso(76d, "Curso", "Curso");
        Bootcamp bootcamp = new Bootcamp("Bootcamp", "Bootcamp");
        Set<Conteudo> bootcampSet = new LinkedHashSet<>();
        Dev dev = new Dev("Dev");
        
        System.out.println("Total de XP: " + dev.calcularTotalXP());

        bootcampSet.add(curso);
        bootcampSet.add(mentoria);

        bootcamp.setConteudos(bootcampSet);

        dev.inscreverEmConteudo(bootcamp);
        dev.progredir();

        System.out.println("Bootcamp concluído!\n" + "Total de XP: " + dev.calcularTotalXP());

        dev.progredir();
    }
}

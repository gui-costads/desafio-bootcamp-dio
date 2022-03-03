import com.dio.desafio.dominio.Curso;
import com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();

        curso.setTitulo("curso Java");
        curso.setDescricao("Descricao: curso de java");
        curso.setCargaHoraria(8);
        curso.calcularXp();

    }
}

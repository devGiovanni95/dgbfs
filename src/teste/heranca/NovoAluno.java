package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno2;
import modelo.heranca.AlunoBolsista2;

public class NovoAluno {
    public static void main(String[] args) {
        DAO<Aluno2> alunoDAO = new DAO<>();

        Aluno2 aluno1 = new Aluno2(124L,"Maria");
        AlunoBolsista2 aluno2 = new AlunoBolsista2(348L, "Diego", 100);

        alunoDAO.incluirAtomico(aluno1);
        alunoDAO.incluirAtomico(aluno2);

        alunoDAO.fechar();
    }
}

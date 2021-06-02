import models.Alunos;
import models.Avaliacao;
import models.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaResposta {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Alunos alunos = entityManager.find(Alunos.class, 1);
        Resposta resposta = entityManager.find(Resposta.class, 1);
        Avaliacao avaliacao = entityManager.find(Avaliacao.class, 1);

        System.out.println(alunos.getNome()+" respondeu a seguinte resposta " + resposta.getResposta()+" na avaliação de tipo "+ avaliacao.getTitulo());

        entityManager.close();
        entityManagerFactory.close();
    }
}

import models.Alunos;
import models.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BuscaAvaliacao {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Alunos alunos = entityManager.find(Alunos.class, 1);
        Avaliacao avaliacao = entityManager.find(Avaliacao.class, 1);

        System.out.println(alunos.getNome()+" respondeu a avaliação do tipo " + avaliacao.getTitulo());

        entityManager.close();
        entityManagerFactory.close();
    }
}


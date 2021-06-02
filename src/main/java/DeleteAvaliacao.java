import models.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteAvaliacao {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Avaliacao avaliacao = entityManager.find(Avaliacao.class, 7);

        entityManager.getTransaction().begin();
        entityManager.remove(avaliacao);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}

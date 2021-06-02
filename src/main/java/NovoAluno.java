import models.Alunos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoAluno {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();


        Alunos alunos = new Alunos();
        alunos.setEmail("teste@zup.com.,br");
        alunos.setNome("Zezinho");
        alunos.setIdade(12);

        entityManager.getTransaction().begin();
        entityManager.persist(alunos);
        entityManager.getTransaction().commit();

        entityManager.close();
        entityManagerFactory.close();
    }
}

import models.Alunos;
import models.Avaliacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovaAvaliacao {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Alunos aluno = entityManager.find(Alunos.class, 1);

        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setTitulo("Titulo1");
        avaliacao.setDescricao("Esta é uma descrição");
        avaliacao.setAlunos(aluno);

        entityManager.getTransaction().begin();

        entityManager.merge(aluno);
        entityManager.persist(avaliacao);

        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }
}

import models.Alunos;
import models.Avaliacao;
import models.Correcao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovaCorrecao {

    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Alunos aluno = entityManager.find(Alunos.class, 1);
        Avaliacao avaliacao = entityManager.find(Avaliacao.class, 1);


        Correcao correcao = new Correcao();
        correcao.setNota(5);
        correcao.setAlunos(aluno);
        correcao.setAvaliacao(avaliacao);

        entityManager.getTransaction().begin();

        entityManager.merge(aluno);
        entityManager.merge(avaliacao);
        entityManager.persist(correcao);

        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }
}

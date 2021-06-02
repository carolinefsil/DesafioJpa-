import models.Alunos;
import models.Avaliacao;
import models.Correcao;
import models.Resposta;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovaResposta {
    public static void main(String... args) {
        EntityManagerFactory entityManagerFactory
                = Persistence.createEntityManagerFactory("models.Alunos-PU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Alunos aluno = entityManager.find(Alunos.class, 1);
        Avaliacao avaliacao = entityManager.find(Avaliacao.class, 1);


        Resposta resposta = new Resposta();
        resposta.setResposta("Está é uma resposta");
        resposta.setAlunos(aluno);
        resposta.setAvaliacao(avaliacao);

        entityManager.getTransaction().begin();

        entityManager.merge(aluno);
        entityManager.merge(avaliacao);
        entityManager.persist(resposta);

        entityManager.getTransaction().commit();


        entityManager.close();
        entityManagerFactory.close();
    }
}

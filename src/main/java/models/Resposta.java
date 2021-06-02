package models;

import javax.persistence.*;

@Entity
@Table
public class Resposta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idResposta;

    private String resposta;

    @ManyToOne
    private Alunos alunos;

    @ManyToOne
    private Avaliacao avaliacao;

    public Integer getIdCresposta() {
        return idResposta;
    }

    public void setIdCresposta(Integer idCresposta) {
        this.idResposta = idCresposta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public Alunos getAlunos() {
        return alunos;
    }

    public void setAlunos(Alunos alunos) {
        this.alunos = alunos;
    }

    public Avaliacao getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao) {
        this.avaliacao = avaliacao;
    }
}

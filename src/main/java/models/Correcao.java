package models;

import javax.persistence.*;

@Entity
@Table
public class Correcao {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCorrecao;

    private Integer nota;

    @OneToOne
    private Alunos alunos;

    @OneToOne
    private Avaliacao avaliacao;

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

    public Integer getIdCorrecao() {
        return idCorrecao;
    }

    public void setIdCorrecao(Integer idCorrecao) {
        this.idCorrecao = idCorrecao;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }


}
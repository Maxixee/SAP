package br.com.ifba.aluno.model;

import br.com.ifba.pessoa.model.Pessoa;
import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Component;


@Entity
@Table(name = "aluno")
@Data
@EqualsAndHashCode(callSuper = false)
@Component
public class Aluno extends Pessoa{
    
//    @NotNull // faz a validação na service
//    @Column( nullable = false ) // cria esse campo no banco de dados como not null
    private String matricula;
    
//    @NotNull // faz a validação na service
//    @Column( nullable = false ) // cria esse campo no banco de dados como not null
    private String nomeResponsavel;
    
    /* @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "turma_id", referencedColumnName = "ID")
    private Turma turma;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "status_id", referencedColumnName = "ID")
    private StatusAluno statusAluno;
    */
}


package br.com.ifba.listadeespera.model;

import br.com.ifba.agendamento.model.Agendamento;
import br.com.ifba.infrastructure.model.PersistenceEntity;
import br.com.ifba.paciente.model.Paciente;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(basePackages = "br.com.ifba.listadeespera.model")

/**
 *
 * @author riaan
 */
@Entity
@Data
@Table(name = "lista_de_espera")
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)

public  class ListaDeEspera extends PersistenceEntity implements Serializable {

    public static void add(Agendamento agendamento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Transient
    @JoinColumn
    @OneToOne 
    
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    Paciente paciente;
    
  

    
}

package dev.luanfernandes.maquinas.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_maquinas")
public class Maquinas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int pat;

    @Column
    private int chamado;

    @Column
    private String laudo;

    @Column
    private String setor;

    @Temporal(TemporalType.DATE)
    private Date entrada;
}

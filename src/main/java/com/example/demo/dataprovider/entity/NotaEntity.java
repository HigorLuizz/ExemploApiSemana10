package com.example.demo.dataprovider.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="nota")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NotaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String titulo;
    @Column
    private String nota;
    @Column
    private LocalDateTime dataCriacao;

}

package com.exemplo.crudbackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Data.*;

@Entity
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String email;

}

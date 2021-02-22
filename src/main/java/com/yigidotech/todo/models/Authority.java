package com.yigidotech.todo.models;

import javax.persistence.*;
import java.sql.Time;
import java.util.Date;

@Entity()
@Table(name = "authority", schema = "todo")
public class Authority {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE
    )
    @SequenceGenerator(
            name = "generator",
            sequenceName = "authority_id_seq"
    )
    public Long id;

}

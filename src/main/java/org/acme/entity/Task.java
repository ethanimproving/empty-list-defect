package org.acme.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="task")
public class Task {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column
    private Long taskId;

    @Column
    private String name;
}

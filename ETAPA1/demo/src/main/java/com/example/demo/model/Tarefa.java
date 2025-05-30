package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Tarefa {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String titulo;
private String descricao;
private boolean concluida;

//getters e setters
public Long getId() {return id;}
public void setId(long id) {this.id = id;}

public String getTitulo() {return titulo;}
public void setTitulo(String titulo) {this.titulo = titulo;}

public String getDescricao() {return descricao;}
public void setDescricao(String descricao) {this.descricao = descricao;}    

public boolean isConcluida() {return concluida;}
public void setConcluida(boolean concluida) {this.concluida = concluida;}



}
package com.example.demo.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Tarefa;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    // Aqui você pode adicionar métodos personalizados, se necessário
    // Por exemplo, para encontrar tarefas por título:
    // List<Tarefa> findByTitulo(String titulo);
}


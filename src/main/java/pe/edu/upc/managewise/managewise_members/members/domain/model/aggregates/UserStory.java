package pe.edu.upc.managewise.managewise_members.members.domain.model.aggregates;

import jakarta.persistence.*;
import lombok.Getter;
import pe.edu.upc.managewise.managewise_members.members.domain.model.valueobjects.StatusHU;
import pe.edu.upc.managewise.managewise_members.shared.domain.model.aggregates.AuditableAbstractAggregateRoot;

import java.time.LocalDate;

@Entity
@Table(name = "user_stories")
public class UserStory extends AuditableAbstractAggregateRoot<UserStory> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private Long id; // ID del User Story

    @Column(nullable = false)
    private String title; // Título del User Story

    @Column(nullable = false)
    private String description; // Descripción del User Story

    @Column(nullable = false)
    private int effort; // Valor que representa el esfuerzo

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusHU status; // Estado del User Story

    @Column(nullable = false)
    private LocalDate startDate; // Fecha de inicio

    @Column(nullable = false)
    private LocalDate endDate; // Fecha de fin

    // Constructor por defecto
    public UserStory() {}

    // Constructor que permite crear un User Story
    public UserStory(String title, String description, int effort, StatusHU status, LocalDate startDate, LocalDate endDate) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("Title cannot be null or blank");
        }
        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be null or blank");
        }
        if (effort < 0) {
            throw new IllegalArgumentException("Effort cannot be negative");
        }
        this.title = title;
        this.description = description;
        this.effort = effort;
        this.status = status;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getEffort() {
        return effort;
    }

    public StatusHU getStatus() {
        return status;
    }

    public LocalDate getStartDate() {
        return startDate; // Este método debe estar presente
    }

    public LocalDate getEndDate() {
        return endDate; // Este método debe estar presente
    }

    // Método para obtener el ID del Sprint asociado (ajusta según tus necesidades)
    public Long getSprintId() {
        // Retorna el ID del Sprint asociado, si lo tienes
        return null; // Cambia esto según la implementación del Sprint
    }
}

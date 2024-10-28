package pe.edu.upc.managewise.managewise_members.members.domain.model.queries;

import pe.edu.upc.managewise.managewise_members.members.domain.model.valueobjects.StatusHU;

import java.time.LocalDate;

public record GetUserStoryWithStatusWithEffort(
        Long id, // ID del User Story
        String title, // Título del User Story
        String description, // Descripción del User Story
        StatusHU status, // Estado del User Story
        int effort, // Valor que representa el esfuerzo
        LocalDate startDate, // Fecha de inicio
        LocalDate endDate
) {
    // Puedes añadir aquí métodos adicionales si es necesario
}

package pe.edu.upc.managewise.managewise_members.members.domain.model.valueobjects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Sprint {

    @Column(name = "id", nullable = false)
    private final Long id; // ID del Sprint

    // Constructor por defecto
    public Sprint() {
        this.id = null;
    }

    // Constructor que incluye validación
    public Sprint(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null");
        }
        this.id = id;
    }

    // Getters
    public Long getId() {
        return id;
    }
}

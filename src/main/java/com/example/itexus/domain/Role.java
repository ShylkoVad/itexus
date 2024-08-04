package com.example.itexus.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
@EqualsAndHashCode(callSuper = true)
public class Role extends BaseEntity {

    @Column(nullable = false, unique = true, name = "name")
    @NotNull(message = "Имя роли не может быть пустым")
    private String name;
}

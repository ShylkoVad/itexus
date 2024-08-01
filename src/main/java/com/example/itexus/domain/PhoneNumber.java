package com.example.itexus.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "phone_numbers")
public class PhoneNumber extends BaseEntity {
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;

    @Column(name = "phone_number", nullable = false)
    @Pattern(regexp = "^375\\d{9}$", message = "Телефон должен иметь формат 375*********")
    private String phoneNumber;

}

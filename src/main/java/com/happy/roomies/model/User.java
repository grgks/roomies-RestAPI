package com.happy.roomies.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class User extends AbstractEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "key_loak_id", unique = true, nullable = false)
    private String keyloakId;

    @NotBlank
    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @ColumnDefault("true")
    @Column(name = "is_active")
    private Boolean isActive = true;

}

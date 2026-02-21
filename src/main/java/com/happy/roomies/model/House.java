package com.happy.roomies.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;


@Entity
@Table(name = "houses")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@DynamicInsert
public class House extends AbstractEntity {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "address", nullable = false)
    private String address;

    @NotBlank
    @Column(name = "address_number", nullable = false)
    private String addressNumber;

    @NotBlank
    @Column(name = "apartment", nullable = false)
    private String apartment;


    @Column(name = "number_of_rooms")
    private Long numOfRooms;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner;
}

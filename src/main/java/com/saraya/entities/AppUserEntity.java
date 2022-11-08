package com.saraya.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false,length = 100)
    private String nom;
    @Column(nullable = false,length = 100)
    private String prenom;
    @Column(unique = true,nullable = false,length = 100)
    private String email;
    @Column(unique = true,nullable = false,length = 100)
    private String password;
    private int etat;
    @ManyToMany
    private List<AppRolesEntity> appRoles;

    @OneToMany(mappedBy = "appUsers")
    private List<ProduitEntity> produits;
}

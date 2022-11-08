package com.saraya.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.NotNull;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AppUserDto {

    private int id;
    @NotNull(message = "le nom ne doit pas etre null")
    private String nom;
    @NotNull(message = "le prenom ne doit pas etre null")
    private String prenom;
    @NotNull(message = "l'email ne doit pas etre null")
    private String email;
    @NotNull(message = "le mot de passe  ne doit pas etre null")
    private String password;
    @NotNull
    private int etat;

}

package com.saraya.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotNull;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProduitDto {


    private int id;
    @NotNull(message = "le prenom ne doit pas etre null")
    private String nom;
    @NotNull
    private double qtStock;

}

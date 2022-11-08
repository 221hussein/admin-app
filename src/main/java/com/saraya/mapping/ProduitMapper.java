package com.saraya.mapping;


import com.saraya.dto.ProduitDto;
import com.saraya.entities.ProduitEntity;
import org.mapstruct.Mapper;

@Mapper
public interface ProduitMapper {
    ProduitDto toProduit(ProduitEntity produitEntity);

    ProduitEntity fromProduit(ProduitDto produitDto);
}

package com.estudo.hotelSystem.Repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

@Getter
@Setter
@NoArgsConstructor
@Repository
public class ClassificacaoRepository {

    int id;
    String descricao;

}

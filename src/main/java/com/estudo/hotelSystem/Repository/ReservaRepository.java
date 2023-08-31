package com.estudo.hotelSystem.Repository;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Repository
public class ReservaRepository {
    int id;
    int codQuarto;
    int codPessoa;
    Date dataEntrada;
    Date dataSaida;
    float valorTotal;
}

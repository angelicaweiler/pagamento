package com.javanauta.pagamento.infrastructure.client;

import com.javanauta.pagamento.controller.request.CartaoRequestDTO;
import org.springframework.stereotype.Component;

@Component
public class PagamentoClient {

    public Boolean verificaCartao(CartaoRequestDTO cartaoRequestDTO) {

        if (cartaoRequestDTO.getNumeroCartao().endsWith("8080")) {
            return true;
        }
        return false;

    }
}

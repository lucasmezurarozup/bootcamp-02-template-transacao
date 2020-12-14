package br.com.zup.nossoCartao.transacao.transacao;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class ListenerTransacao {

    @KafkaListener(topics = "transacoes")
    public void ouvir(Transacao transacao) {
        System.out.println(transacao);
    }

}

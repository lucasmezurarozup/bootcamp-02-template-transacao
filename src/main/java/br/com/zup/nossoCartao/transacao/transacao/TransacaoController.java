package br.com.zup.nossoCartao.transacao.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private ListenerTransacao listenerTransacao;

    @GetMapping("/")
    public ResponseEntity<?> verificaTransacoes() {
        return null;
    }
}

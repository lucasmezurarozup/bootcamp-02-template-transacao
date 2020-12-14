package br.com.zup.nossoCartao.transacao.transacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Validated
@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;

    @GetMapping("/cartao/{id}")
    public ResponseEntity<?> verificaTransacoes(@PathVariable("id") String numeroCartao) {
        List<Transacao> transacaoList = transacaoRepository.findTop10ByCartaoId(numeroCartao);
        return ResponseEntity.ok(transacaoList);
    }
}

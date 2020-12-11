package br.com.zup.nossoCartao.transacao.transacao;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Transacao {
    @NotBlank
    private String numeroTransacao;
    @NotBlank
    private BigDecimal valor;
    @NotNull
    private Estabelecimento estabelecimento;
    @NotNull
    private Cartao cartao;

    @NotNull
    @PastOrPresent
    private LocalDateTime efetivadaEm;

}

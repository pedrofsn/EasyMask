package br.com.redcode.easymask

import android.widget.EditText
import br.com.concrete.canarinho.validator.Validador
import br.com.concrete.canarinho.watcher.CPFCNPJTextWatcher
import br.com.concrete.canarinho.watcher.MascaraNumericaTextWatcher
import br.com.concrete.canarinho.watcher.ValorMonetarioWatcher

/**
 * Created by pedrofsn on 17/10/2017.
 */

fun EditText.handleCPFandCNPJ(): CPFCNPJTextWatcher {
    val watcher = CPFCNPJTextWatcher()
    addTextChangedListener(watcher)
    return watcher
}

fun EditText.handleCPF() = addTextChangedListener(
        MascaraNumericaTextWatcher.Builder()
                .paraMascara("###.###.###-##")
                .comValidador(Validador.CPF)
                .build()
)

fun EditText.handleCNPJ() = addTextChangedListener(
        MascaraNumericaTextWatcher.Builder()
                .paraMascara("##.###.###/####-##")
                .comValidador(Validador.CNPJ)
                .build()
)

fun EditText.handleMoney(hasSymbol: Boolean = true) = addTextChangedListener(
        ValorMonetarioWatcher.Builder()
                .apply {
                    if (hasSymbol) comSimboloReal()
                }
                .comMantemZerosAoLimpar()
                .build()
)


fun EditText.handlePhone() = addTextChangedListener(
        MascaraNumericaTextWatcher.Builder()
                .paraMascara("(##) # ####-####")
                .comValidador(Validador.TELEFONE)
                .build()
)

fun EditText.handleExpirationDate() = addNumericMask("##/##")
fun EditText.handleDate() = addNumericMask("##/##/####")
fun EditText.handleCEP() = addNumericMask("#####-###")

fun EditText.addNumericMask(mask : String) {
    addTextChangedListener(
            MascaraNumericaTextWatcher.Builder()
                    .paraMascara(mask)
                    .build()
    )
}
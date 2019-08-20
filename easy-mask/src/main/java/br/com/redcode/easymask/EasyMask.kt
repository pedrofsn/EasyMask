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

fun EditText.handleCPF(): MascaraNumericaTextWatcher? {
    val watcher = MascaraNumericaTextWatcher.Builder()
        .paraMascara("###.###.###-##")
        .comValidador(Validador.CPF)
        .build()

    addTextChangedListener(watcher)

    return watcher
}

fun EditText.handleCNPJ(): MascaraNumericaTextWatcher? {
    val watcher = MascaraNumericaTextWatcher.Builder()
        .paraMascara("##.###.###/####-##")
        .comValidador(Validador.CNPJ)
        .build()

    addTextChangedListener(watcher)

    return watcher
}

fun EditText.handleMoney(hasSymbol: Boolean = true): ValorMonetarioWatcher? {
    val watcher = ValorMonetarioWatcher.Builder()
        .apply {
            if (hasSymbol) comSimboloReal()
        }
        .comMantemZerosAoLimpar()
        .build()

    addTextChangedListener(watcher)

    return watcher
}

fun EditText.handlePhone(): MascaraNumericaTextWatcher? {
    val watcher = MascaraNumericaTextWatcher.Builder()
        .paraMascara("(##) # ####-####")
        .comValidador(Validador.TELEFONE)
        .build()

    addTextChangedListener(watcher)

    return watcher
}

fun EditText.addNumericMask(mask: String): MascaraNumericaTextWatcher? {
    val watcher = MascaraNumericaTextWatcher.Builder()
        .paraMascara(mask)
        .build()

    addTextChangedListener(watcher)

    return watcher
}

fun EditText.handleExpirationDate() = addNumericMask("##/##")
fun EditText.handleDate() = addNumericMask("##/##/####")
fun EditText.handleCEP() = addNumericMask("#####-###")
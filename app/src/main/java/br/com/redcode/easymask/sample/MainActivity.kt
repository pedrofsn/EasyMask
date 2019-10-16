package br.com.redcode.easymask.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.redcode.easymask.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextDate.handleDate()
        editTextExpirationDate.handleExpirationDate()
        editTextCep.handleCEP()
        editTextPhone.handlePhone()
        editTextPhone1.handlePhone(mask = "(##) #####-####")
        editTextMoney.handleMoney()
        editTextCpfCnpj.handleCPFandCNPJ()
        editTextCpf.handleCPF()
        editTextCnpj.handleCNPJ()
    }
}

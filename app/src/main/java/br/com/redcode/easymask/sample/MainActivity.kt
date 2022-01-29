package br.com.redcode.easymask.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.redcode.easymask.handleCEP
import br.com.redcode.easymask.handleCNPJ
import br.com.redcode.easymask.handleCPF
import br.com.redcode.easymask.handleCPFandCNPJ
import br.com.redcode.easymask.handleDate
import br.com.redcode.easymask.handleExpirationDate
import br.com.redcode.easymask.handleMoney
import br.com.redcode.easymask.handlePhone
import kotlinx.android.synthetic.main.activity_main.editTextCep
import kotlinx.android.synthetic.main.activity_main.editTextCnpj
import kotlinx.android.synthetic.main.activity_main.editTextCpf
import kotlinx.android.synthetic.main.activity_main.editTextCpfCnpj
import kotlinx.android.synthetic.main.activity_main.editTextDate
import kotlinx.android.synthetic.main.activity_main.editTextExpirationDate
import kotlinx.android.synthetic.main.activity_main.editTextMoney
import kotlinx.android.synthetic.main.activity_main.editTextPhone
import kotlinx.android.synthetic.main.activity_main.editTextPhone1

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

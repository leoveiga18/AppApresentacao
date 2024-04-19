package com.example.appapresentao

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val btnReturn = findViewById<TextView>(R.id.btnReturn)
        btnReturn.setOnClickListener { retornaForm() }

        val btnEnviar = findViewById<Button>(R.id.buttonEnviar)
        btnEnviar.setOnClickListener { envia() }
    }

    private fun retornaForm() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun envia() {
        val mensagemEditText = findViewById<EditText>(R.id.mensagem)
        val mensagem = mensagemEditText.text.toString()

        if (mensagem.isEmpty()) {
            exibirMensagem("Por favor, insira uma mensagem.")
        } else {
            exibirMensagem("Mensagem enviada com sucesso!")
        }
    }

    private fun exibirMensagem(mensagem: String) {
        Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
    }
}

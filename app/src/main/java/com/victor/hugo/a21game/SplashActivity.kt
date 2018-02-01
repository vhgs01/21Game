package com.victor.hugo.a21game

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    // Exemplo de findViewById lateinit var ivLogo: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Exemplo de findViewById  ivLogo = findViewById(R.id.ivLogo)

        // Call da função carregar
        carregar()
    }

    // Função que anima a imagem inicial
    fun carregar() {
        // Criando uma animação
        val animacao = AnimationUtils.loadAnimation(this, R.anim.animacao_splash)

        // Caso tenha alguma animação na imagem ele limpa a mesma
        ivLogo.clearAnimation()

        // Inicia uma animação
        ivLogo.startAnimation(animacao)

        Handler().postDelayed({
            // Cria uma variável Intent, inicializa a próxima tela e finaliza a atual
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            this@SplashActivity.finish()
        }, 3000)

    }

}

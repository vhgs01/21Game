package com.victor.hugo.a21game

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import com.victor.hugo.a21game.fragments.GameFragment
import com.victor.hugo.a21game.fragments.SobreFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_jogar -> {
                trocarFragment(GameFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sobre -> {
                trocarFragment(SobreFragment())
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_sair -> {
                finish()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    fun  trocarFragment(fragment : Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trocarFragment(GameFragment())
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}

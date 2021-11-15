package com.example.p071birdland

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)




            // Text.text = фейри"Історія про хлопця який подорожує по світу з літаючим котом в пошуках прийомного батька ..."
        // Text.text = пок"Фантастична історія про хлопчика який намагається спіймати всих покемонів та стати найсильнішим тренером ..."
        // Text.text = Кафе"Ресторан заморскої кухні У кота , звичайний ресторан , але ..."
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
        // Text.text = ""
}

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val Text: TextView = findViewById(R.id.textView)
        val Img: ImageView = findViewById(R.id.imageView)
        when(item.itemId){
            R.id.Mexa1 -> {
                Text.text = "Безсмертний обладатель кода Гиасс , ранее лидер одномерного культа ..."
                Img.setImageResource(R.drawable.mexa1)
                return true
            }
            R.id.Mexa2 -> {
                Text.text = "Дія відбулася 2015р через 14 років після удару метеорита ..."
                Img.setImageResource(R.drawable.mexa2)
                return true
            }
            R.id.Mexa3 -> {
                Text.text = "Відбувається в 2039р навколо хлопчика , який отримав здатність витягати інформацію та зброю з інших людей ..."
                Img.setImageResource(R.drawable.mexa3)
                return true
            }
            R.id.Fantazy1 -> {
                Text.text = "Історія про хлопця який подорожує по світу з літаючим котом в пошуках прийомного батька ..."
                Img.setImageResource(R.drawable.fan1)
                return true
            }
            R.id.Fantazy2 -> {
                Text.text = "Фантастична історія про хлопчика який намагається спіймати всих покемонів та стати найсильнішим тренером ..."
                Img.setImageResource(R.drawable.fan2)
                return true
            }
            R.id.Fantazy3 -> {
                Text.text = "Ресторан заморскої кухні У кота , звичайний ресторан , але ..."
                Img.setImageResource(R.drawable.fan3)
                return true
            }
            R.id.Appocal1 -> {
                Text.text = "Історія про хлопця який подорожує по світу з літаючим котом в пошуках прийомного батька ..."
                Img.setImageResource(R.drawable.ap1)
                return true
            }
            R.id.Appocal2 -> {
                Text.text = "Фантастична історія про хлопчика який намагається спіймати всих покемонів та стати найсильнішим тренером ..."
                Img.setImageResource(R.drawable.ap2)
                return true
            }
            R.id.Appocal3 -> {
                Text.text = "Ресторан заморскої кухні У кота , звичайний ресторан , але ..."
                Img.setImageResource(R.drawable.app3)
                return true
            }
            R.id.Horor1 -> {
                Text.text = "Безсмертний обладатель кода Гиасс , ранее лидер одномерного культа ..."
                Img.setImageResource(R.drawable.film1)
                return true
            }
            R.id.Horor2 -> {
                Text.text = "Дія відбулася 2015р через 14 років після удару метеорита ..."
                Img.setImageResource(R.drawable.film2)
                return true
            }
            R.id.Horor3 -> {
                Text.text = "Відбувається в 2039р навколо хлопчика , який отримав здатність витягати інформацію та зброю з інших людей ..."
                Img.setImageResource(R.drawable.film3)
                return true
            }
            R.id.Comedy1 -> {
                Text.text = "Історія про хлопця який подорожує по світу з літаючим котом в пошуках прийомного батька ..."
                Img.setImageResource(R.drawable.film4)
                return true
            }
            R.id.Comedy2 -> {
                Text.text = "Фантастична історія про хлопчика який намагається спіймати всих покемонів та стати найсильнішим тренером ..."
                Img.setImageResource(R.drawable.film5)
                return true
            }
            R.id.Comedy3 -> {
                Text.text = "Ресторан заморскої кухні У кота , звичайний ресторан , але ..."
                Img.setImageResource(R.drawable.film6)
                return true
            }
            R.id.App1 -> {
                Text.text = "Історія про хлопця який подорожує по світу з літаючим котом в пошуках прийомного батька ..."
                Img.setImageResource(R.drawable.film7)
                return true
            }
            R.id.App2 -> {
                Text.text = "Фантастична історія про хлопчика який намагається спіймати всих покемонів та стати найсильнішим тренером ..."
                Img.setImageResource(R.drawable.film8)
                return true
            }
            R.id.App3 -> {
                Text.text = "Ресторан заморскої кухні У кота , звичайний ресторан , але ..."
                Img.setImageResource(R.drawable.film9)
                return true
            }
        }


        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.firstmenu, menu)

        val Buttom1: RadioButton = findViewById(R.id.Buttom1)
        val Buttom2: RadioButton = findViewById(R.id.Buttom2)



        Buttom1.setOnClickListener {
            if (menu != null) {
                      menu.clear()
                 }
            menuInflater.inflate(R.menu.firstmenu, menu)


        }
        Buttom2.setOnClickListener {
            if (menu != null) {
                menu.clear()
            }
            menuInflater.inflate(R.menu.secondmenu, menu)


        }
        return true
    }

}



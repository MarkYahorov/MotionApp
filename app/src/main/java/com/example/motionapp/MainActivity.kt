package com.example.motionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recycler)

        val spares: Array<Spares> = arrayOf(
                Spares(R.drawable.dvigatel, "Dvigatel", "1000$"),
                Spares(R.drawable.rul, "Rul", "100$"),
                Spares(R.drawable.sideniya, "Sidenya", "400$"),
                Spares(R.drawable.tormoza, "Tormoza", "200$")
        )

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = SparesAdapter(spares)

    }
}
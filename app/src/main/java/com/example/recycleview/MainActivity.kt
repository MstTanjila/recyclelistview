package com.example.recycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleview.adapter.PlayerAdapter
import com.example.recycleview.databinding.ActivityMainBinding
import com.example.recycleview.model.Player

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val playerList = ArrayList<Player>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        // Adding players to the list
        playerList.add(Player("Messi", "Footballer", R.drawable.messi))
        playerList.add(Player("Ronaldo", "Footballer", R.drawable.ronaldo))
        playerList.add(Player("Neymar", "Footballer", R.drawable.neymar))
        playerList.add(Player("Ozil", "Footballer", R.drawable.ozil))
        playerList.add(Player("Kdb", "Footballer", R.drawable.kdb))
        playerList.add(Player("Rodri", "Footballer", R.drawable.rodri))
        playerList.add(Player("Alba", "Footballer", R.drawable.alba))
        playerList.add(Player("Romero", "Footballer", R.drawable.romero))
        playerList.add(Player("Ramos", "Footballer", R.drawable.ramos))
        playerList.add(Player("Dani Alves", "Footballer", R.drawable.alves))
        playerList.add(Player("Casilas", "Footballer", R.drawable.casilas))

        // Setting up the adapter
        val playerAdapter = PlayerAdapter(playerList)
        binding.recyclerView.adapter = playerAdapter
    }
}

package com.example.recycleview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycleview.databinding.ItemListBinding
import com.example.recycleview.model.Player

class PlayerAdapter(private val playerList: ArrayList<Player>) : RecyclerView.Adapter<PlayerAdapter.PlayerViewHolder>() {

    // ViewHolder class
    class PlayerViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlayerViewHolder {
        val binding = ItemListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PlayerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return playerList.size
    }

    override fun onBindViewHolder(holder: PlayerViewHolder, position: Int) {
        val player = playerList[position]

        // Binding data to the UI components
        holder.binding.apply {
            profileName.text = player.name
            profileDescription.text = player.playerDescription
            profileImage.setImageResource(player.playerImage)
        }
    }
}

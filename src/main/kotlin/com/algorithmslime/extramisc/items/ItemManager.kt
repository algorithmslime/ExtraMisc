package com.algorithmslime.extramisc.items

import com.algorithmslime.extramisc.Vars
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ItemManager {
    private val items = listOf<EMItem>()
    private val fuels = listOf<FuelItem>(TinyCoal())

    fun registerItems() {
        for (item in this.items) {
            this.registerItem(item.getItem(), item.getName())
        }
    }

    private fun registerItem(item: Item, name: String): Item {
        return Registry.register(Registry.ITEM, Identifier(Vars().MOD_ID, name), item)
    }

    fun registerFuels() {
        for (fuel in this.fuels) {
            this.registerFuel(fuel.getItem(), fuel.getName(), fuel.getDuration())
        }
    }

    private fun registerFuel(item: Item, name: String, duration: Int) {
        val registry: FuelRegistry = FuelRegistry.INSTANCE

        registry.add(
            this.registerItem(item, name), duration
        )
    }
}
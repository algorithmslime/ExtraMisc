package com.algorithmslime.extramisc.items

import com.algorithmslime.extramisc.Vars
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.item.Item
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ItemManager {
    private val items = listOf<com.algorithmslime.extramisc.items.Item>()
    private val fuels = listOf<FuelItem>(TinyCoal())

    fun registerItems() {
        for (item in this.items) {
            this.registerItem(item.getItem(), item.getName())
        }
    }

    fun registerFuels() {
        for (fuel in this.fuels) {
            this.registerFuel(fuel, fuel.getDuration())
        }
    }

    private fun registerItem(item: Item, name: String) {
        Registry.register(Registry.ITEM, Identifier(Vars().MOD_ID, name), item)
    }

    private fun registerFuel(item: com.algorithmslime.extramisc.items.Item, duration: Int) {
        val registry: FuelRegistry = FuelRegistry.INSTANCE

        registry.add(
            Registry.register(Registry.ITEM, Identifier(Vars().MOD_ID, item.getName()), item.getItem()),
            duration
        )
    }
}
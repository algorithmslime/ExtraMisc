package com.algorithmslime.extramisc

import com.algorithmslime.extramisc.items.ItemManager
import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.fabricmc.fabric.api.registry.FuelRegistry
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup
import net.minecraft.util.Identifier
import net.minecraft.util.registry.Registry

class ExtraMisc: ModInitializer {
    private val itemManager: ItemManager = ItemManager()

    override fun onInitialize() {
        itemManager.registerItems()
        itemManager.registerFuels()
    }
}
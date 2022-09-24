package com.algorithmslime.extramisc.items

import net.fabricmc.fabric.api.item.v1.FabricItemSettings
import net.minecraft.item.Item
import net.minecraft.item.ItemGroup

class TinyCoal: FuelItem() {
    private val name: String = "tiny_coal"
    private val duration: Int = 200;

    override fun getItem(): Item {
        return Item(FabricItemSettings().group(ItemGroup.MISC))
    }

    override fun getName(): String {
        return this.name
    }

    override fun getDuration(): Int {
        return this.duration;
    }
}
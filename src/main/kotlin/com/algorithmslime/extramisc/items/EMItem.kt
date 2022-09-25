package com.algorithmslime.extramisc.items

import net.minecraft.item.Item

abstract class EMItem {
    /**
     * Get item
     */
    abstract fun getItem(): Item

    /**
     * Get item name
     */
    abstract fun getName(): String
}
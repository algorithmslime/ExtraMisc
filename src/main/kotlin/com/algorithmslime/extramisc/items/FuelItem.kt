package com.algorithmslime.extramisc.items


abstract class FuelItem : Item() {
    abstract fun getDuration(): Int
}
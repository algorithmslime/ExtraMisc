package com.algorithmslime.extramisc.items


abstract class FuelItem : EMItem() {
    abstract fun getDuration(): Int
}
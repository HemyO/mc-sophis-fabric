@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package hm.o.sph.init.item

import hm.o.sph.init.item.Groups.EQUIPMENT
import hm.o.sph.init.item.Groups.MATERIAL
import hm.o.sph.init.item.Groups.UNDEF

object Categories {

    val TEMP = Category(UNDEF, "undef")

    val ORE = Category(MATERIAL, "ore")
    val ROCK = Category(MATERIAL, "rock")
    val WOOD = Category(MATERIAL, "wood")
    val SKIN = Category(MATERIAL, "skin")
    val PLANT = Category(MATERIAL, "plant")
    val ORGAN = Category(MATERIAL, "organ")
    val MIND = Category(MATERIAL, "mind")
    val AROMA = Category(MATERIAL, "aroma")
    val FLUID = Category(MATERIAL, "fluid")

    val WEAPON = Category(EQUIPMENT, "weapon")
    val OFFHAND = Category(EQUIPMENT, "offhand")
    val HELMET = Category(EQUIPMENT, "helmet")
    val BODY = Category(EQUIPMENT, "body")
    val BELT = Category(EQUIPMENT, "belt")
    val GLOVES = Category(EQUIPMENT, "gloves")
    val BOOTS = Category(EQUIPMENT, "boots")
    val RING = Category(EQUIPMENT, "ring")
    val AMULET = Category(EQUIPMENT, "amulet")
    val BOOKMARK = Category(EQUIPMENT, "bookmark")

    val all = arrayOf(
        TEMP,
        ORE, ROCK, WOOD, SKIN, PLANT, ORGAN, MIND, AROMA, FLUID,
        WEAPON, OFFHAND, HELMET, BODY, BELT, GLOVES, BOOTS, RING, AMULET, BOOKMARK
    )

    val values = all.clone()

    fun valueOf(name: String): Category {
        for(value in values) {
            if (name == value.name) return value
        }
        throw IllegalArgumentException("Wrong identifier \"${name}\" to check category.")
    }
}
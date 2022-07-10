@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package hm.o.sph.init.item

import hm.o.sph.init.item.SophisGroups.EQUIPMENT
import hm.o.sph.init.item.SophisGroups.MATERIAL
import hm.o.sph.init.item.SophisGroups.UNDEF

object SophisCategories {

    val TEMP = SophisCategory(UNDEF, "undef")
    val VANILLA = SophisCategory(UNDEF, "vanilla")

    val ORE = SophisCategory(MATERIAL, "ore")
    val ROCK = SophisCategory(MATERIAL, "rock")
    val WOOD = SophisCategory(MATERIAL, "wood")
    val SKIN = SophisCategory(MATERIAL, "skin")
    val PLANT = SophisCategory(MATERIAL, "plant")
    val ORGAN = SophisCategory(MATERIAL, "organ")
    val MIND = SophisCategory(MATERIAL, "mind")
    val AROMA = SophisCategory(MATERIAL, "aroma")
    val FLUID = SophisCategory(MATERIAL, "fluid")

    val WEAPON = SophisCategory(EQUIPMENT, "weapon")
    val OFFHAND = SophisCategory(EQUIPMENT, "offhand")
    val HELMET = SophisCategory(EQUIPMENT, "helmet")
    val BODY = SophisCategory(EQUIPMENT, "body")
    val BELT = SophisCategory(EQUIPMENT, "belt")
    val GLOVES = SophisCategory(EQUIPMENT, "gloves")
    val BOOTS = SophisCategory(EQUIPMENT, "boots")
    val RING = SophisCategory(EQUIPMENT, "ring")
    val AMULET = SophisCategory(EQUIPMENT, "amulet")
    val BOOKMARK = SophisCategory(EQUIPMENT, "bookmark")

    val all = arrayOf(
        TEMP, VANILLA,
        ORE, ROCK, WOOD, SKIN, PLANT, ORGAN, MIND, AROMA, FLUID,
        WEAPON, OFFHAND, HELMET, BODY, BELT, GLOVES, BOOTS, RING, AMULET, BOOKMARK
    )

    val values = all.clone()

    fun valueOf(name: String): SophisCategory {
        for(value in values) {
            if (name == value.id) return value
        }
        throw IllegalArgumentException("Wrong identifier \"${name}\" to check category.")
    }
}
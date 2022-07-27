package hm.o.sph.util

import java.util.regex.Pattern

data class CharacterChecker(val value: Char) {
    override fun toString(): String {
        return value.toString()
    }
    companion object Of {
        val hasCJK = { string: String ->
            val isCJK = Pattern.compile("[\\p{IsHan}\\p{IsHangul}\\p{IsKatakana}\\p{IsHiragana}]")
            isCJK.matcher(string).find()
        }
    }
}
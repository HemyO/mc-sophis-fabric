package hm.o.sph.util

import java.util.regex.Pattern

data class CharacterChecker(val value: Char) {
    override fun toString(): String {
        return value.toString()
    }

    /**
     * `SpecialChar.Of` defines different special characters, which are space, asian punctuations, etc.
     *
     * According to NAVER and 한마포, Hangul use semi-width punctuation (which is similar to Latin's) in general.
     * So Hangul and English use the same punctuation rule.
     *
     * **If there' re other requests that need to add the full-width version, or there' re wrong information,
     * please report the issue to me.**
     *
     * @property LATIN_SPACE It' s a semi-width space that uses on **EN** and **KR**.
     * @property CJ_SPACE It' s a full-width space that uses on **ZH** and **JP**.
     * @property isSpaceChar This predicate the character is space or not.
     * @property ZH_COMMA It' s equal to '，' that use on **ZH**.
     * @property CJ_COMMA It' s equal to '、' that use on **ZH** and **JP**.
     * @property CJ_STOP It' s equal to '。' that use on **ZH** and **JP**.
     * @property FW_COLON It' s equal to full-width colon '：' that use on **ZH** and **JP**.
     * @property FW_SEMICOLON It' s equal to full-width '；' semicolon that use on **ZH** and **JP**.
     * @property ELLIPSIS It' s equal to general to ellipsis '…' but not '⋯' because of the display in Minecraft that use on **ZH** and **JP**.
     * @property EM_DASH It 's equal to Em Dash '—'.
     * @property FW_DASH It' s equal to full-width tilde '～' which is the another style to dash in **ZH**.
     * @property JP_DASH It' s similar to full-width tilde '〜' which is a dash in **JP**.
     * @property ZH_INTERPUNCT It' s '·' which is not a full-width middle dot.
     * @property ZH_FW_INTERPUNCT It' s full-width full stop '．' which not formal usage, but I suggest writer use this instead the semi-width one. You can use full-width mode to type dot '.' to get this char.
     * @property JP_INTERPUNCT It' s japanese middle dot '・' which is similar to full-width middle dot.
     * @property JP_DOUBLE_HYPHEN It' s japanese double hyphen '゠' which do similar things to interpunct.
     * @property FW_DOUBLE_HYPHEN It' s full-width double hyphen '＝' which is similar to japanese double hyphen.
     * @property FW_QUESTION_MARK It' s full-width question mark '？' that use on **ZH** and **JP**.
     * @property FW_EXCLAMATION_MARK It' s full-width exclamation mark '！' that use on **ZH** and **JP**.
     */
    companion object Of {
        val LATIN_SPACE = CharacterChecker('\u0020')
        val CJ_SPACE = CharacterChecker('\u3000')
        val isSpaceChar = { char: Char ->
            when (char) {
                LATIN_SPACE.value, CJ_SPACE.value -> true
                else -> false
            }
        }

        val lastPlacedCharLs = {
            val tmp = mutableListOf<Char>()
            LATIN_SPACE joinTo tmp
            CJ_SPACE joinTo tmp
            ZH_COMMA joinTo tmp
            CJ_COMMA joinTo tmp
            CJ_STOP joinTo tmp
            FW_COLON joinTo tmp
            FW_SEMICOLON joinTo tmp
            ELLIPSIS joinTo tmp
            EM_DASH joinTo tmp
            FW_DASH joinTo tmp
            JP_DASH joinTo tmp
            ZH_INTERPUNCT joinTo tmp
            ZH_FW_INTERPUNCT joinTo tmp
            JP_INTERPUNCT joinTo tmp
            JP_DOUBLE_HYPHEN joinTo tmp
            FW_DOUBLE_HYPHEN joinTo tmp
            FW_QUESTION_MARK joinTo tmp
            FW_EXCLAMATION_MARK joinTo tmp
            tmp.toList()
        }

        private infix fun CharacterChecker.joinTo(list: MutableList<Char>) {
            list += this.value
        }

        val ZH_COMMA = CharacterChecker('\uFF0C')
        val CJ_COMMA = CharacterChecker('\u3001')
        val CJ_STOP = CharacterChecker('\u3002')
        val FW_COLON = CharacterChecker('\uFF1A')
        val FW_SEMICOLON = CharacterChecker('\uFF1B')
        val ELLIPSIS = CharacterChecker('\u2026')
        val EM_DASH = CharacterChecker('\u2014')
        val FW_DASH = CharacterChecker('\uFF5E')
        val JP_DASH = CharacterChecker('\u301C')
        val ZH_INTERPUNCT = CharacterChecker('\u00B7')
        val ZH_FW_INTERPUNCT = CharacterChecker('\uFF0E')
        val JP_INTERPUNCT = CharacterChecker('\u30FB')
        val JP_DOUBLE_HYPHEN = CharacterChecker('\u30A0')
        val FW_DOUBLE_HYPHEN = CharacterChecker('\uFF1D')
        val FW_QUESTION_MARK = CharacterChecker('\uFF1F')
        val FW_EXCLAMATION_MARK = CharacterChecker('\uFF01')

        val hasCJK = { string: String ->
            val isCJK = Pattern.compile("[\\p{IsHan}\\p{IsHangul}\\p{IsKatakana}\\p{IsHiragana}]")
            isCJK.matcher(string).find()
        }
    }
}
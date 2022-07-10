package hm.o.sph.util

data class SpecialChar(val value: Char) {
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
        val LATIN_SPACE = SpecialChar('\u0020')
        val CJ_SPACE = SpecialChar('\u3000')
        val isSpaceChar = { tip: Char ->
            when (tip) {
                LATIN_SPACE.value, CJ_SPACE.value -> true
                else -> false
            }
        }
        val ZH_COMMA = SpecialChar('\uFF0C')
        val CJ_COMMA = SpecialChar('\u3001')
        val CJ_STOP = SpecialChar('\u3002')
        val FW_COLON = SpecialChar('\uFF1A')
        val FW_SEMICOLON = SpecialChar('\uFF1B')
        val ELLIPSIS = SpecialChar('\u2026')
        val EM_DASH = SpecialChar('\u2014')
        val FW_DASH = SpecialChar('\uFF5E')
        val JP_DASH = SpecialChar('\u301C')
        val ZH_INTERPUNCT = SpecialChar('\u00B7')
        val ZH_FW_INTERPUNCT = SpecialChar('\uFF0E')
        val JP_INTERPUNCT = SpecialChar('\u30FB')
        val JP_DOUBLE_HYPHEN = SpecialChar('\u30A0')
        val FW_DOUBLE_HYPHEN = SpecialChar('\uFF1D')
        val FW_QUESTION_MARK = SpecialChar('\uFF1F')
        val FW_EXCLAMATION_MARK = SpecialChar('\uFF01')
        val isLastPlacedPunctuation = { tip: Char ->
            when(tip) {
                ZH_COMMA.value, CJ_COMMA.value, CJ_STOP.value, FW_COLON.value, FW_SEMICOLON.value, ELLIPSIS.value,
                EM_DASH.value, FW_DASH.value, JP_DASH.value, ZH_INTERPUNCT.value, ZH_FW_INTERPUNCT.value,
                JP_INTERPUNCT.value, JP_DOUBLE_HYPHEN.value, FW_DOUBLE_HYPHEN.value, FW_QUESTION_MARK.value,
                FW_EXCLAMATION_MARK.value -> true
                else -> false
            }
        }
    }
}
package hm.o.sph.init.attr

import hm.o.sph.init.util.Tier

data class ImprintSeries(val name: String, val fst: Tier, val sec: Tier) {
    val tierRange: Pair<Tier,Tier> by lazy {
        if (fst.tierInt == sec.tierInt) Pair(fst, fst)
        else Pair(
            if (fst.tierInt < sec.tierInt) fst else sec,
            if (fst.tierInt < sec.tierInt) sec else fst
        )
    }
}
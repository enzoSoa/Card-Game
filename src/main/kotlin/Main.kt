import types.Rareness
import types.TANK

fun main() {
    val hero = Hero("Arthur", TANK(), Rareness.Legendary)
    println(hero.infos())
}
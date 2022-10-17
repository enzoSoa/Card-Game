package types

sealed class Specialty(private val name: String,
                       val healthPoint: Int,
                       val strength: Int,
                       val armor: Int) {
    override fun toString(): String = name
}

class TANK: Specialty("Tank",1000, 100, 20)
class MURDERER: Specialty("Murderer",800, 200, 5)
class MAGE: Specialty("Mage",700,150,10)
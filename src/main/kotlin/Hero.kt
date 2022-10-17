import types.Rareness
import types.Specialty

class Hero(private val name: String,
           private val specialty: Specialty,
           private val rareness: Rareness) {
    private val healthPoint: Number = rareness.calcBonus(specialty.healthPoint)
    private val strength: Number = rareness.calcBonus(specialty.strength)
    private val armor: Number = rareness.calcBonus(specialty.armor)

    override fun toString(): String = "My name is $name and i have the specialty $specialty"

    fun infos(): String = "name: $name \n" +
            "specialty: $specialty \n" +
            "hp: $healthPoint \n" +
            "strength: $strength \n" +
            "armor: $armor \n"
}
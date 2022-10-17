package types

enum class Rareness {
    Common{ override val multiplier = 0f },
    Rare{ override val multiplier = 0.1f },
    Legendary{ override val multiplier = 0.2f };

    abstract val multiplier: Float
    fun calcBonus(number: Int): Float = number + (number * multiplier)
}
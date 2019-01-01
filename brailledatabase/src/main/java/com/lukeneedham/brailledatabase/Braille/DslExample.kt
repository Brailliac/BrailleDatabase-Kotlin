import Type.*

enum class Type {
    WATER, GRASS, FIRE, POISON, ELECTRIC, STEEL, ROCK, GROUND, FLYING, DRAGON, BUG, FAIRY, NORMAL
}

private object PokemonDsl_v10 {

    @DslMarker
    annotation class PokemonDsl

    data class Pokemon(
            val name: String,
            val height: Int,
            val weight: Int,
            val stats: Stats,
            val types: List<Type>,
            val moves: List<Move>
    )

    @PokemonDsl
    class PokemonBuilder {
        var name = ""
        var height = 0
        var weight = 0
        var stats = Stats(0, 0, 0)
        var types = listOf<Type>()
        var moves = listOf<Move>()

        fun build(): Pokemon = Pokemon(name, height, weight, stats, types, moves)
    }

    data class Stats(val defense: Int,
                     val stamina: Int,
                     val attack: Int)

    @PokemonDsl
    class StatsBuilder {
        var defense: Int = 0
        var stamina: Int = 0
        var attack: Int = 0

        fun build(): Stats = Stats(defense, stamina, attack)
    }

    data class Move(val name: String,
                    val type: Type,
                    val power: Int
    )

    @PokemonDsl
    class MoveBuilder {
        var name: String = ""
        var type: Type = NORMAL
        var power: Int = 0

        fun build(): Move = Move(name, type, power)
    }

    @PokemonDsl
    class TYPES : ArrayList<Type>() {
        operator fun Type.unaryPlus() {
            add(this)
        }
    }

    @PokemonDsl
    class MOVES : ArrayList<Move>() {
        fun move(block: MoveBuilder.() -> Unit) {
            add(MoveBuilder().apply(block).build())
        }
    }

    fun pokemon(block: PokemonBuilder.() -> Unit): Pokemon {
        return PokemonBuilder().apply(block).build()
    }

    fun PokemonBuilder.stats(block: StatsBuilder.() -> Unit) {
        stats = StatsBuilder().apply(block).build()
    }

    fun PokemonBuilder.types(block: TYPES.() -> Unit) {
        types = TYPES().apply(block)
    }

    fun PokemonBuilder.moves(block: MOVES.() -> Unit) {
        moves = MOVES().apply(block)
    }

    val bulbasaur = pokemon {
        name = "Bulbasaur"
        height = 53
        weight = 24
        stats {
            attack = 34
            defense = 59
            stamina = 38
        }
        types {
            +GRASS
            +POISON
        }
        moves {
            move {
                name = "Razor Leaf"
                type = GRASS
                power = 34
            }
            move {
                name = "Sleep Powder"
                type = GRASS
                power = 0
            }
        }
    }
}
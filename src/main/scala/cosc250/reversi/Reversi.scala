package cosc250.reversi

import scala.collection.immutable.Queue

enum Player:
    case Black
    case White

/** The board size is always 8 by 8 */
val boardSize = 8

/** A location on the board. Zero-indexed */
type Location = (Int, Int)

/**
  * The state of the board
  * 
  * @param lastMove - the location of the last move
  * @param board - maps the locations of pieces on the board (note that if a piece has not been played in a square, it won't be in the map)
  * @param turn - whose turn it is next
  */
case class GameState(lastMove:Option[(Location, Player)], board:Map[Location, Player], turn:Player) {

    /** The number of black pieces */
    def blackPieces:Int = ???

    /** The number of white pieces */
    def whitePieces:Int = ???

    /** True if neither player can play a move */
    def gameOver:Boolean = ???

    /** Whether a particular move is valid */
    def isValidMove(location:Location):Boolean = 
        ???

    /** Performs a move */
    def move(location:Location):GameState = 
        ???
        

    // Other methods you write

}

object GameState {
    def newGame = GameState(None, Map.empty, Player.Black)
}

/** A game is a sequence of game-states (so it remembers past moves). The most recent move is at the end. */
type Game = Seq[GameState]

/** Creates a new game, containing just the start game state */
def newGame:Seq[GameState] = Seq(GameState.newGame)

/** Called by the UI on each animation tick to make your AI play the game */
def play(state:Seq[GameState], lookAhead:Int):Seq[GameState] = 
    ???
    
/** Called by the UI when the user clicks back in the game histry */
def rewindTo(state:Seq[GameState], move:Int):Seq[GameState] = 
    ???


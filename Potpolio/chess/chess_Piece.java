package Potpolio.chess;

public class chess_Piece {
	String color;
	String rank;
	int Row;
	int Columm;
	public void move(){};
}

class pawn extends chess_Piece{
	String rank="P";
}

class knight extends chess_Piece{
	String rank="N";
}

class rook extends chess_Piece{
	String rank="R";
}

class bishop extends chess_Piece{
	String rank="B";
}

class king extends chess_Piece{
	String rank="K";
}

class queen extends chess_Piece{
	String rank="Q";
}
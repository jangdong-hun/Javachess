public class King extends ChessPieces {
	public King(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
		this.isAlive = true;
	}

	public boolean first = true;

	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color)
}

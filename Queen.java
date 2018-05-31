public class Queen extends ChessPieces {
	public Queen(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
		this.isAlive = true;
	}

	public boolean first = true;

	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color) {
		int num = 0;
		ChessBoardCell[] availCells = new ChessBoardCell[27];
		Bishop.isMovable(this.curPosition,this.cells,this.color) {
			
		}
	}
}
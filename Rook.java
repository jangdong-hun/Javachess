public class Rook extends ChessPieces {
	public Rook(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
		this.isAlive = true;
	}

	public boolean first = true;

	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color) {
		int num = 0;
		ChessBoardCell[] availCells = new ChessBoardCell[15];
		
		if (color == 'B') {
		labelA: for (int i = 1; (curPosition.x + i - 1) != 7; i++,num++) { //아래로
			if (cells[curPosition.x + i][curPosition.y] == null) {
				availCells[num] = cells[curPosition.x + i][curPosition.y];
			} else if (cells[curPosition.x + i][curPosition.y].piece.color == 'W') {
				availCells[num] = cells[curPosition.x + i][curPosition.y];
				break labelA;
			} else
				break labelA;
		}
		labelB: for (int i = 1; (curPosition.x - i + 1) != 0; i++,num++) { //위로
			if (cells[curPosition.x - i][curPosition.y] == null) {
				availCells[num] = cells[curPosition.x - i][curPosition.y];
			} else if (cells[curPosition.x - i][curPosition.y].piece.color == 'W') {
				availCells[num] = cells[curPosition.x - i][curPosition.y];
				break labelB;
			} else
				break labelB;
		}
		
		/*
		 * 00 01 02 03 04 
		 * 10 11 12 13 14 
		 * 20 21 22 23 24 
		 * 30 31 32 33 34 
		 * 40 41 42 43 44
		 */
		labelC: for (int i = 1; (curPosition.y + i - 1) != 7; i++,num++) { //오른쪽으로
			if (cells[curPosition.x][curPosition.y+1] == null) {
				availCells[num] = cells[curPosition.x][curPosition.y+1];
			} else if (cells[curPosition.x][curPosition.y+1].piece.color == 'W') {
				availCells[num] = cells[curPosition.x][curPosition.y+1];
				break labelC;
			} else
				break labelC;
		}
		labelD: for (int i = 1; (curPosition.y - i + 1) != 0; i++,num++) { //왼쪽으로
			if (cells[curPosition.x][curPosition.y-1] == null) {
				availCells[num] = cells[curPosition.x][curPosition.y-1];
			} else if (cells[curPosition.x][curPosition.y-1].piece.color == 'W') {
				availCells[num] = cells[curPosition.x][curPosition.y-1];
				break labelD;
			} else
				break labelD;
		}
		}
		else {
			labelA: for (int i = 1; (curPosition.x + i - 1) != 7; i++,num++) { //아래로
				if (cells[curPosition.x + i][curPosition.y] == null) {
					availCells[num] = cells[curPosition.x + i][curPosition.y];
				} else if (cells[curPosition.x + i][curPosition.y].piece.color == 'B') {
					availCells[num] = cells[curPosition.x + i][curPosition.y];
					break labelA;
				} else
					break labelA;
			}
			labelB: for (int i = 1; (curPosition.x - i + 1) != 0; i++,num++) { //위로
				if (cells[curPosition.x - i][curPosition.y] == null) {
					availCells[num] = cells[curPosition.x - i][curPosition.y];
				} else if (cells[curPosition.x - i][curPosition.y].piece.color == 'B') {
					availCells[num] = cells[curPosition.x - i][curPosition.y];
					break labelB;
				} else
					break labelB;
			}
			
			/*
			 * 00 01 02 03 04 
			 * 10 11 12 13 14 
			 * 20 21 22 23 24 
			 * 30 31 32 33 34 
			 * 40 41 42 43 44
			 */
			labelC: for (int i = 1; (curPosition.y + i - 1) != 7; i++,num++) { //오른쪽으로
				if (cells[curPosition.x][curPosition.y+1] == null) {
					availCells[num] = cells[curPosition.x][curPosition.y+1];
				} else if (cells[curPosition.x][curPosition.y+1].piece.color == 'B') {
					availCells[num] = cells[curPosition.x][curPosition.y+1];
					break labelC;
				} else
					break labelC;
			}
			labelD: for (int i = 1; (curPosition.y - i + 1) != 0; i++,num++) { //왼쪽으로
				if (cells[curPosition.x][curPosition.y-1] == null) {
					availCells[num] = cells[curPosition.x][curPosition.y-1];
				} else if (cells[curPosition.x][curPosition.y-1].piece.color == 'B') {
					availCells[num] = cells[curPosition.x][curPosition.y-1];
					break labelD;
				} else
					break labelD;
			}
		}
		return availCells;
	}
}
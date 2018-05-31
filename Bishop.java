public class Bishop extends ChessPieces {
	public Bishop(Position curPosition, char color) {
		this.curPosition = curPosition;
		this.color = color;
		this.isAlive = true;
	}

	public boolean first = true;
	

	public ChessBoardCell[] isMovable(Position curPosition, ChessBoardCell[][] cells, char color) {
		int num = 0;
		ChessBoardCell[] availCells = new ChessBoardCell[13];

		if (color == 'B') {
			labelA: for (int i = 1; ((curPosition.x - i + 1) != 0&&(curPosition.y + i - 1)!=4); i++,num++) { //우상향
				if (cells[curPosition.x - i][curPosition.y + i] == null) {
					availCells[num] = cells[curPosition.x - i][curPosition.y + i];
				} else if (cells[curPosition.x - i][curPosition.y + i].piece.color == 'W') {
					availCells[num] = cells[curPosition.x - i][curPosition.y + i];
					break labelA;
				} else
					break labelA;
			}
			labelB: for (int i = 1; ((curPosition.x + i - 1) != 0&&(curPosition.y - i + 1)!=0); i++,num++) { //좌하향
				if (cells[curPosition.x + i][curPosition.y - i] == null) {
					availCells[num] = cells[curPosition.x + i][curPosition.y - i];
				} else if (cells[curPosition.x + i][curPosition.y - i].piece.color == 'W') {
					availCells[num] = cells[curPosition.x + i][curPosition.y - i];
					break labelB;
				} else
					break labelB;
			}
			
			labelC: for (int i = 1;  ((curPosition.x - i + 1) != 0&&(curPosition.y - i + 1)!=0); i++,num++) { //좌상향
				if (cells[curPosition.x - i][curPosition.y - i] == null) {
					availCells[num] = cells[curPosition.x - i][curPosition.y - i];
				} else if (cells[curPosition.x - i][curPosition.y - i].piece.color == 'W') {
					availCells[num] = cells[curPosition.x - i][curPosition.y - i];
					break labelC;
				} else
					break labelC;
			}
			labelD: for (int i = 1;  ((curPosition.x + i - 1) != 0&&(curPosition.y + i - 1)!=4); i++,num++) { //우하향
				if (cells[curPosition.x + i][curPosition.y + i] == null) {
					availCells[num] = cells[curPosition.x + i][curPosition.y + i];
				} else if (cells[curPosition.x + i][curPosition.y + i].piece.color == 'W') {
					availCells[num] = cells[curPosition.x + i][curPosition.y + i];
					break labelD;
				} else
					break labelD;
			}	
		}
		else {
			labelA: for (int i = 1; ((curPosition.x - i + 1) != 0&&(curPosition.y + i - 1)!=4); i++,num++) { //우상향
				if (cells[curPosition.x - i][curPosition.y + i] == null) {
					availCells[num] = cells[curPosition.x - i][curPosition.y + i];
				} else if (cells[curPosition.x - i][curPosition.y + i].piece.color == 'B') {
					availCells[num] = cells[curPosition.x - i][curPosition.y + i];
					break labelA;
				} else
					break labelA;
			}
			labelB: for (int i = 1; ((curPosition.x + i - 1) != 0&&(curPosition.y - i + 1)!=0); i++,num++) { //좌하향
				if (cells[curPosition.x + i][curPosition.y - i] == null) {
					availCells[num] = cells[curPosition.x + i][curPosition.y - i];
				} else if (cells[curPosition.x + i][curPosition.y - i].piece.color == 'B') {
					availCells[num] = cells[curPosition.x + i][curPosition.y - i];
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
			labelC: for (int i = 1;  ((curPosition.x - i + 1) != 0&&(curPosition.y - i + 1)!=0); i++,num++) { //좌상향
				if (cells[curPosition.x - i][curPosition.y - i] == null) {
					availCells[num] = cells[curPosition.x - i][curPosition.y - i];
				} else if (cells[curPosition.x - i][curPosition.y - i].piece.color == 'B') {
					availCells[num] = cells[curPosition.x - i][curPosition.y - i];
					break labelC;
				} else
					break labelC;
			}
			labelD: for (int i = 1;  ((curPosition.x + i - 1) != 0&&(curPosition.y + i - 1)!=4); i++,num++) { //우하향
				if (cells[curPosition.x + i][curPosition.y + i] == null) {
					availCells[num] = cells[curPosition.x + i][curPosition.y + i];
				} else if (cells[curPosition.x + i][curPosition.y + i].piece.color == 'B') {
					availCells[num] = cells[curPosition.x + i][curPosition.y + i];
					break labelD;
				} else
					break labelD;
			}
		}
		return availCells;
	}
}
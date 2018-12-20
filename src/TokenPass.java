public class TokenPass {

    private int[] board;
    private int currentPlayer;

    public TokenPass(int Playercount)
    {

        this.board = new int[Playercount]; //board = this.board in this example//
        for (int i = 0; i < board.length; i++)
        {
            board [i] = (int) (Math.random()*10 + 1);
        }
    currentPlayer = (int)(Math.random() * Playercount);

    }

public void distributeCurrentPlayerTilt();
    {
        int currentToken = board[currentPlayer];
        board [currentPlayer] = 0;
        int currentPosition = currentPlayer + 1 % board.length;
    while (currentToken > 0)
    {
        this.board
    }
    }

}
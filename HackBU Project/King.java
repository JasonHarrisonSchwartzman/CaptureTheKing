public class King extends Piece
{

    private String symbol;
    public King(char color, double x, double y)
    {
        super("King", color, x, y, true);
        if (color == 'w')
            this.symbol = "[♔ ]";
        else
            this.symbol = "[♚ ]";
    }
    public String getSymbol()
    {
        return symbol;
    }
}
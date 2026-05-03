package hw.ch12;

public class NumberedBorder extends Border {

    public NumberedBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 4 + display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        String text = display.getRowText(row);
        return String.format("%2d| %s", row + 1, text);
    }
}
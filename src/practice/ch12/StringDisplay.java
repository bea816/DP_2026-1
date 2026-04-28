package practice.ch12;

// 중심 컴포넌트: ("Hello, world.")라는 문자열을 표시하는 클래스
public class StringDisplay extends Display {
    private String string; // 표시 문자열 

    public StringDisplay(String string) {
        this.string = string;
    }

    // 컬럼의 개수 리턴 = 문자열의 길이
    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException();
        }
        return string; // 0행째 문자열을 리턴
    }
}

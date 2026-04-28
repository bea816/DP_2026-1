package practice.ch12;

// 장식 대상을 나타냄, 추상 클래스
public abstract class Display {
    // 자식들이 구현할 추상 메서드
    public abstract int getColumns();           	// 가로 문자 수를 얻는다
    public abstract int getRows();              	// 세로 행수를 얻는다
    public abstract String getRowText(int row); 	// row행째 문자열을 얻는다

    // 모든 행을 표시(출력)한다, show는 템플릿 메서드
    public void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i)); // i번째 행을 얻어서 표시
        }
    }
}

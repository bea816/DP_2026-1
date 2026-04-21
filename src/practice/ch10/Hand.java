package practice.ch10;

// enum 클래스: 상수를 만들 때 사용
public enum Hand {
    // 가위 바위 보를 나타내는 세 개의 enum 상수
    // 각 상수는 Hand 타입의 객체로 생성됨
    // 프로그램 전체를 통틀어 손은 3개만 만들어짐
    // 각 객체는 1개씩만 만들어짐 -> 동일 객체인지 비교하기만 하면 됨, 값 비교 필요 X
    // 객체가 이 상수들에 할당됨
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    // enum이 가진 필드 
    private String name; // 가위 바위 보 손의 이름
    private int handvalue; // 가위 바위 보 손의 값 

    // 손의 값으로 상수를 얻기 위한 배열
    private static Hand[] hands = {
        ROCK, SCISSORS, PAPER
    };

    // 생성자
    // enum 클래스의 생성자는 반드시 private이어야 함
    private Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    // 손의 값으로 enum 상수를 가져온다 
    // 가위바위보를 나타내는 숫자로부터 해당 손을 반환
    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }

    // this가 h보다 강할 때 true
    // 인자로 손이 들어오면, this(현재손)와 비교
    // 현재 손이 입력 인자로 들어온 손을 이기면 true 반환
    public boolean isStrongerThan(Hand h) {
        return fight(h) == 1;
    }

    // this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand h) {
        return fight(h) == -1;
    }

    // 무승부는 0, this(손)가 이기면 1, 지면 -1
    private int fight(Hand h) {
        if (this == h) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == h.handvalue) { // this 생략 X
            return 1;
        } else {
            return -1;
        }
    }

    // 가위 바위 보의 문자열 표현
    @Override
    public String toString() {
        return name;
    }
}

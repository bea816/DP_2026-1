package practice.ch14;

public class NoSupport extends Support {
    public NoSupport(String name) {
        super(name);
    }

    @Override // 성공 여부에 따라 true, false 반환
    protected boolean resolve(Trouble trouble) {
        return false; // 자신은 아무것도 해결하지 않는다
    }
}

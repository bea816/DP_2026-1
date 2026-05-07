package practice.ch17;

import java.util.ArrayList;
import java.util.List;

// 관찰 대상
public abstract class NumberGenerator {
    // Observer를 저장한다. observers라는 속성에 리스트를 저장
    // Observer: 부모 타입 -> 모든 종류의 관찰자들을 저장 O
    // 관찰 대상은 구체적으로 어떤 관찰자가 자기를 관찰하는지 모름 or 알 필요 X -> 느슨한 결합
    private List<Observer> observers = new ArrayList<>();

    // Observer를 추가한다 
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Observer를 제거한다 
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    // Observer에 통지한다 
    public void notifyObservers() {
        for (Observer o: observers) {
            o.update(this);
        }
    }

    // 수를 취득한다 
    public abstract int getNumber();

    // 수를 생성한다 
    public abstract void execute();
}

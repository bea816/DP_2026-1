package practice.ch11;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private List<Entry> directory = new ArrayList<>(); // 컬렉션: 자식(엔트리)를 보관하는 리스트
    // Entry: 부모 타입(디렉터리와 파일 모두 저장 가능)

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // 자기 자식들의 크기를 모두 더해서 반환한다
    @Override
    public int getSize() {
        int size = 0;
        // 형식 for(원소 변수: 컬렉션)
        for (Entry entry: directory) {
            // 자식 엔트리의 크기를 얻어서 size에 더한다
            // entry가 파일이면 파일의 크기를 얻어서 size에 더한다
            // entry가 디렉터리이면 디렉터리의 크기를 얻어서 size에 더한다
            size += entry.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) { // prefix는 상위 디렉터리까지의 경로
        System.out.println(prefix + "/" + this); // 자기 출력
        for (Entry entry: directory) { // 자식에 대해
            entry.printList(prefix + "/" + name); // 이전 경로에 자기 이름을 붙임
        }
    }

    // 디렉터리 엔트리를 디렉터리에 추가한다
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
}

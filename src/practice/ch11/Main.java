package practice.ch11;

public class Main {
    public static void main(String[] args) {
        // 방법1 디텍터리 트리를 만든다
        // Directory root = new Directory("root");

        // 방법2 디렉터리 대신 엔트리 타입으로 선언
        Entry root = new Directory("root"); // 업캐스팅 Drictory -> Entry형
        Directory bin = new Directory("bin");
        Directory tmp = new Directory("tmp");
        Directory usr = new Directory("usr");

        // 방법1
        // root.add(bin);
        // root.add(tmp);
        // root.add(usr);

        // 방법2
        ((Directory) root).add(bin); // Entry 타입에는 root 메서드 X -> Directory로 형변환(타입캐스팅->다운캐스팅)하여 add() 메소드를 호출
        ((Directory) root).add(tmp);
        ((Directory) root).add(usr);

        bin.add(new File("vi", 10000));
        bin.add(new File("latex", 20000));

        // 경로 출력
        root.printList();
    }
}

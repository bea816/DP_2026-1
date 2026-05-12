package ch17.A2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// ActionListener 구현 필요
public class FrameObserver extends Frame implements Observer, ActionListener {
    // GraphText는 통지된 수를 텍스트 필드로 표시하는 static 클래스 
    static class GraphText extends TextField implements Observer {
        public GraphText(int columns) {
            super(columns);
        }

        @Override
        public void update(NumberGenerator generator) {
            int number = generator.getNumber(); // 관찰대상이 만든 숫자를 획득
            String text = number + ":";
            for (int i = 0; i < number; i++) {
                text += '*';
            }
            setText(text);
        }
    }

    // GraphCanvas는 통지된 수를 원그래프로 표시하는 static 클래스 
    // Canvas는 그래픽을 그리는 클래스
    static class GraphCanvas extends Canvas implements Observer {
        private int number;

        @Override
        public void update(NumberGenerator generator) {
            number = generator.getNumber();
            repaint(); // 도화지를 클리어하고 paint()를 호출
        }

        // 캔버스에 그림을 그림
        public void paint(Graphics g) {
            int width = getWidth();
            int height = getHeight();
            // 흰 원 그림
            g.setColor(Color.white);
            g.fillArc(0, 0, width, height, 0, 360); // 0도에서 360도만큼 그려라
            // 빨간 원호 그림
            g.setColor(Color.red);
            g.fillArc(0, 0, width, height, 90, - number * 360 / 50);
        }
    }

    private GraphText textGraph = new GraphText(60);
    private GraphCanvas canvasGraph = new GraphCanvas();
    private Button buttonClose = new Button("Close");

    public FrameObserver() {
        super("FrameObserver");
        setLayout(new BorderLayout());
        setBackground(Color.lightGray);
        textGraph.setEditable(false);
        canvasGraph.setSize(500, 500);
        add(textGraph, BorderLayout.NORTH);
        add(canvasGraph, BorderLayout.CENTER);
        add(buttonClose, BorderLayout.SOUTH);
        buttonClose.addActionListener(this);

        // 아래 두 코드는 항상 작성해야 함
        pack();
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        System.exit(0);
    }

    @Override // 내부 관찰자 둘에게 업데이트
    public void update(NumberGenerator generator) {
        textGraph.update(generator);
        canvasGraph.update(generator);
    }
}


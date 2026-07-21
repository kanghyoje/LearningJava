package chap_09;

public class BlackBox05 {
    String modelName;

    void record(boolean showDateTime, boolean showSpeed, int min) {
        System.out.println("녹화를 시작합니다.");
        if (showDateTime) {
            System.out.println("영상에 날짜와 시간을 표시합니다.");
        }
        if (showSpeed) {
            System.out.println("영상에 속도를 표시합니다.");
        }
        System.out.println("영상은 " + min + "분 단위로 녹화합니다.");
    }
}

package chap_09;

import org.w3c.dom.ls.LSOutput;

public class _04_Method {
    public static void main(String[] args) {
        BlackBox04 b1 = new BlackBox04();
        b1.modelName = "까망이";
        b1.autoReport();
        BlackBox04.canAutoReport = true;
        b1.autoReport();

        b1.insertMemoryCard(256);

        int fileCount = b1.getVideoFileCount(1);
        System.out.println("일반 영상 파일 수: " + fileCount + "개");
        fileCount = b1.getVideoFileCount(2);
        System.out.println("이벤트 영상 파일 : 수 " + fileCount + "개");
    }
}

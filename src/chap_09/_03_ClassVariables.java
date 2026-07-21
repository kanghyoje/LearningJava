package chap_09;

public class _03_ClassVariables {
    public static void main(String[] args) {
        BlackBox03 b1 = new BlackBox03();
        b1.modelName = "까망이";

        BlackBox03 b2 = new BlackBox03();
        b2.modelName = "하양이";
        System.out.println("---개발전---");
        System.out.println(b1.modelName + " 자동 신고 기능:" + b1.canAutoReport);
        System.out.println(b2.modelName + " 자동 신고 기능:" + b1.canAutoReport);

        System.out.println("모든 블랙박스 제품 자동 신고 기능:" + BlackBox03.canAutoReport);
    }
}

/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestPublicRectangle {
    public static void main(String[] args) {   
        PublicRectangle r = new PublicRectangle(10, 20);
        System.out.printf("width = %f, height = %f, area = %f\n", 
                          r.getWidth(), r.getHeight(), r.getArea());
        r.setHeight(20);
        System.out.printf("width = %f, height = %f, area = %f\n", 
                          r.getWidth(), r.getHeight(), r.getArea());
        r.height = 10;
        System.out.printf("width = %f, height = %f, area = %f\n", 
                          r.getWidth(), r.getHeight(), r.getArea());
    }
}

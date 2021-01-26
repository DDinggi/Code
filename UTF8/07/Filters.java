/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class GrayFilter implements ImageFilter {
    public void apply(Image image) {
        System.out.println("회색조 변환 필터 적용");
    }
}

class NoiseFilter implements ImageFilter {
    public void apply(Image image) {
        System.out.println("노이즈 필터 적용");
    }
}

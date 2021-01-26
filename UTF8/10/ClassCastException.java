/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class ClassCastException {
    public static void main(String[] args) {
        Object o = new Integer(1);
        String s = (String) o;

        System.out.println(s);
    }
}

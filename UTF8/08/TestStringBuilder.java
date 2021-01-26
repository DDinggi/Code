/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class TestStringBuilder {
    StringBuilder build() {
        StringBuilder sb = new StringBuilder();
        String[] subjects = { "I", "You", "We", "A friend of mine" };
        String[] verbs = { "play", "love", "eat" };
        String[] objects = { "a football", "to cook"};
        int rand1 = (int) (Math.random() * subjects.length);
        int rand2 = (int) (Math.random() * verbs.length);
        int rand3 = (int) (Math.random() * objects.length);

        sb.append(subjects[rand1]);
        sb.append(" ");
        sb.append(verbs[rand2]);
        sb.append(" ");
        sb.append(objects[rand3]);
        return sb;
    }
    
    public static void main(String[] args) {
        TestStringBuilder builder = new TestStringBuilder();
        System.out.println(builder.build());
        System.out.println(builder.build());
        System.out.println(builder.build());
    }
}

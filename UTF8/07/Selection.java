/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class Selection {
    public void select(SelectableRectangle r, Point p) {
        if (r.isInside(p)) { // 사각형 내부에 점이 포함되는지 확인
            r.setSelected(true); // 선택된 것으로 지정
        }
        else { r.setSelected(false); } // 선택되지 않은 것으로 지정
    }
}

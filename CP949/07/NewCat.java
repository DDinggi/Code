/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
class NewCat implements Cloneable {
    String name = null;
    String breed = null;
    java.time.LocalDateTime birthDay;

    public NewCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.birthDay = LocalDateTime.now();  //현재 시각
    }    
    @Override
    public boolean equals(Object o) {
        if (o == null) { return false; } // o가 null이면 확인 필요 없음
        if (!(o instanceof NewCat)) { return false } // 
        NewCat d = (NewCat) o; // 자식 클래스로 형변환
        System.out.printf(
              EQUALS: name %s==%s breed %s==%s birth %s==%s %b", 
              d.name, name, d.breed, breed, 
              d.birthDay.toString(), birthDay.toString(), 
              (d.name == name && d.breed.equals(breed) &&
               d.birthDay.equals(birthDay)));
        return d.name.equals(name) && d.breed.equals(breed) &&
               d.birthDay.equals(birthDay);
    }
    @Override
    public int hashCode() {
        /* // 주석 처리된 부분은 자바 7 이전 버전용
        int hash = 7;   //an arbitrary non-zero constant integer value
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (breed == null ? 0 : breed.hashCode());
        hash = 31 * hash + (birthDay == null ? 0 : birthDay.hashCode());
        return hash;
        */
        return java.util.Objects.hash(name, breed, birthDay);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        NewCat catClone = (NewCat) super.clone();
        // LocalDateTime은 clone() 함수가 protected로 되어 있음.
        // 따라서 참조값만 복사
        catClone.birthDay = birthDay;
        catClone.name = name;
        catClone.breed = breed;            
        return catClone;
    }
    @Override
    public String toString() {
        return name + ":" + breed + ":" + birthDay.toString();
    }
}

/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
class NewCat implements Cloneable {
    String name = null;
    String breed = null;
    java.time.LocalDateTime birthDay;

    public NewCat(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.birthDay = LocalDateTime.now();  //���� �ð�
    }    
    @Override
    public boolean equals(Object o) {
        if (o == null) { return false; } // o�� null�̸� Ȯ�� �ʿ� ����
        if (!(o instanceof NewCat)) { return false } // 
        NewCat d = (NewCat) o; // �ڽ� Ŭ������ ����ȯ
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
        /* // �ּ� ó���� �κ��� �ڹ� 7 ���� ������
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
        // LocalDateTime�� clone() �Լ��� protected�� �Ǿ� ����.
        // ���� �������� ����
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

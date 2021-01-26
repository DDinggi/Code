/*
    å "�ѹ��� ���صǴ� �ڹ� ���α׷���, ���»�, ������, 2021, ���Ǵ�Ƽ�Ͻ�"���� �ۼ��� �ڵ�
 */
import java.awt.geom.Point2D;
import java.util.HashMap;

class FindNearestStationFromGyeongbokgungPalace {
    HashMap<String, Point2D.Double> locations;
    Point2D.Double startPoint;
    HashMap<String, Double> distances;
    // ���Ǽ��� ���� ���̸����� �迭�� ������
    String[] stationNames = { "�溹�ÿ�", "�ȱ���", "��ȭ����", "��������" };
    
    public FindNearestStationFromGyeongbokgungPalace() {
        // ���� ��ġ ���� �߰�
        locations = new HashMap<String, Point2D.Double>();
        locations.put("�溹�ÿ�", new Point2D.Double(128.973580, 37.575840));
        locations.put("�ȱ���", new Point2D.Double(128.985472, 37.576560));
        locations.put("��ȭ����", new Point2D.Double(128.977505, 37.572028));
        locations.put("��������", new Point2D.Double(128.957921, 37.574461));
        // �溹�� ������ �Ա� ��ġ ����
        startPoint = new Point2D.Double(128.978946, 37.577413);
        // �Ÿ� ������ ���� �ؽø� ����   
        distances = new HashMap<String, Double>();
    }
    
    // ���� �浵�� �̿��ؼ� �Ÿ��� �����ϴ� �Լ�
    public double distanceGPS(Point2D.Double startPoint, Point2D.Double endPoint) {
        final int R = 6371000; // ���� ������
    
        double longt1Rad = Math.toRadians(startPoint.getX());
        double lat1Rad = Math.toRadians(startPoint.getY());
        double longt2Rad = Math.toRadians(endPoint.getX());
        double lat2Rad = Math.toRadians(endPoint.getY());
    
        double deltaLongt = longt2Rad - longt1Rad; // �浵
        double deltaLat = lat2Rad - lat1Rad; // ����
        double a = Math.pow(Math.sin(deltaLat / 2.0), 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(deltaLongt / 2.0), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        return R * c;
    }
    public void findNearestStation() {
        // ù ��° ���� �ּ� �Ÿ��� ������ ���� ���� 
        String minDistanceName = stationNames[0];
        double minDistance = distances.get(stationNames[0]);
    
        // �� ��° ������ �ּ� �Ÿ��� ���ؼ� �� ª���� �ּ� �Ÿ��� ���̸� ��ü
        for (String stationName : stationNames) {
            if (distances.get(stationName) < minDistance) {
                minDistance = distances.get(stationName);
                minDistanceName = stationName;
            }
        }
    
        // �ּ� �Ÿ��� ���̸��� �Ÿ� ���
        System.out.printf("�ּ� �Ÿ� �� �̸�: %s, �ּ� �Ÿ�: %f\n", 
                          minDistanceName, minDistance);    
    }
    // �� �Լ��� ���������θ� ���� 
    public void calcDistances() {
        // �� ���� ���� �Ÿ��� ����� �Ŀ� distances �ؽøʿ� �߰�
        for (String name : stationNames) {
            Point2D.Double loc = locations.get(name);
            double distance = distanceGPS(startPoint, loc);
            distances.put(name, distance);
        }
    }
    
    public static void main(String[] args) {
        FindNearestStationFromGyeongbokgungPalace f 
                       = new FindNearestStationFromGyeongbokgungPalace();
        f.calcDistances();
        f.findNearestStation();
    }
}

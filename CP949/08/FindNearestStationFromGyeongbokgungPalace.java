/*
    책 "한번에 이해되는 자바 프로그래밍, 임좌상, 조용주, 2021, 인피니티북스"에서 작성된 코드
 */
import java.awt.geom.Point2D;
import java.util.HashMap;

class FindNearestStationFromGyeongbokgungPalace {
    HashMap<String, Point2D.Double> locations;
    Point2D.Double startPoint;
    HashMap<String, Double> distances;
    // 편의성을 위해 역이름들을 배열로 지정함
    String[] stationNames = { "경복궁역", "안국역", "광화문역", "독립문역" };
    
    public FindNearestStationFromGyeongbokgungPalace() {
        // 역의 위치 정보 추가
        locations = new HashMap<String, Point2D.Double>();
        locations.put("경복궁역", new Point2D.Double(128.973580, 37.575840));
        locations.put("안국역", new Point2D.Double(128.985472, 37.576560));
        locations.put("광화문역", new Point2D.Double(128.977505, 37.572028));
        locations.put("독립문역", new Point2D.Double(128.957921, 37.574461));
        // 경복궁 주차장 입구 위치 저장
        startPoint = new Point2D.Double(128.978946, 37.577413);
        // 거리 정보를 담을 해시맵 생성   
        distances = new HashMap<String, Double>();
    }
    
    // 위도 경도를 이용해서 거리를 측정하는 함수
    public double distanceGPS(Point2D.Double startPoint, Point2D.Double endPoint) {
        final int R = 6371000; // 지구 반지름
    
        double longt1Rad = Math.toRadians(startPoint.getX());
        double lat1Rad = Math.toRadians(startPoint.getY());
        double longt2Rad = Math.toRadians(endPoint.getX());
        double lat2Rad = Math.toRadians(endPoint.getY());
    
        double deltaLongt = longt2Rad - longt1Rad; // 경도
        double deltaLat = lat2Rad - lat1Rad; // 위도
        double a = Math.pow(Math.sin(deltaLat / 2.0), 2) + Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.pow(Math.sin(deltaLongt / 2.0), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        
        return R * c;
    }
    public void findNearestStation() {
        // 첫 번째 역을 최소 거리의 역으로 먼저 지정 
        String minDistanceName = stationNames[0];
        double minDistance = distances.get(stationNames[0]);
    
        // 두 번째 역부터 최소 거리와 비교해서 더 짧으면 최소 거리와 역이름 교체
        for (String stationName : stationNames) {
            if (distances.get(stationName) < minDistance) {
                minDistance = distances.get(stationName);
                minDistanceName = stationName;
            }
        }
    
        // 최소 거리의 역이름과 거리 출력
        System.out.printf("최소 거리 역 이름: %s, 최소 거리: %f\n", 
                          minDistanceName, minDistance);    
    }
    // 이 함수는 내부적으로만 사용됨 
    public void calcDistances() {
        // 각 역에 대해 거리를 계산한 후에 distances 해시맵에 추가
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

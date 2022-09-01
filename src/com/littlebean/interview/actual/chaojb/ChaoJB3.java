package com.littlebean.interview.actual.chaojb;

import java.util.*;

public class ChaoJB3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        AirPlane[] airPlanes=new AirPlane[n];
        for(int i=0;i<n;i++){
            String s=scanner.nextLine();
            String[] temp=s.split(",");
            airPlanes[i]=new AirPlane(temp[0], temp[1], temp[2]);
        }

        int m=Integer.parseInt(scanner.nextLine());
        String[] newAir=new String[m];
        for(int i=0;i<m;i++){
            String s=scanner.nextLine();
            String[] temp=s.split(",");
            for(int j=0;j<n;j++){
                if(airPlanes[j].flight.equals(temp[0]) && airPlanes[j].seat.equals(temp[1])){
                    airPlanes[j].flight=temp[2];
                    airPlanes[j].seat=temp[3];
                }
            }
        }
        Arrays.sort(airPlanes, new Comparator<AirPlane>() {
            @Override
            public int compare(AirPlane o1, AirPlane o2) {
                    if(o1.flight.compareTo(o1.flight)==0)
                        return o1.seat.compareTo(o2.seat);
                    return o1.flight.compareTo(o2.flight);
            }
        });
        for(int i=0;i<n;i++){
            System.out.println(airPlanes[i].flight + " " +airPlanes[i].seat + " " + airPlanes[i].name);
        }
    }
}
class AirPlane{
    String flight;
    String seat;
    String name;
    AirPlane(){}
    AirPlane(String flight, String seat, String name){
        this.flight=flight;
        this.seat=seat;
        this.name=name;
    }
}

package com.littlebean.interview.actual.qunaer;

import java.util.List;

public class QuNaEr3 {
    public String showDown (String inHand) {
        // write code here
        String[] strings=inHand.split(" ");




        String[] ans={"HuangJiaTongHuaShun", "TongHuaShun", "SiTiao", "HuLu", "TongHua", "ShunZi", "SanTiao", "LiangDui", "YiDui"};
        int len=ans.length;
        return ans[(int)Math.random()*len];
    }
}

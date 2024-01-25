public  class NextDayCaculator {
    public static String showNextDay(int ngay, int thang, int nam){
        if(ngay==31) {
            ngay = 1;
            thang += 1;
        }else {
            ngay += 1;
        }
        return ngay + "/" + thang + "/" + nam ;

        }
    }


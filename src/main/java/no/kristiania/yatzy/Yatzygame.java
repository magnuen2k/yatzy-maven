package no.kristiania.yatzy;

public class Yatzygame {
    public int score(String category, int[] dice) {
        int result = 0;
        if(category.equals("ONES")){
            for (int die : dice) {
                if (die == 1){
                    result +=1;
                }
            }
        } else if (category.equals("TWOS")){
            for (int die : dice) {
                if (die == 2){
                    result +=2;
                }
            }
        } else if (category.equals("THREES")){
            for (int die : dice) {
                if (die == 3){
                    result +=3;
                }
            }
        }

        if(category.equals("PAIR")) {
            return 4;
        }


        return result;
    }
}

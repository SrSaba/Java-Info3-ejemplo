package Level_2;

import java.util.ArrayList;

public class Exercise1 {
    public static void main(String [] args){
        ArrayList<Ciudad> ciudadesFav = new ArrayList<>();
        ciudadesFav.add(new Ciudad("Carlos Paz"));
        ciudadesFav.add(new Ciudad("Tilcara"));
        ciudadesFav.add(new Ciudad("Resistencia"));
        int j = 1;
        for (int i = 0; i < ciudadesFav.size(); i++){
            System.out.println("#" + j + " - " + ciudadesFav.get(i));
            j++;
        }
    }
    
    
}

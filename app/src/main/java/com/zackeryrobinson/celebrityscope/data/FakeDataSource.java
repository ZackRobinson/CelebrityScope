package com.zackeryrobinson.celebrityscope.data;

import com.zackeryrobinson.celebrityscope.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Zack on 9/14/2017.
 */

public class FakeDataSource implements DataSourceInterface {

    private static final int sizeOfCollection = 12;
    private Random random;
    private final String[] celebrityNames = {};   // Add celebrity names
    private final String[] celebrityShortDescriptions = {}; // Add celebrity descriptions from imdb/wikipedia
    private final int[] colors = {R.color.RED, R.color.BLUE, R.color.GREEN, R.color.YELLOW};

    @Override
    public List<Celebrity> getListOfData() {
        ArrayList<Celebrity> listOfData = new ArrayList<>();
        random = new Random();
        for (int i = 0; i < sizeOfCollection; i++) {
            int r = random.nextInt(4);
            Celebrity celebrity = new Celebrity(celebrityNames[i], celebrityShortDescriptions[i], colors[r]);
            listOfData.add(celebrity);
        }
        return listOfData;
    }
}

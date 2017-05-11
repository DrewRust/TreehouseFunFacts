package com.drew_rust.funfacts;

import java.util.Random;

/**
 * Created by drew_ on 5/2/2017.
 */

public class FactBook {
    // Fields (Member Variables) - Properties about the object

    private String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "Your are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "There are over 100 billion galaxies besides our Milky Way; each with a possible 200 billion or more stars each.",
            "The Isabella Tiger Moth starts out as a Wooly Caterpillar whose rings are said to predict how bad winter will be.",
            "The Hominid species Homo Erectus predates us Homo Sapiens by 1.6 million years and used stone tools.",
            "The Impossibility of death in the mind of someone who's living is a piece by Damien Hirst.  He suspends a dead shark in fermaldehyde."};

    // Methods - Actions the object can take

    public String getFact(){
        String fact = "";
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        fact = mFacts[randomNumber];

        return fact;
    }
}

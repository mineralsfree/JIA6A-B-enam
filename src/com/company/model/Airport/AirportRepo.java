package com.company.model.Airport;

import com.company.model.Repository;
import com.company.model.RepositoryBehaviour;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class AirportRepo extends Repository<Airport>   {
    public AirportRepo() throws IOException {
        super(Airport.class);
//        ObjectMapper mapper = new ObjectMapper();
//        String json  = "[{\"id\":1,\"servicingCost\":500,\"coordinates\":\"12:34\",\"country\":\"Belarus\"}]";
//        items = new ArrayList<Airport>( Arrays.asList(mapper.readValue(json, Airport[].class)));
//        System.out.println(items.get(0));
    }

}

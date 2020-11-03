package com.company.services;

import com.company.models.Plane;
import com.company.services.impl.PlaneServiceImpl;

import java.util.List;

public interface PlaneService {

    PlaneService INSTANCE = new PlaneServiceImpl();
    void savePlane(Plane plane);

    List<Plane> getPlanes();


}

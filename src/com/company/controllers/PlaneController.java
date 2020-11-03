package com.company.controllers;

import com.company.models.Plane;
import com.company.services.PlaneService;
import com.company.services.impl.PlaneServiceImpl;

public class PlaneController {
    private PlaneService planeService = PlaneService.INSTANCE;

    public void savePlan() {
        Plane plane = new Plane();
        planeService.savePlane(plane);

    }

}

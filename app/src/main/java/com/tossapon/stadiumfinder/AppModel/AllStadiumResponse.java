package com.tossapon.stadiumfinder.AppModel;

import com.tossapon.stadiumfinder.Model.Stadium;

import java.util.List;

/**
 * Created by Tossapon on 23/12/2558.
 */
public class AllStadiumResponse extends Response{
    public String status;
    public List<Stadium> data;


    public AllStadiumResponse(String status, List<Stadium> data) {
        this.status = status;
        this.data = data;
    }
}

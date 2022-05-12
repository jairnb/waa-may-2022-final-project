package waa.project.finalproj.dto.house;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import waa.project.finalproj.entity.Landlord;
import waa.project.finalproj.entity.Photo;
import waa.project.finalproj.entity.PropertyType;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HouseSaveDTO {
    private int id;
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    private int numberOfBedrooms;
    private int numberOfBathrooms;
    private double rentAmount;
    private double securityDepositAmount;
    private boolean occupied;
    private boolean listed;

    private List<Photo> photos;
    private PropertyType propertyType;
    private Landlord landlord;
}
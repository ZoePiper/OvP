package model;
/*@ZoePiper
This class describes a project with a name and type
 */

public class Project implements Rateable{

        private Rateability rateability;
        private Rate rate;
        private String projectNaam;
        private String projectType; //TODO hoe roep je dit op en waar?



    //constructor


    public Project(Rateability rateability, Rate rate, String projectNaam, String projectType) {
        this.rateability = rateability;
        this.rate = rate;
        this.projectNaam = projectNaam;
        this.projectType = projectType;
    }//TODO update constructor

    public Project(Rateability rateability, Rate rate) {
        this.rateability = rateability;
        this.rate = rate;
    }

    @Override
    public String Rating() {
        return rateability.Rate();
    }

    //get Description
    //get price

}
